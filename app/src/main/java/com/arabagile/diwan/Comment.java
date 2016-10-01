package com.arabagile.diwan;

import java.util.Date;

/**
 * Created by trainer on 10/1/16.
 */

public class Comment {

    String author;
    Date data;
    String bodyText;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }
}
