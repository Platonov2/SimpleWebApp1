package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList();

        posts.add(new Post("Первый пост", 186));
        posts.add(new Post("Второй пост", 4783));
        posts.add(new Post("Третий пост", 179));

        return posts;
    }
}
