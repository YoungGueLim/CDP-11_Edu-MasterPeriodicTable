package sec.masterperiodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

public class ObjectReaderActivity extends RendererActivity implements GestureDetector.OnGestureListener {

    private Object3dContainer molecule;
    //private AnimationObject3d molecule;
    private int screenWidth = 0;
    private int screenHeight = 0;

    private GestureDetector gd;
    private float verticalRotation = 0;
    private float horizontalRotation = 0;

    @Override
    public void initScene() {
        Light myLight = new Light();
        myLight.diffuse.setAll(10, 10, 10, 255);
        scene.lights().add(myLight);

        Log.d("moleType1","11111111111");
        Intent intent_ora = getIntent();
        String moleType = intent_ora.getStringExtra("MoleType");
        Log.d("moleType",moleType);

        IParser myParser = Parser.createParser(Parser.Type.OBJ, getResources(),
                "sec.masterperiodictable:raw/" + moleType, true);
        myParser.parse();

        molecule = myParser.getParsedObject();
        molecule.position().x = molecule.position().y = molecule.position().z = 0;
        molecule.scale().x = molecule.scale().y = molecule.scale().z = 0.03F;
        molecule.lineSmoothing(true);

        scene.addChild(molecule);

        screenHeight = getResources().getDisplayMetrics().heightPixels;
        screenWidth = getResources().getDisplayMetrics().widthPixels;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gd = new GestureDetector(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            verticalRotation = 0;
            horizontalRotation = 0;
            return true;
        }

        return gd.onTouchEvent(event);
    }

    @Override
    public void updateScene() {
        molecule.rotation().x -= verticalRotation;
        molecule.rotation().y -= horizontalRotation;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        molecule.scale().x += 0.01F;
        molecule.scale().y += 0.01F;
        molecule.scale().z += 0.01F;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        horizontalRotation = distanceX / 5;
        verticalRotation = distanceY / 5;
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        molecule.scale().x = molecule.scale().y = molecule.scale().z = 0.03F;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

}
