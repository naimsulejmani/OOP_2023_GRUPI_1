package moster_provimi;

public class NenpunesitTeKualifikuar extends NenpunesiDK {
    private String kualifikimet;

    public NenpunesitTeKualifikuar(String kualifikimet) {
        this.kualifikimet = kualifikimet;
    }

    public NenpunesitTeKualifikuar(int id, String emri, String mbiemri, DataKoha datelindja, String departamenti, String kualifikimet) {
        super(id, emri, mbiemri, datelindja, departamenti);
        this.kualifikimet = kualifikimet;
    }
    // get ..set

    @Override
    public void puno() {
        System.out.println("Punoj sikurse " + kualifikimet);
    }

    public static void main(String[] args) {
//        NenpunesitTeKualifikuar nk1 = new NenpunesitTeKualifikuar(1, "Gaz", "mend",
//                new DataKoha(2000, 2, 2), "IT", "programer");
//        System.out.println(nk1);

        Punoj nd = new NenpunesitTeKualifikuar(1, "Gaz", "mend",
                new DataKoha(2000, 2, 2), "IT", "programer");
        nd.puno();
    }
}
