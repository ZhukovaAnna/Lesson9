package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int authorId;
    private int data;
    private String text;
    private int friendOnly;
    private CommentsInfo CommentsInfo;
    private Like Like;
    private Repost Repost;
    private int view;
    private Geolocation Geolocation;
    private String history;
    private int canFix;
    private int canDelete;
    private int canEdit;
    private int isFix;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private String postType;
    private String postSource;
    private int signerId;
    private int isPinned;
    private int markedAsAds;
    private int isFavorite;
    private int postponedId;
    private Photo Photo;
    private Video Video;

    public Post() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFriendOnly() {
        return friendOnly;
    }

    public void setFriendOnly(int friendOnly) {
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

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
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

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostSource() {
        return postSource;
    }

    public void setPostSource(String postSource) {
        this.postSource = postSource;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public ru.netology.domain.Photo getPhoto() {
        return Photo;
    }

    public void setPhoto(ru.netology.domain.Photo photo) {
        Photo = photo;
    }

    public ru.netology.domain.Video getVideo() {
        return Video;
    }

    public void setVideo(ru.netology.domain.Video video) {
        Video = video;
    }
}

