package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Repository.RegistrationRequest;
import dev.guilder.SnowballCalculator.UserManagement.Service.Registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/UserManagement")
@AllArgsConstructor
//@Controller
public class userController {

    private final RegistrationService registrationService;

    @GetMapping("/profile")
    public String profileDashboard() {
        return "userManagement/profilePage";
    }

    @GetMapping("/userSignUp")
    public String userSignUpPage() {
        return "userManagement/userSignUp";
    }

    @GetMapping("/login")
    public String loginPage(){ return "userManagement/loginPage";
    }

    @PostMapping(path = "RegisterUser")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirmUser")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}
