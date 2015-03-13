package org.vnotebook.versioning;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by PCMiguel on 13/03/2015.
 */
public class Forum {
    private String name;
    private Date dateCreated;
    private String category;
    private ArrayList<Post> posts;

    public Forum(String name, Date dateCreated, String category) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.category = category;
        this.posts=new ArrayList<Post>();
    }

    public Forum() {
        this.posts=new ArrayList<Post>();
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void addPosts(Post post) {
        this.posts.add(post);
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
