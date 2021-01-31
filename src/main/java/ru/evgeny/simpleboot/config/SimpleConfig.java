package ru.evgeny.simpleboot.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class SimpleConfig {

    @Bean
    public NameProvider getNameProvider() {
        return new NameProvider();
    }

}
