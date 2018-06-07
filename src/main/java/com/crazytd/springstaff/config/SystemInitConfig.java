package com.crazytd.springstaff.config;

import com.heweather.sdk.api.HeConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SystemInitConfig {




    @PostConstruct
    public  void init(){
        System.out.println("项目启动时调用");
    }

}
