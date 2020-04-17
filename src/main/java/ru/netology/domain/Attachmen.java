package ru.netology.domain;

public class Attachmen {
    private Photo Photo;
    private String audio;
    private Video Video;
    private String document;
    private String link;
    private String albumPhoto;
    private Card Card;
    private String even;

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAlbumPhoto() {
        return albumPhoto;
    }

    public void setAlbumPhoto(String albumPhoto) {
        this.albumPhoto = albumPhoto;
    }

    public Card getCard() {
        return Card;
    }

    public void setCard(Card card) {
        Card = card;
    }

    public String getEven() {
        return even;
    }

    public void setEven(String even) {
        this.even = even;
    }
}
