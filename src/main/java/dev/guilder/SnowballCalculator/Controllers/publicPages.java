package dev.guilder.SnowballCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicPages {
    @GetMapping("/")
    public String HomePage() {
        return "publicPages/homePage";
    }

    @GetMapping("/pricing")
    public String contactPage() {
        return "publicPages/pricingPage";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "publicPages/aboutPage";
    }
}
