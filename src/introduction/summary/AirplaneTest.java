package introduction.summary;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane f35 = new Airplane();
        f35.setMaxSpeed(1900);

        f35.setMaxSpeed(-12);


        Airplane f16 = new Airplane();
        f16.setMaxSpeed(2900);

        System.out.println(f35.getMaxSpeed());
        System.out.println(f16.getMaxSpeed());
    }
}
