package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by architecture on 2016. 4. 28..
 */

@RestController("/test")
public class TestController {

    @RequestMapping(value = "add", method = RequestMethod.PUT)
    public String addRecord() {
        return "aaaa";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String getRecord() {
        return "aaaa";
    }

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public String getRecords() {
        return "aaaa";
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String deleteRecord() {
        return "aaaa";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String editRecord() {
        return "aaaa";
    }
}
