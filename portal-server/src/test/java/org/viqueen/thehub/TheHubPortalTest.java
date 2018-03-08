package org.viqueen.thehub;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

// TODO : this should really be staging not dev
@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TheHubPortalTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

//    @Test
//    public void testGetCustomerById() {
//        final String customerId = UUID.randomUUID().toString();
//        assertThat(
//                restTemplate.getForObject(
//                        format("http://localhost:%d/customers/%s", port, customerId),
//                        Customer.class)
//        ).hasFieldOrPropertyWithValue("customerId", customerId);
//    }
}
