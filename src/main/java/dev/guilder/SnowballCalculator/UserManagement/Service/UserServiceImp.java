package dev.guilder.SnowballCalculator.UserManagement.Service;

import dev.guilder.SnowballCalculator.UserManagement.Entitys.AppUser;
import dev.guilder.SnowballCalculator.UserManagement.Entitys.ConfirmationToken;
import dev.guilder.SnowballCalculator.UserManagement.Entitys.UserRole;
import dev.guilder.SnowballCalculator.UserManagement.Repository.AppUserRepository;
import dev.guilder.SnowballCalculator.UserManagement.Service.Registration.ConfirmationTokenService;
import dev.guilder.SnowballCalculator.Utilities.EMail.BuildEmail;
import dev.guilder.SnowballCalculator.Utilities.EMail.EmailSender;
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
public class UserServiceImp implements UserDetailsService, UserService {

    private final static String USER_NOT_FOUND_MSG =
            "user with email %s not found";

    private final AppUserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ConfirmationTokenService confirmationTokenService;

    private final EmailSender emailSender;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(AppUser appUser) {
        boolean userExists = appUserRepository
                .findByEmail(appUser.getEmail())
                .isPresent();

        if (userExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("email already taken");
        }

        String encodedPassword = bCryptPasswordEncoder
                .encode(appUser.getPassword());

        appUser.setPassword(encodedPassword);

        appUserRepository.save(appUser);

        String token = UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                appUser
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
    public List<AppUser> getAllUsers() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    @Transactional
    public void registerUser(AppUser registrationRequest) {

        registrationRequest.setPassword(bCryptPasswordEncoder.encode(registrationRequest.getPassword()));
        registrationRequest.setUserRole(UserRole.USER);
        registrationRequest.setEnabled(Boolean.TRUE);

        boolean userExists = appUserRepository
                .findByEmail(registrationRequest.getEmail())
                .isPresent();

        if (userExists) {
            // TODO if email not confirmed send confirmation email.
            // TODO if email is present give a proper message.
            throw new IllegalStateException("email already taken");
        }

        //Todo: setup a email validation process

        appUserRepository.save(registrationRequest);

        String link = "http://localhost/api/v1/UserManagement/confirmUser?token=" + GetToken(registrationRequest);
        emailSender.send(
                registrationRequest.getEmail(),
                BuildEmail.buildEmail(registrationRequest.getFirstName(), link));
    }

    public String GetToken(AppUser registrationRequest) {

        String token = UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusWeeks(1),
                registrationRequest
        );

        confirmationTokenService.saveConfirmationToken(
                confirmationToken);

        return token;
    }

    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() ->
                        new IllegalStateException("Token not found"));

        if (confirmationToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = confirmationToken.getExpiresAt();

        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }

        confirmationTokenService.setConfirmedAt(token);

        enableAppUser(confirmationToken.getAppUser().getEmail());

        return "confirmed";
    }

    @Override
    @Transactional(readOnly = true)
    public AppUser getUserById(long id) {
        return appUserRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        appUserRepository.deleteById(id);
    }
}
