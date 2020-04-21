package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupCanPost;
    private boolean canOpen;
    private boolean canClouse;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanClouse() {
        return canClouse;
    }

    public void setCanClouse(boolean canClouse) {
        this.canClouse = canClouse;
    }
}
