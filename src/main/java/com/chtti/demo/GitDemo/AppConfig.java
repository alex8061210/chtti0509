package com.chtti.demo.GitDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="add")
    Calculator addCalculator (){
        return new AddCalculator();
    }

    @Bean(name="sub")
    Calculator calculator2 (){
        return new SubCalculator();
    }
}
