package dev.guilder.SnowballCalculator.UserManagement.Service;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUsers;

import java.util.List;

public interface UserService {
    List<AppUsers> getAllUsers();

    void saveUser(AppUsers appUsers);

    AppUsers getUserById(long id);

    void deleteUser(long id);
    //public User findUserByName(String firstName);
}
