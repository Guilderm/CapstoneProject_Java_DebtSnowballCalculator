
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Order;
import dev.guilder.SnowballCalculator.Repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    @Transactional (readOnly = true)
    public List<Order> getAllOrders() {
        return (List<Order>)orderRepository.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public Order getOrderById(long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    @Transactional
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    @Transactional 
    public void deleteOrder(long orderId) {
        orderRepository.deleteById(orderId);
    }
}
