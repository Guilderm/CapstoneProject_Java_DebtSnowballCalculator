package dev.guilder.SnowballCalculator.Configurations;

import dev.guilder.SnowballCalculator.SnowballCalculator_Application;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SnowballCalculator_Application.class);
    }
}
