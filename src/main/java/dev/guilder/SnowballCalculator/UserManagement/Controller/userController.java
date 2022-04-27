package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Repository.newUser;
import dev.guilder.SnowballCalculator.UserManagement.Service.Registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/UserManagement")
@AllArgsConstructor
public class userController {

    private final RegistrationService registrationService;

    @PostMapping(path = "RegisterUser")
    public String register(@RequestBody newUser request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirmUser")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
