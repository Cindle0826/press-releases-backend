package com.presses;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.presses.mapper")
public class PressReleasesBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PressReleasesBackendApplication.class, args);
    }

}
