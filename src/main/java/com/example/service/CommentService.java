package com.example.service;

import com.example.entity.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daehan on 2016. 5. 2..
 */
@Service
public class CommentService {

    private final static Logger logger = LoggerFactory.getLogger(CommentService.class);

    public Comment getComment() {
        logger.info("getComment called");
        return new Comment();
    }

    public List<Comment> getAllComments() {
        ArrayList<Comment> result = new ArrayList<>();

        return result;
    }

    public Comment addComment() {
        return new Comment();
    }

    public Comment removeComment() {
        return new Comment();
    }

    public Comment editComment() {
        return new Comment();
    }
}
