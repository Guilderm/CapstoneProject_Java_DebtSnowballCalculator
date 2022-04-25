package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Order;

import java.util.List;


public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(long orderId);

    void saveOrder(Order order);

    void deleteOrder(long orderId);
}
