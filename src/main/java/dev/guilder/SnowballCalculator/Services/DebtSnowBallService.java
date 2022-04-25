package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.DebtSnowBall;

import java.util.List;


public interface DebtSnowBallService {
    List<DebtSnowBall> getAllDebtSnowBalls();

    DebtSnowBall getDebtSnowBallById(long debtSnowBallId);

    void saveDebtSnowBall(DebtSnowBall debtSnowBall);

    void deleteDebtSnowBall(long debtSnowBallId);
}
