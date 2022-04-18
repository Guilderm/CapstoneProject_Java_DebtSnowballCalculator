package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Repository.RegistrationRequest;
import dev.guilder.SnowballCalculator.UserManagement.Service.registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
