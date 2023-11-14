package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FinalApplicationTests {

    @Test
    void contextLoads() {
        // You can add meaningful assertions here
        assertThat(true).isTrue();
    }
}
