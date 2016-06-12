package sec.masterperiodictable;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView textView = (TextView) findViewById(R.id.helpTextView);
        Typeface font = Typeface.createFromAsset(this.getAssets(),"InterparkGothicBold.ttf");
        textView.setTypeface(font);
        textView.setText("1. 주기율표의 원소를 오래 누르면 해당 원소의 정보를 볼 수 있습니다.\n\n" +
                        "2. 주기율표의 원소들을 짧게 클릭하여 클릭된 원소들을 포함하는 화합물을 검색할 수 있습니다." +
                        " 주기율표의 원소를 짧게 한번 클릭하면 붉은 색으로 표시되고, 주기율표의 원소를 짧게 한번 더 클릭하면" +
                        " 노란색으로 표시됩니다. 그 상태에서 짧게 한번 더 클릭하면 해당 원소의 체크가 해제됩니다. 또한" +
                        " 초기화 버튼을 눌러 모든 원소의 체크를 해제할 수 있습니다.\n\n" +
                        "3. 주기율표의 색깔이 같은 것을 한꺼번에 묶어서 검색할 수 있습니다. " +
                        "예를 들어 수소와 산소를 붉은색으로 체크하고 질소를 노란색으로 체크한 후에 검색 버튼을 누르면, " +
                        "수소와 산소가 같이 들어가 있거나 질소가 들어가 있는 화합물을 검색합니다.\n\n" +
                        "4. 설정 버튼을 눌러 설정 화면으로 들어가면 어플의 테마를 변경하거나 '오늘의 화합물' 기능을 끄거나 편집할 수 있습니다." +
                        " '오늘의 화합물' 기능은 '오늘의 영어단어' 기능처럼 하루에 한번 혹은 설정된 시간마다 임의의 화합물의 정보를 알려주는 기능입니다.\n\n" +
                        "5. 이온화 버튼을 누르면 원소들의 이온화 상태를 볼 수 있습니다. 한번 더 누르면 원래대로 돌아갑니다."
        );
        textView.setTextColor(Color.WHITE);
    }

}
