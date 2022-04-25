package dev.guilder.SnowballCalculator.Services;

import dev.guilder.SnowballCalculator.Entitys.Users;
import dev.guilder.SnowballCalculator.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepositoryTMP;

    @Override
    @Transactional(readOnly = true)
    public List<Users> getAllUsers() {
        return (List<Users>) userRepositoryTMP.findAll();
    }

    @Override
    @Transactional
    public void saveUser(Users users) {
        userRepositoryTMP.save(users);
    }

    @Override
    @Transactional(readOnly = true)
    public Users getUserById(long id) {
        return userRepositoryTMP.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepositoryTMP.deleteById(id);
    }

    /*@Override
    @Transactional (readOnly = true)
    public User findUserByName(String firstName) {
        return userRepository.findUserByName(firstName);
    }*/
}
