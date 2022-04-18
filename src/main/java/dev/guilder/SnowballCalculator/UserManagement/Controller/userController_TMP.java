package dev.guilder.SnowballCalculator.UserManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController_TMP {

    @GetMapping("/login_TMP")
    public String loginPage_TMP() {
        return "userManagement/loginPage_TMP";
    }
}
