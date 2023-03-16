package enums;

public class MonthTest {
    public static void main(String[] args) {
        Month thisMonth = Month.MARCH;
        Month nextMonth = Month.APRIL;
        Month edipisMonth = Month.MARCH;

        System.out.println(thisMonth == edipisMonth);
        System.out.println(thisMonth.compareTo(nextMonth));
        System.out.println(thisMonth.compareTo(Month.DECEMBER));
        System.out.println(thisMonth.ordinal());

    }
}







