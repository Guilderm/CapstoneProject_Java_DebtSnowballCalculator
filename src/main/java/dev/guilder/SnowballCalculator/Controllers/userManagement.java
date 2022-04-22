
package dev.guilder.SnowballCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userManagement {
    @GetMapping("/userSignUp")
    public String userSignUpPage(){
        return "userManagement/userSignUp";
    }
    
    @GetMapping("/login")
    public String loginPage(){
        return "userManagement/loginPage";
    }
    
    @GetMapping("/profile")
    public String profilePage(){
        return "userManagement/profilePage";
    }
    
    @GetMapping("/shoppingCart")
    public String shoppingCartPage(){
        return "userManagement/shoppingCartPage";
    }
}
