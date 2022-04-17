
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Order;
import java.util.List;


public interface OrderService {
    public List<Order> getAllOrders();
    public Order getOrderById(long orderId);
    public void saveOrder(Order order);
    public void deleteOrder(long orderId);
}
