
package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long>{
    //User findUserByName(String firstName);
}
