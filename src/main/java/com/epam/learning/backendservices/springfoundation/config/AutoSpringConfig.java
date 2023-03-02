package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AutoSpringConfig {

    @Bean
//    @Profile("DEV")
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:dev");
        dataSourceBuilder.username("dev");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }

//    @Bean
//    @Profile("QA")
//    public DataSource getQaDataSource() {
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
//        dataSourceBuilder.url("jdbc:h2:mem:qa");
//        dataSourceBuilder.username("qa");
//        dataSourceBuilder.password("");
//        return dataSourceBuilder.build();
//    }

}


