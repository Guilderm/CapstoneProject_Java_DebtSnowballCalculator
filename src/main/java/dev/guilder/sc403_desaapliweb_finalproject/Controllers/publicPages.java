package dev.guilder.sc403_desaapliweb_finalproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class publicPages {
    @GetMapping("/")
    public String Home() {
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
