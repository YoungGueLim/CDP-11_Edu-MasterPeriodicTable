package sec.masterperiodictable;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.net.Inet4Address;
import java.util.ArrayList;

import sec.masterperiodictable.CustomView.AtomView;
import sec.masterperiodictable.CustomView.ButtonView;
import sec.masterperiodictable.Data.Atom;
import sec.masterperiodictable.Data.MoleList;
import sec.masterperiodictable.Data.Molecule;
import sec.masterperiodictable.Data.PeriodicTable;

/*
* Main Function
* */
public class MainActivity extends Activity {

    static public boolean ionizeButton = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this,SplashActivity.class);
        startActivity(intent);

        setContentView(R.layout.activity_main);

        Typeface font = Typeface.createFromAsset(this.getAssets(),"InterparkGothicBold.ttf");
        TextView temp = (TextView) findViewById(R.id.titleView);
        temp.setTypeface(font);

        initPeriodicTable();
    }

    // Ionizing
    public void ionize(View v) {

        ImageButton imageButton1;

        if (!ionizeButton) {
            initialize(v);

            ionizeButton = true;

            imageButton1 = (ImageButton) findViewById(R.id.btn_ionization);
            imageButton1.setBackgroundResource(R.drawable.ionize_btn);

            for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

                final ImageButton imageButton = (ImageButton) findViewById(PeriodicTable.viewId[i]);

                imageButton.setBackgroundResource(PeriodicTable.buttonId[i][3]);
            }
        } else {
            ionizeButton = false;

            imageButton1 = (ImageButton) findViewById(R.id.btn_ionization);
            imageButton1.setBackgroundResource(R.drawable.ionize_new_btn);

            for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

                final ImageButton imageButton = (ImageButton) findViewById(PeriodicTable.viewId[i]);

                imageButton.setBackgroundResource(PeriodicTable.buttonId[i][0]);
            }
        }
    }

    public static MoleList moleList;

    // Initialize Periodic Table
    private void initPeriodicTable() {
        moleList = new MoleList();

        for (Molecule molecule : moleList.getMlist()) {
            for (int atom : molecule.getA_key()) {
                PeriodicTable.periodicTableList[atom].addMlist(molecule.getKey());
            }
        }

        for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

            // Give ID for each atomView(각 atomView에 ID 부여)
            final ImageButton imageButton = (ImageButton) findViewById(PeriodicTable.viewId[i]);

            imageButton.setBackgroundResource(PeriodicTable.buttonId[i][0]);

            //  Custom View 클릭 시 테두리 색이 변하는 것을 구현한 ClickListener
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (MainActivity.ionizeButton)
                        return;

                    ImageButton tempButton = (ImageButton) findViewById(v.getId());

                    int atomNumber;

                    switch(v.getId()){
                        case R.id.atomView1 :
                            atomNumber = 1;
                            break;
                        case R.id.atomView2 :
                            atomNumber = 2;
                            break;
                        case R.id.atomView3 :
                            atomNumber = 3;
                            break;
                        case R.id.atomView4 :
                            atomNumber = 4;
                            break;
                        case R.id.atomView5 :
                            atomNumber = 5;
                            break;
                        case R.id.atomView6 :
                            atomNumber = 6;
                            break;
                        case R.id.atomView7 :
                            atomNumber = 7;
                            break;
                        case R.id.atomView8 :
                            atomNumber = 8;
                            break;
                        case R.id.atomView9 :
                            atomNumber = 9;
                            break;
                        case R.id.atomView10 :
                            atomNumber = 10;
                            break;
                        case R.id.atomView11 :
                            atomNumber = 11;
                            break;
                        case R.id.atomView12 :
                            atomNumber = 12;
                            break;
                        case R.id.atomView13 :
                            atomNumber = 13;
                            break;
                        case R.id.atomView14 :
                            atomNumber = 14;
                            break;
                        case R.id.atomView15 :
                            atomNumber = 15;
                            break;
                        case R.id.atomView16 :
                            atomNumber = 16;
                            break;
                        case R.id.atomView17 :
                            atomNumber = 17;
                            break;
                        case R.id.atomView18 :
                            atomNumber = 18;
                            break;
                        case R.id.atomView19 :
                            atomNumber = 19;
                            break;
                        case R.id.atomView20 :
                            atomNumber = 20;
                            break;
                        default:
                            atomNumber = 1;
                    }

                    int flag = PeriodicTable.periodicTableList[atomNumber].getFlag();

                    if (flag == 0) {        // 한 번 클릭 시 테두리 빨간색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(1);
                        tempButton.setBackgroundResource(PeriodicTable.buttonId[atomNumber][1]);
                    } else if (flag == 1) { // 두 번째 클릭 시 테두리 노란색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(2);
                        tempButton.setBackgroundResource(PeriodicTable.buttonId[atomNumber][2]);
                    } else if (flag == 2) { // 세 번째 클릭 시 테두리 흰색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(0);
                        tempButton.setBackgroundResource(PeriodicTable.buttonId[atomNumber][0]);
                    }
                }
            });

            // 보기 좋게 만들기

            // Custom View 길게 클릭 시 Alert Dialog 출력하고 해당 원소에 대한 상세 정보 출력
            imageButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    ImageButton tempButton = (ImageButton) findViewById(v.getId());

                    int atomNumber;

                    switch(v.getId()){
                        case R.id.atomView1 :
                            atomNumber = 1;
                            break;
                        case R.id.atomView2 :
                            atomNumber = 2;
                            break;
                        case R.id.atomView3 :
                            atomNumber = 3;
                            break;
                        case R.id.atomView4 :
                            atomNumber = 4;
                            break;
                        case R.id.atomView5 :
                            atomNumber = 5;
                            break;
                        case R.id.atomView6 :
                            atomNumber = 6;
                            break;
                        case R.id.atomView7 :
                            atomNumber = 7;
                            break;
                        case R.id.atomView8 :
                            atomNumber = 8;
                            break;
                        case R.id.atomView9 :
                            atomNumber = 9;
                            break;
                        case R.id.atomView10 :
                            atomNumber = 10;
                            break;
                        case R.id.atomView11 :
                            atomNumber = 11;
                            break;
                        case R.id.atomView12 :
                            atomNumber = 12;
                            break;
                        case R.id.atomView13 :
                            atomNumber = 13;
                            break;
                        case R.id.atomView14 :
                            atomNumber = 14;
                            break;
                        case R.id.atomView15 :
                            atomNumber = 15;
                            break;
                        case R.id.atomView16 :
                            atomNumber = 16;
                            break;
                        case R.id.atomView17 :
                            atomNumber = 17;
                            break;
                        case R.id.atomView18 :
                            atomNumber = 18;
                            break;
                        case R.id.atomView19 :
                            atomNumber = 19;
                            break;
                        case R.id.atomView20 :
                            atomNumber = 20;
                            break;
                        default:
                            atomNumber = 1;
                    }

                    Intent intent = new Intent(MainActivity.this, Atom_Info.class);
                    intent.putExtra(Atom_Info.NUM, atomNumber);
                    startActivity(intent);

                    return false;
                }
            });
        }
    }

    public void initialize(View v) {
        if (MainActivity.ionizeButton)
            ionize(v);

        for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

            // 각 원자에 대한 id값을 AtomView에 할당해준다.
            ImageButton imageButton = (ImageButton) findViewById(PeriodicTable.viewId[i]);

            imageButton.setBackgroundResource(PeriodicTable.buttonId[i][0]);

            PeriodicTable.periodicTableList[i].setFlag(0);
        }
    }

    public void search(View v) {
        int flag = 0;

        PeriodicTable.red.clear();
        PeriodicTable.yellow.clear();

        ArrayList<Atom> redChecked = new ArrayList<Atom>();
        ArrayList<Atom> yellowChecked = new ArrayList<Atom>();

        // 체크된 것 확인
        for (Atom atom : PeriodicTable.periodicTableList) {
            if (atom.getFlag() == 1)
                redChecked.add(atom);
            else if (atom.getFlag() == 2)
                yellowChecked.add(atom);
        }

        ArrayList<Integer> temp;
        ArrayList<Integer> temp2;

        if (redChecked.size() == 0)
            flag = 1;
        else {
            temp = (ArrayList<Integer>) redChecked.get(0).getMlist().clone();

            for (Atom atom : redChecked) {
                temp2 = (ArrayList<Integer>) temp.clone();

                for (int sel : temp2) {
                    if (!atom.isThereAtom(sel)) {
                        temp.remove(Integer.valueOf(sel));
                    }
                }
                if (temp.size() == 0) {
                    flag = 1;
                    break;
                }
            }

            PeriodicTable.red = temp;
        }

        if (yellowChecked.size() == 0) {
            flag++;
        } else {
            temp = (ArrayList<Integer>) yellowChecked.get(0).getMlist().clone();
            for (Atom atom : yellowChecked) {
                temp2 = (ArrayList<Integer>) temp.clone();

                for (int sel : temp2) {
                    if (!atom.isThereAtom(sel)) {
                        temp.remove(Integer.valueOf(sel));
                    }
                }

                if (temp.size() == 0) {
                    flag++;
                    break;
                }
            }

            PeriodicTable.yellow = temp;
        }

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra(ResultActivity.NO, flag);
        startActivity(intent);
    }

    public void setting(View v) {
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }

    public void help(View v) {
        Intent intent = new Intent(MainActivity.this, HelpActivity.class);
        startActivity(intent);
    }

}
