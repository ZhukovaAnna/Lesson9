package ru.netology.domain;

public class CommentsInfo {
    private String count;
    private String canPost;
    private String groupCanPost;
    private String canOpen;
    private String canClouse;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCanPost() {
        return canPost;
    }

    public void setCanPost(String canPost) {
        this.canPost = canPost;
    }

    public String getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(String groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public String getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(String canOpen) {
        this.canOpen = canOpen;
    }

    public String getCanClouse() {
        return canClouse;
    }

    public void setCanClouse(String canClouse) {
        this.canClouse = canClouse;
    }
}
