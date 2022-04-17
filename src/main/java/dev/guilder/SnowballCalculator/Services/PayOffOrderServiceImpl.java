
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.PayOffOrder;
import dev.guilder.SnowballCalculator.Repository.PayOffOrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PayOffOrderServiceImpl implements PayOffOrderService{

    @Autowired
    private PayOffOrderRepository payOffOrderRepository;
    
    @Override
    @Transactional (readOnly = true)
    public List<PayOffOrder> getAllPayOffOrders() {
        return (List<PayOffOrder>)payOffOrderRepository.findAll();
    }

    @Override
    @Transactional (readOnly = true)
    public PayOffOrder getPayOffOrderById(long payOffOrderId) {
        return payOffOrderRepository.findById(payOffOrderId).orElse(null);
    }

    @Override
    @Transactional
    public void savePayOffOrder(PayOffOrder payOffOrder) {
        payOffOrderRepository.save(payOffOrder);
    }

    @Override
    @Transactional
    public void deletePayOffOrder(long payOffOrderId) {
        payOffOrderRepository.deleteById(payOffOrderId);
    }
}
