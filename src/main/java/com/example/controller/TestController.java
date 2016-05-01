package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daehan on 2016. 5. 1..
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/hello")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Hello World", HttpStatus.ACCEPTED);
    }
}
