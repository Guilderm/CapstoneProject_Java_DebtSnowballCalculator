package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Product;
import dev.guilder.SnowballCalculator.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product getProductById(long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }
}
