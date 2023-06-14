package moster_provimi;

import java.time.LocalDate;

public class Nenpunesi {
    private int id;
    private String emri;
    private String mbiemri;
    private LocalDate datelindja;
    private String departamenti;

    public Nenpunesi(){

    }

    public Nenpunesi(int id, String emri, String mbiemri,
                     LocalDate datelindja, String departamenti){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.datelindja = datelindja;
        this.departamenti = departamenti;
    }
    public int getId(){return id;}
    public void setId(int id) {this.id = id;}
    public String getEmri(){return emri; }
    public void setEmri(String emri){this.emri = emri;}
    public String getMbiemri(){return mbiemri;}
    public void setMbiemri(String mbiemri){this.mbiemri = mbiemri;}
    public LocalDate getDatelindja(){return  datelindja;}
    public void setDatelindja(LocalDate datelindja){this.datelindja = datelindja;}
    public String getDepartamenti(){return departamenti;}
    public void setDepartamenti(String departamenti){this.departamenti = departamenti;}
    public String toString(){
        return String.format("%d - %s %s i lindun me:%s, punon ne departmentin:%s",
                id,emri,mbiemri,datelindja, departamenti);
    }

    public static void main(String[] args) {
        Nenpunesi n1 = new Nenpunesi();//pa parametra
        n1.setEmri("Gazmend");
        n1.setId(3);
        n1.setMbiemri("Rashiti");
        n1.setDatelindja(LocalDate.of(2009,1,1));
        n1.setDepartamenti("Shef");
        Nenpunesi n2 = new Nenpunesi(2, "Naim", "Sulejmani",
                LocalDate.of(2000,1,1),"Profesor");

        System.out.println(n1);
        System.out.println(n2);
    }










}
