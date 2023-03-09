package introduction.summary;

public class Counter {
    private static final int MAX_VALUE = 9999;
    private int value;

    public void increment() {
        if (value < MAX_VALUE)
            ++value;
        else {
            System.out.println("Keni mberri ne fund! BEEP! U resetua");
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }
}
