package com.blogappRest.blogAppRestApi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private List<PostDto> content;
    private int pageNo;
    private int totalSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
    private int pageSize;
}
