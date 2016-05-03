package com.example.repository;

import com.example.entity.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by daehan on 2016. 5. 3..
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
