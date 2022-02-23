package dev.guilder.sc403_desaapliweb_finalproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Public {
    @GetMapping("/")
    public String Home() {
        return "public/home";
    }

    @GetMapping("/pricing")
    public String contactPage() {
        return "public/pricing";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "public/about";
    }

    @GetMapping("/calculator")
    public String calculator() {
        return "public/calculator";
    }
}
