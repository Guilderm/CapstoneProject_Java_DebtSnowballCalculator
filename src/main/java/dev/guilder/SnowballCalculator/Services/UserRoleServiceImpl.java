
package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.UserRole;
import dev.guilder.SnowballCalculator.Repository.UserRoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Autowired
    private UserRoleRepository userRoleRepository;
    
    @Override
    @Transactional (readOnly = true)
    public List<UserRole> getAllUsersRole() {
        return (List<UserRole>)userRoleRepository.findAll();
    }
    
    @Override
    @Transactional (readOnly = true)
    public UserRole getUserRoleById(long userRoleId) {
        return userRoleRepository.findById(userRoleId).orElse(null);
    }
    
    @Override
    @Transactional
    public void saveRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }

    @Override
    @Transactional
    public void deleteRole(long userRoleId) {
        userRoleRepository.deleteById(userRoleId);
    }

    /*@Override
    @Transactional (readOnly = true)
    public UserRole findUserRoleByName(String roleName) {
        return userRoleRepository.findUserRoleByName(roleName);
    }*/
}
