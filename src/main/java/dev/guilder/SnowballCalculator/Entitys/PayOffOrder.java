package dev.guilder.SnowballCalculator.Entitys;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PayOffOrder")
public class PayOffOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long payOffOrdenId;

    public long getPayOffOrdenId() {
        return payOffOrdenId;
    }

    public void setPayOffOrdenId(long payOffOrdenId) {
        this.payOffOrdenId = payOffOrdenId;
    }
}
