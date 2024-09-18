package org.example.config;

import org.example.model.Animal;
import org.example.model.Dog;
import org.example.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean
    public Animal wolf() {
        return new Dog();
    }

    @Bean
    public Timer timer() {
        return new Timer();
    }
}