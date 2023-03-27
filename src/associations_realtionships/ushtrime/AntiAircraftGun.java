package associations_realtionships.ushtrime;

public class AntiAircraftGun {
    private Bomber target;
    private Position position;
    private int health = 100;

    public AntiAircraftGun(double positionX, double positionY) {
        this.position = new Position(positionX, positionY);
    }

    public AntiAircraftGun() {
        this.position = new Position(Math.random() * 100, Math.random() * 100);
    }

    public Bomber getTarget() {
        return target;
    }

    public void setTarget(Bomber target) {
        this.target = target;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack() {
        if (target == null) {
            System.out.println("Nuk keni target te definum!");
        } else {
            int damage = (int) (Math.random() * 101);
            target.setHealth(target.getHealth() - damage);
            System.out.printf("I keni shkaktuar damage ne vlere %d", damage);
        }
    }
}







