package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserDebt;

import java.util.List;

public interface UserDebtService {
    List<UserDebt> getAllUserDebts();

    UserDebt getUserDebtById(long userDebtId);

    void saveUserDebt(UserDebt userDebt);

    void deleteUserDebt(long userDebtId);
    //public UserDebt findUserDebtByDescription (String userDebtDescription);
}
