package com.crazytd.springstaff.beaninit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class DiscConfig {

    @Bean
    public Disc gameDisc(){
        return  new GameDisc();
    }
}
