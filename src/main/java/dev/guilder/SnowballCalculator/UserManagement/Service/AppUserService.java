package dev.guilder.SnowballCalculator.UserManagement.Service;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUsers;
import dev.guilder.SnowballCalculator.UserManagement.Entitys.ConfirmationToken;
import dev.guilder.SnowballCalculator.UserManagement.Repository.AppUserRepository;
import dev.guilder.SnowballCalculator.UserManagement.Service.Registration.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService, UserService {

    private final static String USER_NOT_FOUND_MSG =
            "user with email %s not found";

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ConfirmationTokenService confirmationTokenService;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(AppUsers appUsers) {
        boolean userExists = appUserRepository
                .findByEmail(appUsers.getEmail())
                .isPresent();

        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("email already taken");
        }

        String encodedPassword = bCryptPasswordEncoder
                .encode(appUsers.getPassword());

        appUsers.setPassword(encodedPassword);

        appUserRepository.save(appUsers);

        String token = UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                appUsers
        );

        confirmationTokenService.saveConfirmationToken(
                confirmationToken);

//        TODO: SEND EMAIL

        return token;
    }

    public int enableAppUser(String email) {
        return appUserRepository.enableAppUser(email);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AppUsers> getAllUsers() {
        return (List<AppUsers>) appUserRepository.findAll();
    }

    @Transactional
    public void saveUser(AppUsers appUsers) {
        appUserRepository.save(appUsers);
    }

    @Override
    @Transactional(readOnly = true)
    public AppUsers getUserById(long id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        appUserRepository.deleteById(id);
    }

    /*@Override
    @Transactional (readOnly = true)
    public User findUserByName(String firstName) {
        return userRepository.findUserByName(firstName);
    }*/
}
