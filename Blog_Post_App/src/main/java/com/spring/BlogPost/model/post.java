package com.spring.BlogPost.model;

import javax.persistence.Column;

public class post
{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;
}
