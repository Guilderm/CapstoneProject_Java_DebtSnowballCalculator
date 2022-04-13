
package dev.guilder.SnowballCalculator.Entitys;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "PayOffOrder")
public class PayOffOrder implements Serializable{
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long payOffOrdenId;

    public long getPayOffOrdenId() {
        return payOffOrdenId;
    }

    public void setPayOffOrdenId(long payOffOrdenId) {
        this.payOffOrdenId = payOffOrdenId;
    }
}
