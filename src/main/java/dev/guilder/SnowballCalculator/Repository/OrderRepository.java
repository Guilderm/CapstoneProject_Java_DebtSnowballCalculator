package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long> {

}
