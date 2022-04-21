package com.springblog.springblog.models;


import javax.persistence.*;

@Entity
public class Posts
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;
    @Column(nullable = false)
    private String body;

    public Posts(String title, String body) {
        this.title = title;
        this.body = body;
    }
public Posts(){};
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
