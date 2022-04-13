
package dev.guilder.SnowballCalculator.Entitys;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "DebtSnowBall")
public class DebtSnowBall implements Serializable{
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long debtSnowBallId;

    public long getDebtSnowBallId() {
        return debtSnowBallId;
    }

    public void setDebtSnowBallId(long debtSnowBallId) {
        this.debtSnowBallId = debtSnowBallId;
    }
}
