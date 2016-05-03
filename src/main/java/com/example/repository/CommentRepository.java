package com.example.repository;

import com.example.entity.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by daehan on 2016. 5. 3..
 */
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    List<Comment> findByComment(String comment);

    @Query("select c from Comment c where c.comment = ?1")
    List<Comment> findCustomQuery(String comment);
}
