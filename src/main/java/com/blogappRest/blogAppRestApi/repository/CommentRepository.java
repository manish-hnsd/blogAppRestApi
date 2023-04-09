package com.blogappRest.blogAppRestApi.repository;

import com.blogappRest.blogAppRestApi.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostId(long postId);
}
