package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> getAllUsersRole();

    UserRole getUserRoleById(long userRoleId);

    void saveRole(UserRole userRole);

    void deleteRole(long userRoleId);
    /*public UserRole findUserRoleByName(String roleName);*/
}
