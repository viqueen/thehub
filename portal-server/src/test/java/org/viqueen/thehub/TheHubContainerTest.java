package org.viqueen.thehub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.viqueen.thehub.configuration.HomeController;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

// TODO : this should really be staging not dev
@ActiveProfiles("dev")
@SpringBootTest
@RunWith(SpringRunner.class)
public class TheHubContainerTest {

    @Autowired
    private HomeController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
