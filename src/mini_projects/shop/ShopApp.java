package mini_projects.shop;

import mini_projects.shop.enums.ProductType;
import mini_projects.shop.manager.ProductManager;
import mini_projects.shop.models.Product;
import mini_projects.shop.enums.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ShopApp {
    public static void main(String[] args) {
        // YYYY-MM-DD
        ProductManager.createProduct(ProductType.FOOD, "Hamburger", "Hamburger komplet",
                2.50, "2023-04-27");
        ProductManager.createProduct(ProductType.DRINK, "Coca Cola 250ml", "Cocal cola 250ml me shiqer",
                1.5, "2023-03-03");
        ProductManager.createProduct(ProductType.DRINK, "Coca Cola 250ml", "Cocal cola 250ml me shiqer",
                1.5, "2023-05-03");

        ProductManager.createReview(3,"naim","Wow super",false,5);
        ProductManager.createReview(3,"edipi","katastrofe",true,2);

        ProductManager.printAllProducts(true);

    }
}







