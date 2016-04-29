package com.example.repository;

import com.example.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by architecture on 2016. 4. 28..
 */
@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
