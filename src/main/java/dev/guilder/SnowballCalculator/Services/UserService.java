
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Users;
import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public void saveUser(Users users);
    public Users getUserById(long id);
    public void deleteUser(long id);
    //public User findUserByName(String firstName);
}
