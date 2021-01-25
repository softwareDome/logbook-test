package com.exxeta.logbooktest;

import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class Controller {
    private final MyService myService;

    @Timed
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/justdoit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MyResponse> justdoit(@RequestParam final String identifier) {
        log.info("justdoit - identifier: " + identifier);
        return new ResponseEntity<>(myService.justDoIt(identifier), HttpStatus.OK);
    }

}
