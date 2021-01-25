package com.exxeta.logbooktest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        log.info("Starting application 'logbook-test' ...");
        SpringApplication.run(Application.class, args);
    }

}
