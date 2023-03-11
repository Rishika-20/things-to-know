package com.knoldus.game;

public class Player {
     private String name;
     private int score;
     private int level;
       Player(String name, int score, int level)
       {
           this.name = name;
           this.score = score;
           this.level = level;
       }
     public void setName(String name) { this.name = name; }
       public String getName() { return name; }
    public void setScore(int score) { this.score = score; }
    public int getScore() { return score; }
    public void setLevel(int level) { this.level = level; }
    public int getLevel() { return level; }
}
