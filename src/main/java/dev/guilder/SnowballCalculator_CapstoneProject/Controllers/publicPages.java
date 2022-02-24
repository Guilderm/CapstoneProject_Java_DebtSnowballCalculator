package dev.guilder.SnowballCalculator_CapstoneProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicPages {
    @GetMapping("/")
    public String HomePage() {
        return "publicPages/home";
    }

    @GetMapping("/pricing")
    public String contactPage() {
        return "publicPages/pricing";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "publicPages/about";
    }
}
