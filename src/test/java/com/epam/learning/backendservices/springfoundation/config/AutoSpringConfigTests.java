package com.epam.learning.backendservices.springfoundation.config;

import com.epam.learning.backendservices.springfoundation.dao.UserRepository;
import com.epam.learning.backendservices.springfoundation.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("DEV")
public class AutoSpringConfigTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void defaultDataSourceTest() {
        ApplicationContextRunner contextRunner = new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(AutoSpringConfig.class));
        contextRunner.run((context) -> {
            assertThat(context).hasSingleBean(DataSource.class);
            assertThat(context.getBean(DataSource.class))
                    .isSameAs(context.getBean(AutoSpringConfig.class).getDataSource());
        });

        userRepository.save(new User("Pavel Bui", "pavel_bui@epam.com"));
        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users).hasSize(1);
    }

}
