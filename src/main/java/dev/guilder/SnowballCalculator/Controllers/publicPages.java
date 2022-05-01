package dev.guilder.SnowballCalculator.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicPages {
    @GetMapping({"/", "/Home"})
    public String HomePage(Model model) {
        return "publicPages/homePageTMP";
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
