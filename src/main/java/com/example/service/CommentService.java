package com.example.service;

import com.example.entity.Comment;
import com.example.repository.CommentRepository;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daehan on 2016. 5. 2..
 */
@Service
public class CommentService {

    private final static Logger logger = LoggerFactory.getLogger(CommentService.class);

    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment(int id) {
        logger.info("getComment called");
        return commentRepository.findOne(id);
    }

    public List<Comment> getAllComments() {
        return Lists.newArrayList(commentRepository.findAll());
    }

    public Comment addComment() {
        return new Comment();
    }

    public String removeComment(int id) {
        commentRepository.delete(id);

        if (commentRepository.findOne(id) == null) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public Comment editComment() {
        return new Comment();
    }
}
