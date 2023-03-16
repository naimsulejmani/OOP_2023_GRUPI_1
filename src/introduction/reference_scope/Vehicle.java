package introduction.reference_scope;

public class Vehicle {
    private String model = "Sport";
    private int productionYear = 2019;
    private boolean isActive;

    public Vehicle(String model, int productionYear, boolean isActive) {
        this.model = model;
        this.productionYear = productionYear;
        this.isActive = isActive;
    }

    public Vehicle(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", isActive=" + isActive +
                '}';
    }
}
