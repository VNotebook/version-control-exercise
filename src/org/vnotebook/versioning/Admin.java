package org.vnotebook.versioning;

import java.util.ArrayList;

public class Admin extends User {
    private int level;
    private double rating;
    private ArrayList<Forum> forumsToModerate;
    
    public Admin(int level, double rating) {
        this.level = level;
        this.rating = rating;
        forumsToModerate = new ArrayList<>();
    }
    
    public Admin() {
        forumsToModerate = new ArrayList<>();
    }
    
    public void addForum(Forum forum) {
        forumsToModerate.add(forum);
    }
    
    public ArrayList<Forum> getForums() {
        return forumsToModerate;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public double getRating() {
        return rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
}
