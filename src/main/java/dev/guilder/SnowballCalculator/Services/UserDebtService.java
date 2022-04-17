
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserDebt;
import java.util.List;

public interface UserDebtService {
    public List<UserDebt> getAllUserDebts();
    public UserDebt getUserDebtById(long userDebtId);
    public void saveUserDebt(UserDebt userDebt);
    public void deleteUserDebt(long userDebtId);
    //public UserDebt findUserDebtByDescription (String userDebtDescription);
}
