package com.fan.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Chengming Fan on 2023/5/15 14:19
 */
@SpringBootApplication(scanBasePackages = "com.fan")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
