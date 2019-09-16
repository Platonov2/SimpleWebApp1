package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Date creationDate;
    private Integer likes;

    public Post(String text, Date creationDate, Integer likes){
        this.text = text;
        this.creationDate = creationDate;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }
}
