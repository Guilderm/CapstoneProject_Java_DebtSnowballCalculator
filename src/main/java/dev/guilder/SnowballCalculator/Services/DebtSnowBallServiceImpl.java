package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.DebtSnowBall;
import dev.guilder.SnowballCalculator.Repository.DebtSnowBallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DebtSnowBallServiceImpl implements DebtSnowBallService {

    @Autowired
    private DebtSnowBallRepository debtSnowBallRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DebtSnowBall> getAllDebtSnowBalls() {
        return (List<DebtSnowBall>) debtSnowBallRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DebtSnowBall getDebtSnowBallById(long debtSnowBallId) {
        return debtSnowBallRepository.findById(debtSnowBallId).orElse(null);
    }

    @Override
    @Transactional
    public void saveDebtSnowBall(DebtSnowBall debtSnowBall) {
        debtSnowBallRepository.save(debtSnowBall);
    }

    @Override
    @Transactional
    public void deleteDebtSnowBall(long debtSnowBallId) {
        debtSnowBallRepository.deleteById(debtSnowBallId);
    }
}
