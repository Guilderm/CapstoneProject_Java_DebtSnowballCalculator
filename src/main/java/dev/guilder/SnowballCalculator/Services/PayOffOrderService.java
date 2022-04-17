
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.PayOffOrder;
import java.util.List;


public interface PayOffOrderService {
    public List<PayOffOrder> getAllPayOffOrders();
    public PayOffOrder getPayOffOrderById(long payOffOrderId);
    public void savePayOffOrder(PayOffOrder payOffOrder);
    public void deletePayOffOrder(long payOffOrderId);
}
