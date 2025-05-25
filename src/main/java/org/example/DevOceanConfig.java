package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevOceanConfig {

    @Bean
    public DevOcean devOcean(){
        DevOcean devOcean = new DevOcean();
        devOcean.setGroupName("Back-End");
        devOcean.setMemberCount(4);

        return devOcean;
    }
}