package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Repository.RegistrationRequest;
import dev.guilder.SnowballCalculator.UserManagement.Service.registration.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/UserManagement")
@AllArgsConstructor
//@Controller
public class userController {
    private final RegistrationService registrationService;

    @GetMapping("/login")
    public String loginPage() {
        return "userManagement/loginPage_TMP";
    }

    @GetMapping("/profile")
    public String profileDashboard() {
        return "userManagement/profilePage";
    }

    @GetMapping("/userSignUp")
    public String userSignUpPage() {
        return "userManagement/userSignUp";
    }

    @GetMapping("/shoppingCart")
    public String shoppingCartPage() {
        return "userManagement/shoppingCartPage";
    }

    @PostMapping(path = "Register_User")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm_User")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }
}