package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> posts = new ArrayList();

    public PostService(){
        posts.add(new Post(posts.size(),"Первый пост", new Date(119, 06, 14, 13, 12, 11)));
        posts.add(new Post(posts.size(),"Второй пост", new Date(105, 07, 16, 5, 8, 51)));
        posts.add(new Post(posts.size(),"Третий пост", new Date(114, 11, 07, 20, 45, 14)));
    }

    public void create(String text) {
        posts.add(new Post(posts.size(),text, new Date()));
    }
}
