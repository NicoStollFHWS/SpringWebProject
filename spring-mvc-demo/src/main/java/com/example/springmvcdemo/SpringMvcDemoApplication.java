package com.example.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //hier findet ein Component Scan statt
public class SpringMvcDemoApplication{

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(SpringMvcDemoApplication.class, args);

        //zeigt alle Beans an
        // @Service/@Component/@Bean erzeugt eine Bean
        for(String s : appContext.getBeanDefinitionNames()) {
            if(s == "customer")
            System.out.println(s + " is a Bean now");
        }
    }

    @Bean //wird initialisiert wenn es benötigt wird also wenn ein Customer erzeut wird
    public String getName() {
        return "Nico";
    }
}
