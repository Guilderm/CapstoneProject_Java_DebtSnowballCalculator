
package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.Products;
import org.springframework.data.repository.CrudRepository;


public interface ProductsRepository extends CrudRepository<Products, Long>{
    
}
