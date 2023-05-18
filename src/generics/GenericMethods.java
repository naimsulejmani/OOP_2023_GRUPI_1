package generics;

public class GenericMethods {
    public static void main(String[] args) {
//        int nr = getMiddle(1, 2, 3, 4, 5, 6, 7);
//        double nr1 = getMiddle(2.2, 3.3, 1.1);
//        String str = getMiddle("Real Madrid", "Chelsea", "Arsenal");
//        System.out.println(nr);
//        System.out.println(nr1);
//        System.out.println(str);

        int minimumi = min(90, 22, 100, -3, -33, 1, 2);
        double minimumi1 = min(22.2, 11.1, 1.0, 2.0);
        String minString = min("Naim", "Albi", "Alba", "Altin", "Arsenal", "Chelsea");

        System.out.println(minimumi);
        System.out.println(minimumi1);
        System.out.println(minString);

        Grade arditisGrade = new Grade("Ardit", "Gjukaj", 2);
        Grade blendisGrade = new Grade("Blend", "Terstena", 13);
        Grade nikolinisGrade = new Grade("Nikolin", "Gegaj", 100);

        Grade minGrade = min(nikolinisGrade, blendisGrade, arditisGrade);

        System.out.println(minGrade);

    }

    public static <T> T getMiddle(T... args) {
        if (args.length == 0) throw new IllegalArgumentException("NO parameters passed!");
        return args[args.length / 2];
    }

    public static <T extends Comparable<T>> T min(T... args) {
        if (args.length == 0) throw new IllegalArgumentException("NO parameters passed!");
        T minValue = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i].compareTo(minValue) < 0)
                minValue = args[i];
        }
        return minValue;
    }

}







