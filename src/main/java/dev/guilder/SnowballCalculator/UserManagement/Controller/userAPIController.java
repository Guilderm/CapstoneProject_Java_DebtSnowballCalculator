package dev.guilder.SnowballCalculator.UserManagement.Controller;

import dev.guilder.SnowballCalculator.UserManagement.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/UserManagement")
@AllArgsConstructor
public class userAPIController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "confirmUser")
    public String confirm(@RequestParam("token") String token) {
        return userService.confirmToken(token);
    }
}
