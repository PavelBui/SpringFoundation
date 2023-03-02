package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
@Component
@Profile("QA")
public class QaAutoSpringConfig {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:qa");
        dataSourceBuilder.username("qa");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}


