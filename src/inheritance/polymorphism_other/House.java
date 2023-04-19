package inheritance.polymorphism_other;

public class House {
    private int id;
    private String address;
    private float m2;

    public House(int id, String address, float m2) {
        this.id = id;
        this.address = address;
        this.m2 = m2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }
}
