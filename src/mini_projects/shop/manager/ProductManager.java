package mini_projects.shop.manager;

import mini_projects.shop.exceptions.ExpireDateException;
import mini_projects.shop.exceptions.NegativePriceException;
import mini_projects.shop.models.Product;
import mini_projects.shop.models.Rating;
import mini_projects.shop.repositories.ProductRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {
    private static ProductRepository productRepository = new ProductRepository();

    public static void add() {
        Product p = new Product("Emri1", "Pershkrimi1",
                LocalDate.now().plusDays(3), BigDecimal.valueOf(10), Rating.ONE_STAR);
        try {
            productRepository.add(p);
        } catch (NegativePriceException e) {
            System.out.println("NUk lejohet regjistirm ime cmim negative: " + e.getPrice());
        } catch (ExpireDateException e) {
            System.out.println("Nuk lejohet regjistrimi i produktit me date skandence!! " + e.getExpiredDate());
        }
    }
}
