package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daehan on 2016. 5. 1..
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<String> getComment() {
        return new ResponseEntity<>("Hello~", HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getAllComments() {
        ArrayList<String> result = new ArrayList<>();

        return new ResponseEntity<List<String>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public ResponseEntity<String> addComment() {
        return new ResponseEntity<>("Hello~", HttpStatus.OK);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeComment() {
        return new ResponseEntity<>("Hello~", HttpStatus.OK);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ResponseEntity<String> editComment() {
        return new ResponseEntity<>("Hello~", HttpStatus.OK);
    }
}
