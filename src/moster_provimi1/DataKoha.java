package moster_provimi1;

public class DataKoha {
    private int viti;
    private int muaji;
    private int dita;
    private int ora;
    private int minutat;
    private int sekondat;

    public DataKoha(int viti, int muaji, int dita) {
        this(viti, muaji, dita, 0, 0, 0);
    }

    public DataKoha(int viti, int muaji, int dita, int ora, int minutat, int sekondat) {
        this.viti = viti;
        this.muaji = muaji;
        this.dita = dita;
        this.ora = ora;
        this.minutat = minutat;
        this.sekondat = sekondat;
    }

    public int getViti() {
        return viti;
    }

    public void setViti(int viti) {
        this.viti = viti;
    }

    public int getMuaji() {
        return muaji;
    }

    public void setMuaji(int muaji) {
        this.muaji = muaji;
    }

    public int getDita() {
        return dita;
    }

    public void setDita(int dita) {
        this.dita = dita;
    }

    public int getOra() {
        return ora;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public int getMinutat() {
        return minutat;
    }

    public void setMinutat(int minutat) {
        this.minutat = minutat;
    }

    public int getSekondat() {
        return sekondat;
    }

    public void setSekondat(int sekondat) {
        this.sekondat = sekondat;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d %d:%d:%d", dita, muaji, viti, ora, minutat, sekondat);
    }
}









