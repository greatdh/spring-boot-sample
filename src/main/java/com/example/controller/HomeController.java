package com.example.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by architecture on 2016. 4. 28..
 */
@RestController(value = "/home")
public class HomeController {

    @RequestMapping(value = "/index1", method = RequestMethod.GET)
    public String home() {
        return "Hello world";
    }
}
