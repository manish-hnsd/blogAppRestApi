package com.blogappRest.blogAppRestApi.service.impl;

import com.blogappRest.blogAppRestApi.payload.PostDto;
import com.blogappRest.blogAppRestApi.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
