package com.epam.learning.backendservices.springfoundation.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MySpringConfig {
    @Bean
    @ConditionalOnMissingBean(DataSource.class)
    public DataSource getAlternativeDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/myDb?createDatabaseIfNotExist=true");
        dataSourceBuilder.username("mysqluser");
        dataSourceBuilder.password("mysqlpass");
        return dataSourceBuilder.build();
    }

}
