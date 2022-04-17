
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.DebtSnowBall;
import java.util.List;


public interface DebtSnowBallService {
    public List<DebtSnowBall> getAllDebtSnowBalls();
    public DebtSnowBall getDebtSnowBallById(long debtSnowBallId);
    public void saveDebtSnowBall(DebtSnowBall debtSnowBall);
    public void deleteDebtSnowBall(long debtSnowBallId);
}
