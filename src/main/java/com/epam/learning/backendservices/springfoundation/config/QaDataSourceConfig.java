package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("QA")
public class QaDataSourceConfig implements DataSourceConfig{

    @Override
    public String getUrl() {
        return "jdbc:h2:mem:qa";
    }
    @Override
    public String getUsername() {
        return "qa";
    }
    @Override
    public String getPassword() {
        return "qa";
    }
}
