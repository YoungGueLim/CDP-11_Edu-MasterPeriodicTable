package sec.masterperiodictable.Data;

import java.util.ArrayList;

/*
* Information about molecule
*
* */

public class Molecule {

    private int key;
    private String k_name;
    private String m_for;
    private String c_for;
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    ArrayList<Integer> a_key = new ArrayList<Integer>();

    public Molecule(int key, String k_name, String m_for, String c_for) {
        this.key = key;
        this.k_name = k_name;
        this.m_for = m_for;
        this.c_for = c_for;
    }

    public String getK_name() {
        return k_name;
    }

    public void setK_name(String k_name) {
        this.k_name = k_name;
    }

    public String getM_for() {
        return m_for;
    }

    public void setM_for(String m_for) {
        this.m_for = m_for;
    }

    public String getC_for() {
        return c_for;
    }

    public void setC_for(String c_for) {
        this.c_for = c_for;
    }

    public ArrayList<Integer> getA_key() {
        return a_key;
    }

    public void setA_key(ArrayList<Integer> a_key) {
        this.a_key = a_key;
    }

    public void add_Key(int a) {
        a_key.add(a);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}
