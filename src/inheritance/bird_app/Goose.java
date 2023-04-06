package inheritance.bird_app;

public class Goose extends WalkingBird {
    public Goose(String call, String color, String food) {
        super(call, color, food);
    }

    public void test1() {

    }

    @Override
    public String getCall() {
        return "QUACK QUACK -> " + super.getCall();
    }
}
