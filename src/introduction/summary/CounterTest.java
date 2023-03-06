package introduction.summary;

public class CounterTest {
    public static void main(String[] args) {
        Counter tespiht = new Counter();
        tespiht.increment();
        tespiht.increment();
        tespiht.increment();
        System.out.println(tespiht.getValue());

        Counter studentCounter = new Counter();
        studentCounter.increment();
        studentCounter.increment();
        System.out.println(studentCounter.getValue());


        Counter shitjetDitore = new Counter();
        shitjetDitore.increment();
        System.out.println(shitjetDitore.getValue());
    }
}
