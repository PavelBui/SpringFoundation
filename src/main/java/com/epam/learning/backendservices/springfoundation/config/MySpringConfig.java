package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MySpringConfig {

    @Autowired
    private DataSourceProperties dataSourceProperties;
    @Bean
    @ConditionalOnMissingBean(DataSource.class)
    public DataSource getAlternativeDataSource() {
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }

}
