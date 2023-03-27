package associations_realtionships.ushtrime;

public class TestGame {
    public static void main(String[] args) {
        Bomber b52 = new Bomber(20, 30);
        Bomber mig29 = new Bomber();
        AntiAircraftGun s400 = new AntiAircraftGun(22, 23);

        s400.setTarget(b52);
        b52.setTarget(s400);

        mig29.attack();
        s400.attack();
        System.out.println();
        b52.attack();

    }
}











