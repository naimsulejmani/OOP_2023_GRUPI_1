package mini_projects.shop;

import mini_projects.shop.manager.ProductManager;
import mini_projects.shop.models.Product;
import mini_projects.shop.models.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ShopApp {
    public static void main(String[] args) {
        Product p1 = new Product("BMW",
                "BMW X6 2018",
                LocalDate.now().plusYears(3),
                BigDecimal.valueOf(40_000f),
                Rating.NO_STAR
        );
        Product p2 = new Product("Mercedes",
                "Mercedes S Class",
                LocalDate.now().plusYears(3),
                BigDecimal.valueOf(65_000f),
                Rating.FOUR_STAR
        );
        System.out.println(p1);
        System.out.println(p2);

        ProductManager.add();

    }
}
