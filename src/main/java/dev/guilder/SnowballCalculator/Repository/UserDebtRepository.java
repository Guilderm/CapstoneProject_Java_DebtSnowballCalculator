package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.UserDebt;
import org.springframework.data.repository.CrudRepository;


public interface UserDebtRepository extends CrudRepository<UserDebt, Long> {
    //UserDebt findUserDebtByDescription (String userDebtDescription);
}
