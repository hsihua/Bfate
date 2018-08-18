package com.husihua.springboot.Entiy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration


public class Config {


   @Bean
    public User user(){
       User c = new User();

       c.setUserName("huhuhu");
       return c;
   }
}
