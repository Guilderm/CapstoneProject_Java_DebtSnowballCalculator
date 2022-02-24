package dev.guilder.SnowballCalculator_CapstoneProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class snowballApp {

    @GetMapping("/calculator")
    public String snowballCalculator() {
        return "snowballApp/snowballCalculator";
    }
}
