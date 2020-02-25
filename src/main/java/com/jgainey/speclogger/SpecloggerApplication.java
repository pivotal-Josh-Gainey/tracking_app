package com.jgainey.speclogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpecloggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpecloggerApplication.class, args);
        Utils.initLogger();
    }



}
