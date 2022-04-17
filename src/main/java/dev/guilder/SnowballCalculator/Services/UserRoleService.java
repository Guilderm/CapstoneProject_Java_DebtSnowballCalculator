
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserRole;
import java.util.List;

public interface UserRoleService {
    public List<UserRole> getAllUsersRole();
    public UserRole getUserRoleById(long userRoleId);
    public void saveRole(UserRole userRole);
    public void deleteRole(long userRoleId);
    /*public UserRole findUserRoleByName(String roleName);*/
}
