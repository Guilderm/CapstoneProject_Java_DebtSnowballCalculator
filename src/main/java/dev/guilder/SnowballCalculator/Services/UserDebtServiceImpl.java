package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserDebt;
import dev.guilder.SnowballCalculator.Repository.UserDebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDebtServiceImpl implements UserDebtService {

    @Autowired
    private UserDebtRepository userDebtRepository;

    @Override
    @Transactional(readOnly = true)
    public List<UserDebt> getAllUserDebts() {
        return (List<UserDebt>) userDebtRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public UserDebt getUserDebtById(long userDebtId) {
        return userDebtRepository.findById(userDebtId).orElse(null);
    }

    @Override
    @Transactional
    public void saveUserDebt(UserDebt userDebt) {
        userDebtRepository.save(userDebt);
    }

    @Override
    @Transactional
    public void deleteUserDebt(long userDebtId) {
        userDebtRepository.deleteById(userDebtId);
    }

    /*@Override
    public UserDebt findUserDebtByDescription(String userDebtDescription) {
        
    }*/

}
