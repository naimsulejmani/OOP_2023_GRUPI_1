package mini_projects.shop.models;

import mini_projects.shop.enums.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Product {
    private static int generateId = 0;
    private final int id;
    private String name;
    private String description;
    private LocalDate bestBefore;
    private BigDecimal price;

    private ArrayList<Review> reviews = new ArrayList<>();
    private Rating rating;

    public Product(String name, String description, LocalDate bestBefore, BigDecimal price, Rating rating) {
        this.id = ++generateId;
        this.name = name;
        this.description = description;
        this.bestBefore = bestBefore;
        this.price = price;
        this.rating = rating;
    }

    public Product(String name, String description) {
        this(name, description, LocalDate.now().plusDays(1),
                BigDecimal.ZERO, Rating.NO_STAR);
    }

    public Product(String name, String description, LocalDate bestBefore, BigDecimal price) {
        this(name, description, bestBefore, price, Rating.NO_STAR);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }


    public double getDiscount() {
        return 0;
    }


    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return String.format(
                "#%d - %s%nPershkrimi: %s%nData e skadimit: %s%nCmimi: %s EUR%nRating: %s%nBarcode:%s",
                id, name, description, bestBefore, price, rating.getValue(), hashCode()
        );
    }
}















