package com.example.redis;


import java.io.Serializable;

public class User implements Serializable {

    private String name;

    private int score;

    public User(String name,int score){
        this.name = name;
        this.score = score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
}
