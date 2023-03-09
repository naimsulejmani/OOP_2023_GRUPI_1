package introduction.summary;

public class Airplane {
    private double maxSpeed;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed >= 0 && maxSpeed <= 2000)
            this.maxSpeed = maxSpeed;
    }
}
