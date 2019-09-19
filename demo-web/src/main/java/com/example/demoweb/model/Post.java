package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Date creationDate;
    private Integer likes = 0;
    private Integer id;

    public Post(Integer id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getId() {
        return id;
    }
}
