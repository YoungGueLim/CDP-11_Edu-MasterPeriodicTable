package sec.masterperiodictable;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import sec.masterperiodictable.Data.Atom;
import sec.masterperiodictable.Data.MoleList;
import sec.masterperiodictable.Data.PeriodicTable;

public class ResultActivity extends Activity {

    public static String NO = "NO";

    public static ArrayList<Integer> arrayList;

    private int location = 0;

    private Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Typeface font = Typeface.createFromAsset(this.getAssets(),"InterparkGothicBold.ttf");

        final Intent intent = getIntent();
        int flag = intent.getIntExtra(NO, 2);

        final TextView textView1 = (TextView) findViewById(R.id.resultSymbolView);
        TextView textView2 = (TextView) findViewById(R.id.resultFormulaView);
        TextView textView3 = (TextView) findViewById(R.id.resultDesView);

        textView1.setTypeface(font);
        textView2.setTypeface(font);
        textView3.setTypeface(font);

        textView2.setMovementMethod(new ScrollingMovementMethod());
        textView3.setMovementMethod(new ScrollingMovementMethod());

        arrayList = new ArrayList<Integer>();
        ArrayList<String> arrayList2 = new ArrayList<String>();

        if (PeriodicTable.red != null)
            for (int num : PeriodicTable.red) {
                arrayList.add(num);
            }

        if (PeriodicTable.yellow != null)
            for (int num : PeriodicTable.yellow) {
                arrayList.add(num);
            }

        if (flag == 2) {
            textView1.setText("");
            textView2.setText("");
            textView3.setText("");
        } else {
            for (int set : arrayList) {
                arrayList2.add(MainActivity.moleList.getMlist().get(set).getK_name());
            }

            Button button = (Button) findViewById(R.id.modelButton);

            ListView listView = (ListView) findViewById(R.id.resultListView);
            listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList2));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    TextView sym = (TextView) findViewById(R.id.resultSymbolView);
                    TextView formula = (TextView) findViewById(R.id.resultFormulaView);
                    TextView des = (TextView) findViewById(R.id.resultDesView);

                    String temp2 = MainActivity.moleList.getMlist().get(arrayList.get(position)).getM_for() + "\n" +
                            MainActivity.moleList.getMlist().get(arrayList.get(position)).getK_name();

                    sym.setText(Html.fromHtml(temp2));
                    formula.setText(Html.fromHtml(MainActivity.moleList.getMlist().get(arrayList.get(position)).getC_for()));
                    des.setText(Html.fromHtml(MainActivity.moleList.getMlist().get(arrayList.get(position)).getDes()));

                    location = position;
                }
            });

            TextView textView4 = (TextView) findViewById(R.id.resultTextView);
            textView4.setText("");

            String temp2 = MainActivity.moleList.getMlist().get(arrayList.get(0)).getM_for() + "\n" +
                    MainActivity.moleList.getMlist().get(arrayList.get(0)).getK_name();

            textView1.setText(Html.fromHtml(temp2));
            textView2.setText(Html.fromHtml(MainActivity.moleList.getMlist().get(arrayList.get(0)).getC_for()));
            textView3.setText(Html.fromHtml(MainActivity.moleList.getMlist().get(arrayList.get(0)).getDes()));

            Log.d("tag",MainActivity.moleList.getMlist().get(arrayList.get(0)).getK_name());

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intent1 = new Intent(getApplicationContext(), ObjectReaderActivity.class);
                    if(textView1.getText().toString().contains("물")){
                        Log.d("물","물");
                        intent1.putExtra("MoleType","tes_obj");
                    }else if(textView1.getText().toString().contains("포도당"))
                    {
                        Log.d("포도당","포도당");
                        intent1.putExtra("MoleType","glucose_obj");
                    }else if(textView1.getText().toString().contains("암모니아"))
                    {
                        Log.d("암모니아","암모니아");
                        intent1.putExtra("MoleType","ammonia_obj");
                    }else if(textView1.getText().toString().contains("메탄"))
                    {
                        Log.d("메탄","메탄");
                        intent1.putExtra("MoleType","metan_obj");
                    }else if(textView1.getText().toString().contains("에탄"))
                    {
                        Log.d("에탄","에탄");
                        intent1.putExtra("MoleType","ethane_obj");
                    }else if(textView1.getText().toString().contains("아세트아미노펜"))
                    {
                        Log.d("아세트아미노펜","아세트아미노펜");
                        intent1.putExtra("MoleType","tylenol_obj");
                    }else{
                        Log.d("물","물");
                        intent1.putExtra("MoleType","tes_obj");
                        Log.d("False","False11");
                    }
                    startActivity(intent1);
                }
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        intent1 = null;

    }

    @Override
    protected void onStop() {
        super.onStop();
        intent1 = null;
    }
}
