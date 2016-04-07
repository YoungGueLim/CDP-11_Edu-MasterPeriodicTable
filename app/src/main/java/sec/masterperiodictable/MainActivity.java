package sec.masterperiodictable;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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

public class MainActivity extends Activity {

    static public boolean ionizeButton = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPeriodicTable();
    }

    public void ionize(View v) {

        ButtonView buttonView;

        if (!ionizeButton) {
            initialize(v);

            ionizeButton = true;

            buttonView = (ButtonView) findViewById(R.id.btn_ionization);
            buttonView.setAllColor(Color.argb(255, 153, 255, 255));

            for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

                // 각 atomView에 ID 부여
                AtomView atomView = (AtomView) findViewById(PeriodicTable.viewId[i]);

                // 각 원소에 대한 주기율표 정보를 가져옴
                final Atom atom = PeriodicTable.periodicTableList[i];

                atomView.setIon(PeriodicTable.ion[i]);

                if (!PeriodicTable.ion[i].equals("")) {
                    atomView.setName(atom.getK_name() + " 이온");
                }

                atomView.setAllColor(Color.argb(255, 153, 255, 255));
                atomView.invalidate();
            }
        } else {
            ionizeButton = false;

            buttonView = (ButtonView) findViewById(R.id.btn_ionization);
            buttonView.setAllColor(Color.argb(255, 255, 255, 255));

            for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

                // 각 atomView에 ID 부여
                AtomView atomView = (AtomView) findViewById(PeriodicTable.viewId[i]);

                // 각 원소에 대한 주기율표 정보를 가져옴
                final Atom atom = PeriodicTable.periodicTableList[i];

                atomView.setAllColor(Color.argb(255, 255, 255, 255));
                atomView.setIon("");
                atomView.setName(atom.getK_name());
                atomView.invalidate();
            }
        }
    }

    public static MoleList moleList;

    private void initPeriodicTable() {
        moleList = new MoleList();

        for (Molecule molecule : moleList.getMlist()) {
            for (int atom : molecule.getA_key()) {
                PeriodicTable.periodicTableList[atom].addMlist(molecule.getKey());
            }
        }

        for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {

            // 각 atomView에 ID 부여
            AtomView atomView = (AtomView) findViewById(PeriodicTable.viewId[i]);

            // 각 원소에 대한 주기율표 정보를 가져옴
            final Atom atom = PeriodicTable.periodicTableList[i];

            atomView.setNumber(atom.getA_num());
            atomView.setName(atom.getK_name());
            atomView.setSymbol(atom.getSymbol());

            atomView.invalidate();

            //  Custom View 클릭 시 테두리 색이 변하는 것을 구현한 ClickListener
            atomView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (MainActivity.ionizeButton)
                        return;

                    AtomView tempView = (AtomView) findViewById(v.getId());

                    int atomNumber = tempView.getNumber();
                    int flag = PeriodicTable.periodicTableList[atomNumber].getFlag();

                    if (flag == 0) {        // 한 번 클릭 시 테두리 빨간색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(1);
                        tempView.setAllColor(Color.argb(255, 255, 153, 204));
                    } else if (flag == 1) { // 두 번째 클릭 시 테두리 노란색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(2);
                        tempView.setAllColor(Color.argb(255, 255, 255, 102));
                    } else if (flag == 2) { // 세 번째 클릭 시 테두리 흰색으로
                        PeriodicTable.periodicTableList[atomNumber].setFlag(0);
                        tempView.setAllColor(Color.argb(255, 255, 255, 255));
                    }

                    tempView.invalidate();
                }
            });

            // 보기 좋게 만들기

            // Custom View 길게 클릭 시 Alert Dialog 출력하고 해당 원소에 대한 상세 정보 출력
            atomView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {

                    AtomView tempView = (AtomView) findViewById(v.getId());

                    // 클릭한 원자 번호
                    int atomNumber = tempView.getNumber();

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
            AtomView tempView = (AtomView) findViewById(PeriodicTable.viewId[i]);

            tempView.setAllColor(Color.argb(255, 255, 255, 255));

            PeriodicTable.periodicTableList[i].setFlag(0);

            tempView.invalidate();
        }
    }

    public void search(View v) {
        int flag = 0;

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
