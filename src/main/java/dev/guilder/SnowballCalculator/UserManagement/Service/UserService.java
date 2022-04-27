package dev.guilder.SnowballCalculator.UserManagement.Service;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;

import java.util.List;

public interface UserService {
    List<AppUser> getAllUsers();

    void registerUser(AppUser appUser);

    AppUser getUserById(long id);

    void deleteUser(long id);

    String confirmToken(String token);
}
