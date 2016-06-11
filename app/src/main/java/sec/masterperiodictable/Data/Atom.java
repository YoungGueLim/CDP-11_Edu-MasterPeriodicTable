package sec.masterperiodictable.Data;

import java.util.ArrayList;

/** *
 * <p/>
 * 원자에 대한 정보를 Setting 하고 Getting.
 * 원자번호, 한글이름, 영어이름, 기호, 평균원자량, 녹는점, 끓는점, 상세설명 에 대한 Setter 과 Getter 함수를 구현.
 */
/**
 * Setting and Getting about atom information
 * Implement setter and getter function about Atom number, Korean name, English name, Symbol, Average atomic weight, Melting Point, Boiling Point, Description.
 */
public class Atom {

    private int a_num;
    private String k_name;
    private String e_name;
    private String symbol;
    private String avg_atom;
    private String m_point;
    private String b_point;
    private int flag; // 0, 1, 2
    private String descript;
    ArrayList<Integer> mlist = new ArrayList<Integer>();

    public Atom(int a_num, String k_name, String e_name, String symbol, String avg_atom, String m_point, String b_point, String descript) {
        this.a_num = a_num;
        this.k_name = k_name;
        this.e_name = e_name;
        this.symbol = symbol;
        this.avg_atom = avg_atom;
        this.m_point = m_point;
        this.b_point = b_point;
        this.descript = descript;
        flag = 0;
    }

    // Setter and Getter

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getA_num() {
        return a_num;
    }

    public void setA_num(int a_num) {
        this.a_num = a_num;
    }

    public String getK_name() {
        return k_name;
    }

    public void setK_name(String k_name) {
        this.k_name = k_name;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAvg_atom() {
        return avg_atom;
    }

    public void setAvg_atom(String avg_atom) {
        this.avg_atom = avg_atom;
    }

    public String getM_point() {
        return m_point;
    }

    public void setM_point(String m_point) {
        this.m_point = m_point;
    }

    public String getB_point() {
        return b_point;
    }

    public void setB_point(String b_point) {
        this.b_point = b_point;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public ArrayList<Integer> getMlist() {
        return mlist;
    }

    public void setMlist(ArrayList<Integer> mlist) {
        this.mlist = mlist;
    }

    public void addMlist(int a) {
        mlist.add(a);
    }

    public boolean isThereAtom(int a) {

        for (int atom : mlist) {
            if (atom == a)
                return true;
        }

        return false;
    }

}
