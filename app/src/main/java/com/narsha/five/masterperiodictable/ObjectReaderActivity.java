package com.narsha.five.masterperiodictable;

import android.util.Log;
import android.view.MotionEvent;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

public class ObjectReaderActivity extends RendererActivity {

    private Object3dContainer molecule;

    @Override
    public void initScene() {
        scene.lights().add(new Light());
        scene.lights().add(new Light());
        scene.lights().add(new Light());
        scene.lights().add(new Light());

        Light myLight = new Light();
        myLight.position.setZ(300);
        scene.lights().add(myLight);

        IParser myParser = Parser.createParser(Parser.Type.OBJ, getResources(),
                "com.narsha.five.masterperiodictable:raw/testing_model_obj", true);
        myParser.parse();

        molecule = myParser.getParsedObject();
        molecule.position().x = molecule.position().y = molecule.position().z = 0;
        molecule.scale().x = molecule.scale().y = molecule.scale().z = 0.0003F;

        scene.addChild(molecule);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float xPos = 0, yPos = 0, xd = 0, yd = 0, tempX, tempY;

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xPos = event.getX();
                yPos = event.getY();

                // Log.i("Distance", xPos + ", " + yPos);

                break;

            case MotionEvent.ACTION_MOVE:
                tempX = event.getX();
                tempY = event.getY();
                xd = tempX - xPos;
                yd = tempY - yPos;
                xPos = tempX;
                yPos = tempY;

                // Log.i("Distance", xPos + ", " + yPos);

                verticalRotation = yd / 1000;
                horizontalRotation = xd / 1000;

                // Log.i("Rotation", verticalRotation + ", " + horizontalRotation);

                break;

            case MotionEvent.ACTION_UP:
                verticalRotation = 0;
                horizontalRotation = 0;
                break;
        }

        return super.onTouchEvent(event);
    }

    private float verticalRotation = 0;
    private float horizontalRotation = 0;

    @Override
    public void updateScene() {
        Log.i("horizontalRotation", horizontalRotation + "")  ;
        molecule.rotation().x -= verticalRotation;
    }

    private float getVirtualX(float xPos) {
        return 0;
    }

    private float getVirtualY(float yPos) {
        return 0;
    }

}
