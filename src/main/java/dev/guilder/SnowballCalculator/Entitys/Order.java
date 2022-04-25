package dev.guilder.SnowballCalculator.Entitys;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
