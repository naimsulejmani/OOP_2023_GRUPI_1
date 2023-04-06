package inheritance.bird_app;

public class Parrot extends FlyingBird {


    public Parrot(String call, String color, String food) {
        super(call, color, food);
    }

    public Parrot() {
        super(); // kton e thirr Java per neve vet
    }

    public void test() {

    }

    @Override
    public String getCall() {
        return "HELLO -> " + super.getCall();
    }
}










