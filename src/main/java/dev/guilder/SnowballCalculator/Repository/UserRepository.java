
package dev.guilder.SnowballCalculator.Repository;

import dev.guilder.SnowballCalculator.Entitys.Users;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Users, Long>{
    //User findUserByName(String firstName);
}
