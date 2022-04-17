
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Product;
import java.util.List;


public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(long productId);
    public void saveProduct(Product product);
    public void deleteProduct(long productId);
}
