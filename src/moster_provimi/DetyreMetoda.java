package moster_provimi;

import java.util.ArrayList;
import java.util.List;

public class DetyreMetoda {

    public static void plotePjestueshemMeNente(int[] array) {
        for (int number : array) {
            if (number % 9 == 0) {
                System.out.printf("%10d", number);
            }
        }
    }

    public static List<Integer> plotePjestueshemMeNentev2(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int number : array) {
            if (number % 9 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] vargu = {1, 3, 5, 6, 10, 18, 21, 27};

        //plotePjestueshemMeNente(vargu);
        for(Number number: plotePjestueshemMeNentev2(vargu)) {
            System.out.println(number);
        }
    }
}
