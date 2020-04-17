package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int authorId;
    private int data;
    private String text;
    private String friendOnly;
    private CommentsInfo CommentsInfo;
    private Like Like;
    private Repost Repost;
    private String view;
    private Attachmen Attachmen;
    private Geolocation Geolocation;
    private String history;
    private int canFix;
    private int canDelete;
    private int canEdit;
    private int isFix;

    public Post() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFriend() {
        return friendOnly;
    }

    public void setFriend(boolean friend) {
        this.friendOnly = friendOnly;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getFriendOnly() {
        return friendOnly;
    }

    public void setFriendOnly(String friendOnly) {
        this.friendOnly = friendOnly;
    }

    public ru.netology.domain.CommentsInfo getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(ru.netology.domain.CommentsInfo commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public ru.netology.domain.Like getLike() {
        return Like;
    }

    public void setLike(ru.netology.domain.Like like) {
        Like = like;
    }

    public ru.netology.domain.Repost getRepost() {
        return Repost;
    }

    public void setRepost(ru.netology.domain.Repost repost) {
        Repost = repost;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public ru.netology.domain.Attachmen getAttachmen() {
        return Attachmen;
    }

    public void setAttachmen(ru.netology.domain.Attachmen attachmen) {
        Attachmen = attachmen;
    }

    public ru.netology.domain.Geolocation getGeolocation() {
        return Geolocation;
    }

    public void setGeolocation(ru.netology.domain.Geolocation geolocation) {
        Geolocation = geolocation;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getCanFix() {
        return canFix;
    }

    public void setCanFix(int canFix) {
        this.canFix = canFix;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsFix() {
        return isFix;
    }

    public void setIsFix(int isFix) {
        this.isFix = isFix;
    }
}

