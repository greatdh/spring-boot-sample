package com.example.controller;

import com.example.entity.Comment;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by daehan on 2016. 5. 1..
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<Comment> getComment(@RequestParam int id) {
        return new ResponseEntity<>(commentService.getComment(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Comment>> getAllComments() {
        return new ResponseEntity<List<Comment>>(commentService.getAllComments(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        return new ResponseEntity<>(commentService.addComment(comment), HttpStatus.OK);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public ResponseEntity<String> removeComment(@RequestParam int id) {
        return new ResponseEntity<>(commentService.removeComment(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ResponseEntity<Comment> editComment(@RequestBody Comment comment) {
        return new ResponseEntity<>(commentService.editComment(comment), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByComment", method = RequestMethod.GET)
    public ResponseEntity<List<Comment>> getCommentsByComment(@RequestParam String comment) {
        return new ResponseEntity<>(commentService.getCommentsByComment(comment), HttpStatus.OK);
    }
}
