package inheritance.bird_app;

public class FlyingBird extends Bird {
    public FlyingBird(String call, String color, String food) {
        super(call, color, food, "flew");
    }

    public FlyingBird() {
        super(null, null, null, "flew");
    }
}






