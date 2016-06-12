package sec.masterperiodictable.Data;

import android.text.Html;

import java.util.ArrayList;

import sec.masterperiodictable.R;

/**
 * <p/>
 * 주기율표에 들어가는 각 원자에 대한 정보를 가지고 있는 Class
 */
public class PeriodicTable {

    public static Atom[] periodicTableList = {
            new Atom(1, "", "", "", "", "", "", ""),
            new Atom(1, "수소", "hydrogen", "H", "1.00794", "-259.14", "-252.87"
                    , "지구상에 존재하는 가장 가벼운 원소로 무색·무미·무취의 기체다. " +
                    "주로 수소분자 H2로 이루어진다. 태양을 비롯한 우주에 수소가스 및 원자상태 " +
                    "수소의 존재가 인정된다. 수소는 연소하더라도 공해 물질을 내뿜지 않아 석탄, " +
                    "석유를 대체할 무공해 에너지원으로써 중시되고 있다."
            ),
            new Atom(2, "헬륨", "helium", "He", "4.002602", "-272.2", "-268.93", "원소주기율표 상에서 1주기 " +
                    "18족에 속하는 비활성 기체로 우주에서 수소 다음으로 많은 원소이다. " +
                    "단원자 기체로 반응성이 거의 없어 비활성 기체라고도 하며 색깔과 냄새가 없고 " +
                    "공기 중에 매우 적은 양이 존재한다."
            ),
            new Atom(3, "리튬", "Lithium", "Li", "6.941", "180.54", "1,341.85", "은백색 연질금속이지만 나트륨보다 " +
                    "단단하며 고체인 홑원소물질 중에서 가장 가볍다. " +
                    "불꽃반응에서 빨간색을 나타낸다."
            ),
            new Atom(4, "베릴륨", "Beryllium", "Be", "9.01218", "1280", "2970", "주기율표 제2족에 속하는 알칼리토금속으로" +
                    " 원자로의 감속재, 반사재로 쓰인다."
            ),
            new Atom(5, "붕소", "Boron", "B", "10.811", "2076", "3927", "자연계에 붕산 또는 붕산염으로서" +
                    " 널리 분포하며 동소체로 비결정성인 갈색 분말과 결정성인" +
                    " 흑색 고체가 존재한다."
            ),
            new Atom(6, "탄소", "Carbon", "C", "12.0107", "3830", "4730", "동소체로 비결정성 탄소, 결정성인 흑연, 다이아몬드가" +
                    " 있다. 수소, 산소 또는 질소 등과 공유결합을 안정적으로 쉽게 형성할 수 있어 " +
                    "생체분자의 기본요소로 사용되며 석탄과 석유의 주성분이다."
            ),
            new Atom(7, "질소", "Nitrogen", "N", "14.0067(2)", "-210", "-195.79", "원소주기율표 상에서 2주기 15족에 속하는 비금속 원소로" +
                    " 지구의 대기의 약 78% 정도를 차지하고 있으며 지구 생명체의 구성 성분이다. 상온에서 주로 이원자 분자(N2)를 이루고" +
                    " 냄새, 색깔, 맛이 없는 기체상태이다."
            ),
            new Atom(8, "산소", "Oxyzen", "O", "15.9994", "-218.79", "-182.95", "질량(mass)으로 지각에서 가장 풍부한 화학원소이며" +
                    " 우주에서 수소와 헬륨 다음 세 번째로 많은 원소이다. " +
                    "상온에서 이원자 분자(O2)로 존재하며 반응성이 커서 거의 모든 원소와 반응하여 산화물을 만든다."
            ),
            new Atom(9, "불소", "Fluorine", "F", "18.9984032", "-219.62", "-188.14", "불소는 플루오르(fluorine)로 불리는 강력한 " +
                    "할로겐 원소로서 불소 자체로는 존재하지 않고 자연계에서 화합물의 형태로 " +
                    "존재한다. 지각에는 약 250~750 ppm 정도의 농도로 존재하여 전체 구성 원소중 13 번째로 많으며, " +
                    "바닷물의 불소 이온 농도는 1.2~1.5 ppm정도 전체 구성 원소중 12번째로 많다."
            ),
            new Atom(10, "네온", "Neon", "Ne", "20.1797(6)", "-248.59", "-246.08", "단원자 분자 기체로 반응성이 거의 없어 " +
                    "비활성 기체라고도 하며 색깔과 냄새가 없고 공기 중에 적은 양이 존재한다."
            ),
            new Atom(11, "나트륨", "Natrium", "Na", "22.9898", "97.9", "877.5", "모든 동물에게 필요한 다량원소의 하나이며 " +
                    "생체내에서는 주로 세포외 전해질의 성분으로 1가의 양이온(Na＋)으로서 삼투 조절이나 " +
                    "세포내 pH의 조절 등의 항상성 유지나 신경전달에 있어 중요한 역할을 담당한다."
            ),
            new Atom(12, "마그네슘", "Magnesium", "Mg", "24.305", "650", "1100", "천연의 진정제로 정신 " +
                    "흥분 가라앉히는 작용"
            ),
            new Atom(13, "알루미늄", "Aluminium", "Al", "26.981", "660.32", "2519", "탄수화물 대사에 관여, " +
                    "에너지 생성 과정 중요 역할"
            ),
            new Atom(14, "규소", "Silicon", "Si", "28.0855", "1414", "3265", "암석권의 주요 " +
                    "구성성분으로 클라크수(지각 내의 존재량)는 산소에 이어 제2위로 많아 27.6%를 차지한다."
            ),
            new Atom(15, "인", "Phosprorus", "P", "30.974", "흰색인 44.2 / 검은인 610", "280.5", "자연상태에서 홑원소 상태로는 존재하지 않으며, " +
                    "여러 개의 동소체 흰색, 붉은색, 검은색 인이 존재한다."
            ),
            new Atom(16, "황", "Sulfur", "S", "32.065", "115.21", "444.6", "상온에서 주로노란색의 고체이며 연소할 때 푸른색 불꽃을 내면서 " +
                    "매우 강하고 지독한 냄새가 나는 이산화황(SO2)을 생성하며 많은 동소체와 동위원소가 존재한다."
            ),
            new Atom(17, "염소", "Chlorine", "Cl", "35.453", "-101.5", "-34.04", "전기음성도가 플루오린, 산소 다음으로 크고 자극적인 냄새가 나는 녹황색 기체이다." +
                    " 염소분자(Cl2)는 강력한 산화제이며 표백제로 쓰인다."
            ),
            new Atom(18, "아르곤", "Argon", "Ar", "39.948", "-189.35", "-185.85", "단원자 분자 기체로 반응성이 거의 없어 비활성 기체라고도 하며 " +
                    "공기 중에 0.94% 존재해 비활성기체 중에서 가장 많이 존재한다."
            ),
            new Atom(19, "칼륨", "Potassium", "K", "39.0983", "63.89", "758.8", "나트륨과 균형을 이루어 정상 혈압 유지 몸속 노폐물 처리, 에너지 대사 및 뇌기능 활성화"
            ),
            new Atom(20, "칼슘", "Calcium", "Ca", "40.078", "842", "1,484", "뼈와 치아의 구성 요소 근육, 신경 기능 조절, 혈액 응고에 도움"
            ),
    };

    public static String ion[] = {
            "",
            "+",
            "",
            "+",
            "2+",
            "3+",
            "",
            "3-",
            "2-",
            "-",
            "",
            "+",
            "2+",
            "3+",
            "",
            "3+",
            "2+",
            "+",
            "",
            "+",
            "2+"
    };


        public static boolean theme = false;


    // atomicView에 대한 ID값을 가지고 있는 Interger Array
    public static int[] viewId = {
            0,
            R.id.atomView1,
            R.id.atomView2,
            R.id.atomView3,
            R.id.atomView4,
            R.id.atomView5,
            R.id.atomView6,
            R.id.atomView7,
            R.id.atomView8,
            R.id.atomView9,
            R.id.atomView10,
            R.id.atomView11,
            R.id.atomView12,
            R.id.atomView13,
            R.id.atomView14,
            R.id.atomView15,
            R.id.atomView16,
            R.id.atomView17,
            R.id.atomView18,
            R.id.atomView19,
            R.id.atomView20,
    };

    public static int[][] buttonId = {
        {R.drawable.orange1,R.drawable.lightgray1,R.drawable.gray1,R.drawable.ionize1},
            {R.drawable.orange1,R.drawable.lightgray1,R.drawable.gray1,R.drawable.ionize1},
            {R.drawable.orange2,R.drawable.lightgray2,R.drawable.gray2,R.drawable.ionize2},
            {R.drawable.orange3,R.drawable.lightgray3,R.drawable.gray3,R.drawable.ionize3},
            {R.drawable.orange4,R.drawable.lightgray4,R.drawable.gray4,R.drawable.ionize4},
            {R.drawable.orange5,R.drawable.lightgray5,R.drawable.gray5,R.drawable.ionize5},
            {R.drawable.orange6,R.drawable.lightgray6,R.drawable.gray6,R.drawable.ionize6},
            {R.drawable.orange7,R.drawable.lightgray7,R.drawable.gray7,R.drawable.ionize7},
            {R.drawable.orange8,R.drawable.lightgray8,R.drawable.gray8,R.drawable.ionize8},
            {R.drawable.orange9,R.drawable.lightgray9,R.drawable.gray9,R.drawable.ionize9},
            {R.drawable.orange10,R.drawable.lightgray10,R.drawable.gray10,R.drawable.ionize10},
            {R.drawable.orange11,R.drawable.lightgray11,R.drawable.gray11,R.drawable.ionize11},
            {R.drawable.orange12,R.drawable.lightgray12,R.drawable.gray12,R.drawable.ionize12},
            {R.drawable.orange13,R.drawable.lightgray13,R.drawable.gray13,R.drawable.ionize13},
            {R.drawable.orange14,R.drawable.lightgray14,R.drawable.gray14,R.drawable.ionize14},
            {R.drawable.orange15,R.drawable.lightgray15,R.drawable.gray15,R.drawable.ionize15},
            {R.drawable.orange16,R.drawable.lightgray16,R.drawable.gray16,R.drawable.ionize16},
            {R.drawable.orange17,R.drawable.lightgray17,R.drawable.gray17,R.drawable.ionize17},
            {R.drawable.orange18,R.drawable.lightgray18,R.drawable.gray18,R.drawable.ionize18},
            {R.drawable.orange19,R.drawable.lightgray19,R.drawable.gray19,R.drawable.ionize19},
            {R.drawable.orange20,R.drawable.lightgray20,R.drawable.gray20,R.drawable.ionize20}
    };

    public static ArrayList<Integer> red;
    public static ArrayList<Integer> yellow;

}

