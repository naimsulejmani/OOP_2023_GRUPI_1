package abstract_classes;

public class Derived extends Base {
    public Derived() {
        // super();
        System.out.println("Derived constructor called!");
    }

    @Override
    public void fun() {
        System.out.println("Method fun() implemented!");
    }
}
