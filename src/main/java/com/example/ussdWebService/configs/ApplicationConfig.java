package com.example.ussdWebService.configs;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "decoded") //used when you want to include external config
public class ApplicationConfig {
    private CacheConfigurationProperties cache;
    @Getter(value = AccessLevel.PUBLIC)
    private class CacheConfigurationProperties{
        private Integer port;
        protected String host;
        private String password;
        private String defaultTtl;
    }
}
