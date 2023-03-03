package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AutoSpringConfig {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url(dataSourceProperties.getUrl());
        dataSourceBuilder.username(dataSourceProperties.getUsername());
        dataSourceBuilder.password(dataSourceProperties.getPassword());
        return dataSourceBuilder.build();
    }

}


