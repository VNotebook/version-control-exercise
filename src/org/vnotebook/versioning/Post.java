package org.vnotebook.versioning;

import java.util.Date;
import java.util.List;

public class Post {
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void comment(String comment) {
        // Suppose we implement comment here...
    }

    public void rate(int stars) {
        // Suppose we implement rate here...
    }

    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private List<Post> posts;
}
