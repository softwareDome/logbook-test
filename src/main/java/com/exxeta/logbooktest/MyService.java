package com.exxeta.logbooktest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@ComponentScan("com.exxeta.logbooktest")
public class MyService {


    public MyResponse justDoIt(final String request) {
        log.info("request: {}", request);
        return MyResponse.builder().name(request).build();
    }

}


