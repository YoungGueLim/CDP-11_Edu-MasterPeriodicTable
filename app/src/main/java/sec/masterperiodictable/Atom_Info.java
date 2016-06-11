package sec.masterperiodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import sec.masterperiodictable.Data.Atom;
import sec.masterperiodictable.Data.PeriodicTable;

public class Atom_Info extends Activity {

    public static String NUM = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atom__info);

        Intent intent = getIntent();
        int atomNumber = intent.getIntExtra(NUM, 0);

        // Symbol
        TextView symbol = (TextView) findViewById(R.id.symbolView);

        // Chemical Synthesis Formula
        TextView name = (TextView) findViewById(R.id.nameView);

        // Description
        TextView des = (TextView) findViewById(R.id.desView);

        Atom temp = PeriodicTable.periodicTableList[atomNumber];

        symbol.setText(temp.getSymbol());
        name.setText(temp.getK_name());

        String description = " " + temp.getDescript();
        description += "\n\n평균 원자량: " + temp.getAvg_atom();
        description += "\n녹는점: " + temp.getM_point() + ", 끓는점: " + temp.getB_point();

        des.setText(description);

        ArrayList<String> listString = new ArrayList<String>();

        for (int i = 1; i < PeriodicTable.periodicTableList.length; i++) {
            Atom atom = PeriodicTable.periodicTableList[i];
            listString.add(atom.getA_num() + " " + atom.getSymbol() + " " + atom.getK_name());
        }

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listString));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView symbol2 = (TextView) findViewById(R.id.symbolView);
                TextView name2 = (TextView) findViewById(R.id.nameView);
                TextView des2 = (TextView) findViewById(R.id.desView);

                Atom temp = PeriodicTable.periodicTableList[position + 1];

                symbol2.setText(temp.getSymbol());
                name2.setText(temp.getK_name());

                String description2 = " " + temp.getDescript();
                description2 += "\n\n평균 원자량: " + temp.getAvg_atom();
                description2 += "\n녹는점: " + temp.getM_point() + ", 끓는점: " + temp.getB_point();

                des2.setText(description2);
            }

        });
    }

}
