package moster_provimi1;

public abstract class NenpunesiDK implements Punoj {
    private int id;
    private String emri;
    private String mbiemri;
    private DataKoha datelindja;
    private String departamenti;
 
    public NenpunesiDK() {

    }

    public NenpunesiDK(int id, String emri, String mbiemri,
                       DataKoha datelindja, String departamenti) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.datelindja = datelindja;
        this.departamenti = departamenti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public DataKoha getDatelindja() {
        return datelindja;
    }

    public void setDatelindja(DataKoha datelindja) {
        this.datelindja = datelindja;
    }

    public String getDepartamenti() {
        return departamenti;
    }

    public void setDepartamenti(String departamenti) {
        this.departamenti = departamenti;
    }

    public String toString() {
        return String.format("%d - %s %s i lindun me:%s, punon ne departmentin:%s",
                id, emri, mbiemri, datelindja, departamenti);
    }

    public static void main(String[] args) {
//        NenpunesiDK n1 = new NenpunesiDK();//pa parametra
//        n1.setEmri("Gazmend");
//        n1.setId(3);
//        n1.setMbiemri("Rashiti");
//        n1.setDatelindja(new DataKoha(2000, 1, 1, 15, 44, 0));
//        n1.setDepartamenti("Shef");
//        NenpunesiDK n2 = new NenpunesiDK(2, "Naim", "Sulejmani",
//                new DataKoha(1999, 6, 1, 8, 40, 22), "Profesor");
//
//        System.out.println(n1);
//        System.out.println(n2);
    }
}
