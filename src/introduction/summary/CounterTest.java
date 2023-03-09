package introduction.summary;

public class CounterTest {
    public static void main(String[] args) {
        Counter hapat = new Counter();
        for (int i = 0; i < 25000; i++) {
            hapat.increment();
        }
        System.out.println(hapat.getValue());

//        Counter tespiht = new Counter();
//        tespiht.increment();
//        tespiht.increment();
//        tespiht.increment();
//        System.out.println(tespiht.getValue());
//
//        Counter studentCounter = new Counter();
//        studentCounter.increment();
//        studentCounter.increment();
//        System.out.println(studentCounter.getValue());
//
//
//        Counter shitjetDitore = new Counter();
//        shitjetDitore.increment();
//        System.out.println(shitjetDitore.getValue());
//
//        Counter golatPsg = new Counter();
//        Counter golatBayern = new Counter();
//        golatBayern.increment();
//        golatBayern.increment();


    }
}
