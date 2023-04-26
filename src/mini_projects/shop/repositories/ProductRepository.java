package mini_projects.shop.repositories;

import mini_projects.shop.exceptions.ExpireDateException;
import mini_projects.shop.exceptions.NegativePriceException;
import mini_projects.shop.exceptions.ProductNotFoundException;
import mini_projects.shop.models.Product;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProductRepository {
    // definojme lokacionin se ku po i rruajme te dhenat
    // fillimisht ne liste, me vone kjo pjese ruhet ne DB

    private ArrayList<Product> products = new ArrayList<>();

    //duhet mee i pas metodat qe manipulojne te dhena (CRUD) - DML + DQL
    public void add(Product product) throws NegativePriceException, ExpireDateException {
        if (product.getPrice().compareTo(BigDecimal.ZERO) < 0)
            throw new NegativePriceException((float) product.getPrice().doubleValue());
        if (product.getBestBefore().isBefore(LocalDate.now()))
            throw new ExpireDateException(product.getBestBefore());

        products.add(product);
    }

    public Product findById(int productId) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getId() == productId)
                return product;
        }
        throw new ProductNotFoundException(String.format("Produkti me id %d nuk u gjet!",
                productId));
    }


    public ArrayList<Product> getProducts() {
        return (ArrayList<Product>) products.clone();
    }

    public void deleteById(int productId) throws ProductNotFoundException {
        Product product = findById(productId);
        products.remove(productId);
    }

    public void updateProduct(int productId, Product product) throws ProductNotFoundException {
        Product dbProduct = findById(productId);
        dbProduct.setBestBefore(product.getBestBefore());
        dbProduct.setDescription(product.getDescription());
        dbProduct.setName(product.getName());
        dbProduct.setPrice(product.getPrice());
        dbProduct.setRating(product.getRating());
    }
}















