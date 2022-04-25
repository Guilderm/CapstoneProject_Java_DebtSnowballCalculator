package dev.guilder.SnowballCalculator.UserManagement.Service;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;

import java.util.List;

public interface UserService {
    List<AppUser> getAllUsers();

    void saveUser(AppUser appUser);

    AppUser getUserById(long id);

    void deleteUser(long id);
    //public User findUserByName(String firstName);
}
