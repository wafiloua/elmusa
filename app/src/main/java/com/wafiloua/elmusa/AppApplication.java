package com.wafiloua.elmusa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wafiloua.elmusa")
public class AppApplication {
    public static void main(String... args) {
        SpringApplication.run(AppApplication.class);
    }
}
