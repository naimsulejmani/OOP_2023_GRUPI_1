package generics;

public class PairOldTest {
    public static void main(String[] args) {
        PairInt pI = new PairInt(10, 20);
        int nr1 = pI.getFirst();

        PairString pS = new PairString("Naim", "Kosove");
        String shteti = pS.getSecond();

        PairObject pO = new PairObject(30.5, 40.5);
        double numri = (double) pO.getFirst();
    }
}
