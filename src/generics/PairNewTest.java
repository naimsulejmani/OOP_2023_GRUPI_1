package generics;

import java.time.LocalDate;
import java.util.Locale;

public class PairNewTest {
    public static void main(String[] args) {
        PairOne<Integer> pairInt = new PairOne<>(20, 30);
        int nr = pairInt.getFirst();

        PairOne<String> pairString = new PairOne<>("Naim", "Kosove");
        String shteti = pairString.getSecond();

        PairOne<Double> pairDouble = new PairOne<>(22.2, 33.3);
        double d = pairDouble.getSecond();

        PairTwo<Integer, Integer> pairOfInt = new PairTwo<>(20, 22);
        PairTwo<Integer, String> ekipiMaImire = new PairTwo<>(1, "Real Madrid");
        PairTwo<String, LocalDate> herenEFunditTitulli =
                new PairTwo<>("Arsenal", LocalDate.of(2004, 6, 2));

        LocalDate kurEKaFituArsenaliTitullin = herenEFunditTitulli.getSecond();


    }
}

