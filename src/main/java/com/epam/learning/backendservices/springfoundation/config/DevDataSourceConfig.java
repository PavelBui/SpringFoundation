package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("DEV")
public class DevDataSourceConfig implements DataSourceConfig{

    @Override
    public String getUrl() {
        return "jdbc:h2:mem:dev";
    }
    @Override
    public String getUsername() {
        return "dev";
    }
    @Override
    public String getPassword() {
        return "dev";
    }
}
