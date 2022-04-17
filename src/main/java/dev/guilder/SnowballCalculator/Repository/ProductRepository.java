
package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long>{
    
}
