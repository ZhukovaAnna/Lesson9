package ru.netology.domain;

public class Video {
    private int id;
    private int owerId;
    private int data;
    private String description;
    private String view;
    private String comment;
    private boolean favorit;
    private boolean canAdd;
    private boolean canEdit;
    private boolean isPrivat;

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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isFavorit() {
        return favorit;
    }

    public void setFavorit(boolean favorit) {
        this.favorit = favorit;
    }

    public boolean isCanAdd() {
        return canAdd;
    }

    public void setCanAdd(boolean canAdd) {
        this.canAdd = canAdd;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPrivat() {
        return isPrivat;
    }

    public void setPrivat(boolean privat) {
        isPrivat = privat;
    }
}
