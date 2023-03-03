package com.epam.learning.backendservices.springfoundation.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("DEV")
public class DataSourceConfigTests {

    @Autowired
    DataSourceConfig dataSourceConfig;

    @Test
    public void devDataSourceConfigTest() {

        ApplicationContextRunner contextRunner = new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(MySpringConfig.class));

        assert("dev").equals(dataSourceConfig.getUsername());
    }
}
