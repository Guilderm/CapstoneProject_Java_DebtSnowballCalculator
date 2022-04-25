package dev.guilder.SnowballCalculator.Entitys;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DebtSnowBall")
public class DebtSnowBall implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long debtSnowBallId;

    public long getDebtSnowBallId() {
        return debtSnowBallId;
    }

    public void setDebtSnowBallId(long debtSnowBallId) {
        this.debtSnowBallId = debtSnowBallId;
    }
}
