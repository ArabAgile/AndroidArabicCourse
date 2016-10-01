package com.arabagile.diwan;

import java.util.Date;
import java.util.List;

/**
 * Created by trainer on 10/1/16.
 */

public class Post {

    String author;
    String authorPicture;
    Date date;
    String bodyText;
    int comments_count;

    List<Comment> comments;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorPicture() {
        return authorPicture;
    }

    public void setAuthorPicture(String authorPicture) {
        this.authorPicture = authorPicture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
