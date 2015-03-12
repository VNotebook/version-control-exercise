package org.vnotebook.versioning;

public class Regular extends User{
    public int getPostViews() {
        return postViews;
    }

    public int getStrikesNumber() {
        return strikesNumber;
    }

    public int getStarsNumber() {
        return starsNumber;
    }

    public void setPostViews(int postViews) {
        this.postViews = postViews;
    }

    public void setStrikesNumber(int strikesNumber) {
        this.strikesNumber = strikesNumber;
    }

    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }

    private int postViews;
    private int strikesNumber;
    private int starsNumber;
}
