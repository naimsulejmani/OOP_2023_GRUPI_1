package mini_projects.shop.manager;

import mini_projects.shop.enums.ProductType;
import mini_projects.shop.enums.Rating;
import mini_projects.shop.exceptions.ExpireDateException;
import mini_projects.shop.exceptions.NegativePriceException;
import mini_projects.shop.exceptions.ProductNotFoundException;
import mini_projects.shop.models.Drink;
import mini_projects.shop.models.Food;
import mini_projects.shop.models.Product;
import mini_projects.shop.models.Review;
import mini_projects.shop.repositories.ProductRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProductManager {
    private static ProductRepository productRepository = new ProductRepository();

    public static void createProduct(ProductType productType, String name, String description, double price,
                                     String bestBefore) {
        Product product = switch (productType) {
            case FOOD -> new Food(name, description, LocalDate.parse(bestBefore), BigDecimal.valueOf(price));
            case DRINK -> new Drink(name, description, LocalDate.parse(bestBefore), BigDecimal.valueOf(price));
        };

        try {
            productRepository.add(product);
        } catch (NegativePriceException e) {
            System.out.println("Nuk lejohet regjistrimi me cmimi negativ! Cmimi: " + e.getPrice());
        } catch (ExpireDateException e) {
            System.out.println("Nuk lejohet regjistrmi me date te skaduar! Data: " + e.getExpiredDate());
            System.out.println("Produkti gabim eshte: " + product.getId() + " -> " + product.getName());
        }
    }

    public static void createReview(int productId, String username, String comment,
                                    boolean anonymous, int stars) {
        try {
            Product product = productRepository.findById(productId);
            Review newReview =
                    new Review(comment, username, LocalDateTime.now(), Rating.values()[stars], anonymous);
            product.getReviews().add(newReview);
        } catch (ProductNotFoundException e) {
            System.out.println("Produkti me id e specifikuar nuk ezkiston! ID = " + productId);
        }
    }

    public static void printAllProducts(boolean showReviews) {
        ArrayList<Product> products = productRepository.getProducts();
        System.out.println("-------------------------------");
        System.out.println("Total products: " + products.size());
        System.out.println("-------------------------------");
        for (Product product : products) {
            System.out.println(product);
            if (showReviews)
                printReviewsForProduct(product);
        }
        System.out.println("-------------------------------");
    }

    private static void printReviewsForProduct(Product product) {
        System.out.println("List of reviews: ");
        System.out.println("#########################################");
        for (Review review : product.getReviews()) {
            System.out.println(review);
        }
        System.out.println("#########################################");
        System.out.println("Total reviews: " + product.getReviews().size());
        System.out.println("#########################################");
    }

}












