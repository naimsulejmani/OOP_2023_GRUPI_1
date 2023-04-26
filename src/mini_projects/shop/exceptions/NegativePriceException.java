package mini_projects.shop.exceptions;

public class NegativePriceException extends Exception {
    private float price;

    public NegativePriceException(float price) {
        this.price = price;
    }

    public NegativePriceException(String message, float price) {
        super(message);
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
