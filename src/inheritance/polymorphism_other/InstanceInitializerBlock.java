package inheritance.polymorphism_other;

public class InstanceInitializerBlock {
    private int randomNumber;

    public InstanceInitializerBlock() {
        System.out.println("CONSTRUCTOR");
    }

    //instance initializer block
    {
        randomNumber = 10;
        randomNumber++;
        randomNumber -= 5;
        System.out.println("HELLO");
    }

    {
        System.out.println("HELLO1");
    }
    public static void main(String[] args) {
        new InstanceInitializerBlock();
    }
}
