package com.example.doublenumber;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestingWebDouble {

    @LocalServerPort
    private int port;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void shouldReturnDouble(){
        org.assertj.core.api.Assertions.assertThat(this.restTemplate.getForObject("http://localhost:"+port+"/doubleNum?number=500",Integer.class)).isEqualTo(1000);
    }
}
