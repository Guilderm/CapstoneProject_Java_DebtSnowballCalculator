package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.PayOffOrder;

import java.util.List;


public interface PayOffOrderService {
    List<PayOffOrder> getAllPayOffOrders();

    PayOffOrder getPayOffOrderById(long payOffOrderId);

    void savePayOffOrder(PayOffOrder payOffOrder);

    void deletePayOffOrder(long payOffOrderId);
}
