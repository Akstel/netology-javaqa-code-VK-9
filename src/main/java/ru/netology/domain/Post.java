package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String content;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;
    private int replyOwnerId;
    private int replyPostId;
    private int postponedId;
    private int friendsOnly;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;

    // + get/set на все поля
}