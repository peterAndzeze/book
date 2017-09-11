package com.book.model;

/**
 * Created by wodezuiaishinageren on 2017/9/11.
 */

public class BookModel {
    private Long id;
    private String bookName;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
