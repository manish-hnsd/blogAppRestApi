package com.blogappRest.blogAppRestApi.repository;

import com.blogappRest.blogAppRestApi.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
