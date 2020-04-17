package ru.netology.domain;

public class Photo {
    private int id;
    private int owerId;
    private String photoUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwerId() {
        return owerId;
    }

    public void setOwerId(int owerId) {
        this.owerId = owerId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
