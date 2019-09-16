package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList();

        posts.add(new Post("Первый пост", new Date(119, 06, 14, 13, 12, 11),186));
        posts.add(new Post("Второй пост", new Date(105, 07, 16, 5, 8, 51),4783));
        posts.add(new Post("Третий пост", new Date(114, 11, 07, 20, 45, 14),179));

        return posts;
    }
}
