package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Users;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();

    void saveUser(Users users);

    Users getUserById(long id);

    void deleteUser(long id);
    //public User findUserByName(String firstName);
}
