package com.aquarius.featuresprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@SpringBootApplication
public class BootFeaturesProfileApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootFeaturesProfileApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        System.out.println(systemEnvironment);
        System.out.println("===================");
        System.out.println(systemProperties);

    }

}
