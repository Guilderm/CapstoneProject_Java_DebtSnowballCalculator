package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Product;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(long productId);

    void saveProduct(Product product);

    void deleteProduct(long productId);
}
