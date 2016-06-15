package sec.masterperiodictable.Data;

import java.util.ArrayList;


public class MoleList {

    ArrayList<Molecule> mlist = new ArrayList<Molecule>();
    Molecule temp;
    private int count = 0;

    public MoleList() {
        temp = new Molecule(count++, "물", "H<sub><small>2</small></sub>O", "2H<sub><small>2</small></sub> " +
                "+ O<sub><small>2</small></sub> -> 2H<sub><small>2</small></sub>O");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.setDes("상온에서 색·냄새·맛이 없는 액체. 화학적으로는 산소와 수소의 결합물이며, 천연으로는 도처에 바닷물·강물·지하수·우물물·빗물·온천수·수증기·눈·얼음 등으로 존재한다");
        mlist.add(temp);

        temp = new Molecule(count++, "염화수소", "HCl", "H<sup><small>+</small></sup> " +
                "+ Cl<sup><small>-</small></sup> -> HCl");
        temp.add_Key(1);
        temp.add_Key(17);
        temp.setDes("화학식 HCl. 상온에서 자극적인 냄새가 나는 무색 기체. 알코올 ·에테르 ·벤젠 등에도 잘 녹는다. 주로 염산으로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "질산", "HNO<sub><small>3</small></sub>", "H<sup><small>+</small></sup> " +
                "+ NO<sup><small>3-</small></sup> -> HNO<sub><small>3</small></sub>");
        temp.add_Key(1);
        temp.add_Key(7);
        temp.add_Key(8);
        temp.setDes("밀도가 1.50 g/㎤(25℃)로서 매우 강한 산의 하나이며 빛을 쬐면 분해되어 물과 이산화질소, 그리고 산소를 만든다. 따라서 질산은 빛이 투과되지 않는 갈색병에 넣어 햇빛이 비치지 않는 곳에 보관해야 한다. 질산은 산화력이 강해 구리나 은 등을 녹인다.");
        mlist.add(temp);

        temp = new Molecule(count++, "황화칼륨", "K<sub><small>2</small></sub>SO<sub><small>4</small></sub>", "H<sub><small>2</small></sub>SO<sub><small>4</small></sub> " +
                "+ 2KOH -> K<sub><small>2</small></sub>SO<sub><small>4</small></sub> + 2H<sub><small>2</small></sub>O");
        temp.add_Key(8);
        temp.add_Key(16);
        temp.add_Key(19);
        temp.setDes("보통은 간단히 황화칼륨이라고 하면 일황화칼륨을 가리키며, 그외는 폴리황화칼륨이라 불린다.\n" +
                "수용액은 강한 알칼리성을 띠며 산으로 황화수소를 발생한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "탄산", "H<sub><small>2</small></sub>CO<sub><small>3</small></sub>", "HCO<sub><small>3</small></sub><sup><small>-</small></sup> " +
                "+ H<sup><small>+</small></sup> -> H<sub><small>2</small></sub>CO<sub><small>3</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(8);
        temp.setDes("이산화탄소가 물에 녹아서 생기는 산으로 수용액으로만 존재한다. 약산으로 청량음료 등에 사용한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "불화수소", "HF", "H<sub><small>2</small></sub> " +
                "+ F<sub><small>2</small></sub> -> 2HF");
        temp.add_Key(1);
        temp.add_Key(9);
        temp.setDes("자극적인 냄새가 있는 기체로서 독성이 강하다. 농도가 높은 기체는 피부를 통하여 내부에 침투하여 심한 통증을 주게 된다. 농도가 낮은 경우에는 만성 장해를 일으켜 간장, 위장을 해친다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화수소", "HCl", "H<sub><small>2</small></sub> " +
                "+ Cl<sub><small>2</small></sub> -> 2HCl");
        temp.add_Key(1);
        temp.add_Key(17);
        temp.setDes("화학식 HCl. 상온에서 자극적인 냄새가 나는 무색 기체. 알코올 ·에테르 ·벤젠 등에도 잘 녹는다. 진한 황산에 진한 염산을 떨어뜨려 발생시키거나, 식염과 진한 황산을 반응시켜서 만든다.");
        mlist.add(temp);

        temp = new Molecule(count++, "과염소산리튬", "LiClO<sub><small>4</small></sub>", "LiOH " +
                "+ HClO<sub><small>4</small></sub> -> LiClO<sub><small>4</small></sub> + H<sub><small>2</small></sub>O");
        temp.add_Key(3);
        temp.add_Key(8);
        temp.add_Key(17);
        temp.setDes("탄산리튬과 과염소산 수용액에 의해 얻어지는 3수화염을 건조 공기류 중에서 가열 탈수해서 만든다.");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화리튬", "LiOH", "Li<sub><small>2</small></sub>O " +
                "+ H<sub><small>2</small></sub>O -> 2LiOH");
        temp.add_Key(1);
        temp.add_Key(3);
        temp.add_Key(8);
        temp.setDes("무수물은 무색 정방정계의 결정이며 비중 1.43, 녹는점 445℃ , 끓는점 약 925℃ 이다." +
                "이산화탄소 흡수제, 리튬베이스그리스, 리튬비누 및 리튬화합물 제조의 원료, 사진현상약 등으로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화리튬", "LiCl", "2Li " +
                "+ Cl<sub><small>2</small></sub> -> 2LiCl");
        temp.add_Key(3);
        temp.add_Key(17);
        temp.setDes("리튬이온과 염화이온의 이온결합물질이다. 조해성이 있어 공기 중에서 수분을 흡수하여 녹는다. 이를 이용하여 염화리튬습도계가 제작되어 시판되고 있다.");
        mlist.add(temp);

        temp = new Molecule(count++, "불화리튬", "LiF", "2Li " +
                "+ F<sub><small>2</small></sub> -> 2LiF");
        temp.add_Key(3);
        temp.add_Key(8);
        temp.setDes("플루오르화수소산에 탄산리튬을 더하여, 증발 건고 후 적열해서 얻을 수 있다. 또 리튬염 용액에 플루오르화칼륨 용액을 더하여 침전으로 얻을 수 있다.");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화리튬", "LiH", "2Li " +
                "+ H<sub><small>2</small></sub> -> 2LiH");
        temp.add_Key(1);
        temp.add_Key(3);
        temp.setDes("강한 염기이고 공기 속에서 이산화탄소를 흡수한다." +
                "이산화탄소 흡수제, 리튬베이스그리스, 리튬비누 및 리튬화합물 제조의 원료, 사진현상약 등으로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "이산화탄소", "CO<sub><small>2</small></sub>", "C " +
                "+ O<sub><small>2</small></sub> -> CO<sub><small>2</small></sub>");
        temp.add_Key(6);
        temp.add_Key(8);
        temp.setDes("탄소나 그 화합물이 완전 연소하거나, 생물이 호흡 또는 발효(醱酵)할 때 생기는 기체. 대기의 약 0.035%를 차지한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "암모니아", "NH<sub><small>3</small></sub>", "N<sub><small>2</small></sub> " +
                "+ 3H<sub><small>2</small></sub> -> 2NH<sub><small>3</small></sub>");
        temp.add_Key(1);
        temp.add_Key(7);
        temp.setDes("고약한 냄새가 나고 약염기성을 띠는 질소와 수소의 화합물로서 물에 잘 녹는다. 비료 또는 요소 수지를 만드는데 쓰인다.");
        mlist.add(temp);

        temp = new Molecule(count++, "일산화질소", "NO", "N<sub><small>2</small></sub> " +
                "+ O<sub><small>2</small></sub> -> 2NO");
        temp.add_Key(1);
        temp.add_Key(7);
        temp.setDes("질소의 산화물. L-아르기닌에서 NO생성효소(nitric-oxide synthase; NOS)에 의해 L-시트룰린과 같이 생산된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "이산화질소", "NO<sub><small>2</small></sub>", "2NO " +
                "+ O<sub><small>2</small></sub> -> 2NO<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(7);
        temp.setDes("상온에서는 적갈색의 기체이지만 가열하면 적색이 짙어 냉각하면 황색으로 된다.  독성이 강하다.");
        mlist.add(temp);

        temp = new Molecule(count++, "아세트산", "CH<sub><small>3</small></sub>COOH", "2CH<sub><small>3</small></sub>CHO " +
                "+ O<sub><small>2</small></sub> -> 2CH<sub><small>3</small></sub>COOH");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(8);
        temp.setDes("살균 능력이 있어 대장균이나 포도상구균과 같이 식중독을 일으키는 세균을 죽임으로써 음식의 부패가 진행되는 것을 막아 준다. 중요한 카르복시산의 하나이다.");
        mlist.add(temp);

        temp = new Molecule(count++, "벤젠", "C<sub><small>6</small></sub>H<sub><small>6</small></sub>", "3C<sub><small>2</small></sub>H<sub><small>2</small></sub> " +
                "-> C<sub><small>6</small></sub>H<sub><small>6</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.setDes("대표적인 방향족 화합물로, 가연성이 있는 무색 액체이다\n" +
                "첨가제, 합성 세제 원료 및 각종 용제 등에 주로 쓰인다");
        mlist.add(temp);

        temp = new Molecule(count++, "과산화수소", "H<sub><small>2</small></sub>O<sub><small>2</small></sub>", "2H<sub><small>2</small></sub>O " +
                "+ O<sub><small>2</small></sub> -> 2H<sub><small>2</small></sub>O<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.setDes("수소와 산소의 화합물로 옅은 푸른색을 띠며 희석한 용액은 무색이고 물보다 점성이 큰 액체이다. 분석 시약의 산화제, 견사나 양모 등의 표백제, 플라스틱 공업에서 비닐 중합의 촉매로도 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화나트륨", "NaCl", "2Na " +
                "+ Cl<sub><small>2</small></sub> -> 2NaCl");
        temp.add_Key(11);
        temp.add_Key(17);
        temp.setDes("나트륨과 염소의 화합물.\n" +
                "바닷물에서 채취하는 경우 한국에서는 보통 염전법으로 채취하였으나, 이온교환수지를 사용하는 방법으로 대치하고 있다. 엄밀한 의미에서 염화나트륨을 주성분으로 하는 식용 소금과 순수화학약품으로서의 염화나트륨은 구분해야 한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화나트륨", "NaOH", "2Na " +
                "+ 2H<sub><small>2</small></sub>O -> 2NaOH + H<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(11);
        temp.setDes("대표적인 강염기로 공기 중에서 수증기를 흡수해 스스로 녹는 조해성이 있으므로 공기와의 접촉을 차단하여 보관해야 한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "탄산나트륨", "Na<sub><small>2</small></sub>CO<sub><small>3</small></sub>", "4Na " +
                "+ 3CO<sub><small>2</small></sub> -> 2Na<sub><small>2</small></sub>CO<sub><small>3</small></sub> + C");
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(11);
        temp.setDes("");
        mlist.add(temp);

        temp = new Molecule(count++, "산화나트륨", "Na<sub><small>2</small></sub>O", "4Na " +
                "+ O<sub><small>2</small></sub> -> 2Na<sub><small>2</small></sub>O");
        temp.add_Key(8);
        temp.add_Key(11);
        temp.setDes("백색 분말. 형석형 구조, 격자 상수 a 5.55Å. 400℃ 이상으로 가열하면 과산화나트륨과 나트륨으로 분해한다. d 2.27. 흡습성. 물과 심하게 반응하여 수산화나트륨을 생성한다. 이산화탄소를 흡수하여 탄산나트륨이 된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "나트륨에틸레이트", "C<sub><small>2</small></sub>H<sub><small>5</small></sub>ONa", "2Na " +
                "+ 2C<sub><small>2</small></sub>H<sub><small>5</small></sub>OH -> 2C<sub><small>2</small></sub>H<sub><small>5</small></sub>ONa + H<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(11);
        temp.setDes("에탄올의 하이드록시기의 수소를 금속으로 치환한 화합물이다.  금속을 에탄올에 녹이면 얻을 수 있다.");
        mlist.add(temp);

        temp = new Molecule(count++, "아세트산나트륨", "CH<sub><small>3</small></sub>COONa", "Na<sub><small>2</small></sub>O<sub><small>2</small></sub> " +
                "+ 2CH<sub><small>3</small></sub>COOH -> 2CH<sub><small>3</small></sub>COONa + H<sub><small>2</small></sub>O<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(11);
        temp.setDes("살균 능력이 있어 대장균이나 포도상구균과 같이 식중독을 일으키는 세균을 죽임으로써 음식의 부패가 진행되는 것을 막아 준다. 중요한 카르복시산의 하나이다.");
        mlist.add(temp);

        // 마그네슘

        temp = new Molecule(count++, "산화마그네슘", "MgO", "2Mg " +
                "+ CO<sub><small>2</small></sub> -> 2MgO + C");
        temp.add_Key(8);
        temp.add_Key(12);
        temp.setDes("염소와 마그네슘의 화합물. 마그네슘과 산소의 화합물로 공기 중에서 물 및 이산화탄소를 흡수하며 내화재료·촉매·흡착제·제산제 등으로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화마그네슘", "MgCl<sub><small>2</small></sub>", "Mg " +
                "+ 2HCL -> MgCl<sub><small>2</small></sub> + H<sub><small>2</small></sub>");
        temp.add_Key(12);
        temp.add_Key(17);
        temp.setDes("흡습성이 강하고, 물 ·알코올에 잘 녹는다. 무수물을 공업적으로 만드는 데는 산화마그네슘 MgO(마그네시아)에 탄소를 가하여 염소기체를 반응시키는데, 실험실에서는 염화마그네슘암모늄 MgCl2 ·NH4Cl ·6H2O를 열분해하여 만든다");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화마그네슘", "Mg(OH)<sub><small>2</small></sub>", "Mg " +
                "+ 2H<sub><small>2</small></sub>O -> Mg(OH)<sub><small>2</small></sub> + H<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(12);
        temp.setDes("마그네슘의 수산화물로 화학식은 Mg(OH)2이다. 100℃로 가열하면 수산화마그네슘인 채로 건조시킬 수 있으나, 그 이상으로 가열하면 물을 방출하면서 산화마그네슘 MgO가 된다. 물에는 거의 녹지 않지만, 묽은 산, 암모늄염 수용액 등에는 용해하며, 수용액은 알칼리성을 보인다");
        mlist.add(temp);

        temp = new Molecule(count++, "황산마그네슘", "MgSO<sub><small>4</small></sub>", "Mg " +
                "+ H<sub><small>2</small></sub>SO<sub><small>4</small></sub> -> MgSO<sub><small>4</small></sub> + H<sub><small>2</small></sub>");
        temp.add_Key(8);
        temp.add_Key(12);
        temp.add_Key(16);
        temp.setDes("마그네슘의 황산염으로 백색의 결정상 분말이다.\n" +
                " 마그네슘의 산화물·수산화물·탄산염 등을 황산과 반응시켜, 그 용액을 증발·농축하여 결정을 석출시키면 얻을 수 있다.");
        mlist.add(temp);

        temp = new Molecule(count++, "탄산마그네슘", "MgCO<sub><small>3</small></sub>", "MgCl<sub><small>2</small></sub> " +
                "+ Na<sub><small>2</small></sub>CO<sub><small>3</small></sub> -> MgCO<sub><small>3</small></sub> + 2NaCl");
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(12);
        temp.setDes("탄산의 마그네슘염으로 천연으로는 마그네사이트로 산출되는데, 무색의 결정 또는 분말이다.");
        mlist.add(temp);

        temp = new Molecule(count++, "산화알루미늄", "Al<sub><small>2</small></sub>O<sub><small>3</small></sub>", "4Al " +
                "+ 3O<sub><small>2</small></sub> -> 2Al<sub><small>2</small></sub>O<sub><small>3</small></sub>");
        temp.add_Key(5);
        temp.add_Key(13);
        temp.setDes("알루미늄의 산화물(Al2O3)로, 알루미나를 말한다. 알루미늄 원광석의 주성분 이기도 하다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화알루미늄", "AlCl<sub><small>3</small></sub>", "2Al " +
                "+ 6HCl -> 2AlCl<sub><small>3</small></sub> + 3H<sub><small>2</small></sub>");
        temp.add_Key(13);
        temp.add_Key(17);
        temp.setDes("");
        mlist.add(temp);

        temp = new Molecule(count++, "이산화규소", "SiO<sub><small>2</small></sub>", "Si " +
                "+ CO<sub><small>2</small></sub> -> SiO<sub><small>2</small></sub> + C");
        temp.add_Key(8);
        temp.add_Key(14);
        temp.setDes("규산무수물이라고도 한다. 일반적으로 실리카라고 하는데, 이것은 천연으로 존재하는 각종 규산염 속의 성분으로서의 이산화규산을 말한다. 천연으로는 석영·수정·옥수(玉髓)·마노(瑪瑙)·부싯돌·규사(硅砂)·인규석(鱗硅石)·홍연석(紅鉛石) 등에 결정 또는 비결정으로 산출된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "이산화황", "SO<sub><small>2</small></sub>", "S " +
                "+ O<sub><small>2</small></sub> -> SO<sub><small>2</small></sub>");
        temp.add_Key(8);
        temp.add_Key(16);
        temp.setDes("황과 산소의 화합물로서 황이 연소할 때에 발생하는 기체.");
        mlist.add(temp);

        temp = new Molecule(count++, "황화수소", "H<sub><small>2</small></sub>S", "S " +
                "+ H<sub><small>2</small></sub> -> H<sub><small>2</small></sub>S");
        temp.add_Key(1);
        temp.add_Key(16);
        temp.setDes("황과 수소로 이루어진 화합물이다. 자연에서는 화산 가스나 광천수에도 포함되어 있고, 황을 포함한 단백질의 부패로도 발생한다.");
        mlist.add(temp);

        temp = new Molecule(count++, "황산", "H<sub><small>2</small></sub>SO<sub><small>4</small></sub>", "SO<sub><small>3</small></sub> " +
                "+ H<sub><small>2</small></sub>O -> H<sub><small>2</small></sub>SO<sub><small>4</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(16);
        temp.setDes("무색의 비휘발성 액체로 백금이나 오산화바다듐 촉매를 이용해 만든다. 물을 제외하고 가장 많이 제조되는 강산성의 화합물이다.");
        mlist.add(temp);

        temp = new Molecule(count++, "삼산화황", "SO<sub><small>3</small></sub>", "2SO<sub><small>3</small></sub> " +
                "+ O<sub><small>2</small></sub> -> 2SO<sub><small>3</small></sub>");
        temp.add_Key(8);
        temp.add_Key(16);
        temp.setDes("황의 무수물로, 상온에서 무색 결정이며 강한 산성물질이다. 발연제(發煙劑) ·발연황산의 제조에 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "아황산", "H<sub><small>2</small></sub>SO<sub><small>3</small></sub>", "SO<sub><small>2</small></sub> " +
                "+ H<sub><small>2</small></sub>O -> H<sub><small>2</small></sub>SO<sub><small>3</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(16);
        temp.setDes("수용액으로서만 존재하는 산으로, 이산화황(아황산가스)을 물에 녹이면 즉시 생성된다. 환원제·표백제로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화칼슘", "CaCl<sub><small>2</small></sub>", "Ca<sup><small>2+</small></sup> " +
                "+ Cl<sub><small>2</small></sub>O -> CaCl<sub><small>2</small></sub>");
        temp.add_Key(17);
        temp.add_Key(20);
        temp.setDes("복염(複鹽)으로서 타키하이드라이트 등의 광물로서 산출되며 바닷물 속에 0.15% 함유되어 있다.무수물은 조해성이 있는 사방정계의 백색 결정으로 약간 비틀어진 루틸구조를 하고 있다.\n" +
                "알코올, 아세톤에도 잘 녹는다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화비닐", "C<sub><small>2</small></sub>H<sub><small>3</small></sub>Cl", "C<sub><small>2</small></sub>H<sub><small>2</small></sub> " +
                "+ HCl -> C<sub><small>2</small></sub>H<sub><small>3</small></sub>Cl");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(17);
        temp.setDes("할로알켄(할로젠화알켄일)의 일종으로 상온·상압에서 무색의 기체로, 클로로폼 비슷한 상쾌한 냄새가 난다. 인화성이 있고, 증기와 공기가 섞인 것은 폭발성이 있다. 폴리염화비닐을 제조하는 데 널리 사용되는 중요한 화학물질이다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화메틸", "CH<sub><small>3</small></sub>Cl", "CH<sub><small>4</small></sub> " +
                "+ Cl<sub><small>2</small></sub> -> CH<sub><small>3</small></sub>Cl");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(17);
        temp.setDes("장 간단한 알킬염화물로서, 메탄의 수소 원자 1개를 염소 원자로 치환한 것이다." +
                "액화한 염화메틸은 기화할 때 다량의 열을 빼앗으므로 액화와 기화를 순환적으로 되풀이하며, 냉동기의 냉매로서 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화메틸렌", "CH<sub><small>2</small></sub>Cl<sub><small>2</small></sub>", "CH<sub><small>3</small></sub>Cl " +
                "+ Cl<sub><small>2</small></sub> -> CH<sub><small>2</small></sub>Cl<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(17);
        temp.setDes("색의 액체, 증기는 불연성이고 공기와 폭명기(爆鳴氣 : detonating gas)를 만들지 않는다.");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화칼륨", "KOH", "2K " +
                "+ 2H<sub><small>2</small></sub>O -> 2KOH + H<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(19);
        temp.setDes("칼륨의 수산화물로서 화학식은 KOH이다. 염화칼륨수용액을 전기분해하여서 얻는데, 전기분해에는 격막법과 수은법이 있으며, 제품으로 시판되는 것은 보통 반구형의 정제 또는 막대 모양으로 성형된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "탄산칼륨", "K<sub><small>2</small></sub>CO<sub><small>3</small></sub>", "4K " +
                "+ 3CO<sub><small>2</small></sub> -> K<sub><small>2</small></sub>CO<sub><small>3</small></sub> + C");
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(19);
        temp.setDes("45∼50%의 수산화칼륨용액을 반응조(反應槽)에 넣고, 교반하면서 이산화탄소를 불어넣어 탄산칼륨수용액을 만들고 거른 후 증발·건조시켜 만든다. 칼리비누·칼리유리·광학유리 등의 제조원료, 염색·가죽무두질·사진·분석시약 등에 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "염화칼륨", "KCl", "K<sup><small>+</small></sup> " +
                "+ Cl<sup><small>-</small></sup> -> K<sub<small>2</small></sub>CO<sub><small>3</small></sub> + C");
        temp.add_Key(17);
        temp.add_Key(19);
        temp.setDes("공업적으로는 칼륨염의 제조원료로 사용되고, 실험실에서는 완충용액 및 전극액으로 쓰인다. KCl의 단결정(單結晶)은 적외선 흡수측정 시에 이용되는 프리즘이나 셀의 창 제조에 사용된다. 기타 열처리제, 사진 시약, 의약품 등으로 쓰인다.");
        mlist.add(temp);

        temp = new Molecule(count++, "질산칼륨", "KNO<sub><small>3</small></sub>", "2HNO<sub><small>3</small></sub> " +
                "+ K<sub><small>2</small></sub>CO<sub><small>3</small></sub> -> 2KNO<sub><small>3</small></sub> + CO<sub><small>2</small></sub> + H<sub><small>2</small></sub>O");
        temp.add_Key(7);
        temp.add_Key(8);
        temp.add_Key(19);
        temp.setDes("무색의 기둥모양 결정 또는 백색의 결정성 분말로 존재하는 칼륨의 질산염이다.");
        mlist.add(temp);

        temp = new Molecule(count++, "산화칼슘", "CaO", "Ca<sup><small>2+</small></sup> " +
                "+ O<sup><small>2-</small></sup> -> CaO");
        temp.add_Key(8);
        temp.add_Key(20);
        temp.setDes("산소와 칼슘의 화합물로 백색의 결정이다. 공기 중에서 분해되며 물과 반응하면 발열하여 수산화칼슘을 생성한다. 석회비료, 건조제, 시멘트, 표백제등 다양한 용도로 쓰이며 알칼리성이 강해 흡입하면 위험하다.");
        mlist.add(temp);

        temp = new Molecule(count++, "탄산칼슘", "CaCO<sub><small>3</small></sub>", "CaO " +
                "+ CO<sub><small>2</small></sub> -> CaCO<sub><small>3</small></sub>");
        temp.add_Key(6);
        temp.add_Key(8);
        temp.add_Key(20);
        temp.setDes("칼슘의 탄산염으로 대리석·방해석·선석(霰石)·석회석·백악·빙주석(氷洲石)·조개껍데기·달걀껍데기·산호 등으로서 산출된다. 시멘트의 주원료, 산화칼슘의 원료, 제철·건축재료 등의 각종 중화제(中和劑)로 사용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "수산화칼슘", "Ca(OH)<sub><small>2</small></sub>", "Ca " +
                "+ 2H<sub><small>2</small></sub>O -> Ca(OH)<sub><small>2</small></sub> + H<sub><small>2</small></sub>");
        temp.add_Key(1);
        temp.add_Key(8);
        temp.add_Key(20);
        temp.setDes("칼슘의 수산화물로, 화학식 Ca(OH)2의 백색 분말 형태의 염기성 화합물인데, 이산화탄소의 검출과 이산화탄소에 의한 온실 효과를 줄이는데 이용된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "포도당", "C<sub><small>6</small></sub>H<sub><small>12</small></sub>O<sub><small>6</small></sub>", "6CO<sub><small>2</small></sub> " +
                "+ 12H<sub><small>2</small></sub>O -> C<sub><small>6</small></sub>H<sub><small>12</small></sub>O<sub><small>12</small></sub>" + "+ 6O<sub><small>2</small></sub>O" + "+ 6H<sub><small>2</small></sub>O");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.add_Key(8);
        temp.setDes("대표적인 알도헥소스(탄소 6개를 가지며 알데하이드기를 가지는 단당류)이며 D-글루코스를 포도당이라 한다. 탄수화물 대사의 중심적 화합물로서 한 분자당 38개의 ATP를 합성할 수 있다.");
        mlist.add(temp);

        temp = new Molecule(count++, "메탄", "CH<sub><small>4</small></sub>", "C " +
                "+ 2H<sub><small>2</small></sub> -> CH<sub><small>4</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.setDes("가장 간단한 유기 화합물로, 화학식은 CH4이며 천연 가스의 주성분이다. 무색, 무취인 가연성 기체로서, 끓는점이 -164℃로 매우 낮으므로 액화가 매우 어렵다. 메탄의 구조는 정사면체의 중심에 탄소가 있고 정사면체의 꼭짓점에 수소가 있는 모양이다. 대칭 구조이므로 무극성을 띠고, 물에 용해되기 어렵다. 메탄 분자를 구성하는 탄소 원자와 수소 원자의 결합이 비교적 안정하기 때문에 쉽게 반응하지 않지만, 자외선을 쬐면 탄소와 수소의 결합이 끊어지면서 탄소와 염소의 결합이 형성된다.");
        mlist.add(temp);

        temp = new Molecule(count++, "에탄", "C<sub><small>2</small></sub>H<sub><small>6</small></sub>", "C " +
                "+ 2H<sub><small>2</small></sub> -> C<sub><small>2</small></sub>H<sub><small>6</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.setDes("천연 가스나 원유에 일부 함유되어 있는 탄화수소인 에탄(에테인)은 탄소가 2개인 지방족 포화탄화수소이며, 분자식은 C2H6이다. 탄소 원자는 4개의 결합이 되어 있으므로 입체적인 구조를 갖는다. 2개의 탄소 원자를 축으로 회전이 가능하여 그 구조는 시시각각으로 변화한다. 에탄은 다른 알칸(알케인)족의 화합물과 마찬가지로 치환 반응을 한다. 염소와의 치환 반응에 의하여 만들어진 치환체 중에서 1, 2-다이클로로 에테인은 마치 기하 이성질체를 갖는 것처럼 보이지만 두 탄소 원자를 축으로 회전하므로 2개의 구조는 이성질체가 아닌 동일한 구조이다. 무색 무취의 가스인 에테인은 유기 합성 화학 공업의 기초 원료, 냉매, 연료로 쓰인다. 산화물에 의한 반응성은 강하지 않지만 인화 폭발의 위험성이 크다.");
        mlist.add(temp);

        temp = new Molecule(count++, "아세트아미노펜", "C<sub><small>2</small></sub>H<sub><small>6</small></sub>", "C " +
                "+ 2H<sub><small>2</small></sub> -> CH<sub><small>4</small></sub>");
        temp.add_Key(1);
        temp.add_Key(6);
        temp.setDes("아세트아미노펜은 페놀에 질산나트륨을 사용해 질산화를 한 후 para-니트로페놀과 ortho-니트로페놀이 생성된다. 이때  para형만 분리하여 니트로기를 sodium borohydride로 환원한다. 그 결과로 4-aminophenol이 생성되는데 무수아세트산으로 아세틸화 하면 아세트아미노펜이 된다.");
        mlist.add(temp);
    }

    public ArrayList<Molecule> getMlist() {
        return mlist;
    }

    public void setMlist(ArrayList<Molecule> mlist) {
        this.mlist = mlist;
    }

    public void addMlist(Molecule m) {
        mlist.add(m);
    }

}
