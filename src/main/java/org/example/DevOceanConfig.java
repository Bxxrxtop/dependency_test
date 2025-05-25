package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DevOceanProperties.class)
public class DevOceanConfig {

    @Bean
    @ConditionalOnMissingBean(DevOcean.class)
    public DevOcean devOcean(DevOceanProperties properties){
        DevOcean devOcean = new DevOcean();
        devOcean.setGroupName(properties.getGroupName());
        devOcean.setMemberCount(properties.getMemberCount());

        return devOcean;
    }
}