package org.semicolon.dummy;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private String bookId;
    private LocalDateTime localDateTime;
    private int price;

    public Book(String title, String bookId, LocalDateTime localDateTime, int price) {
        this.title = title;
        this.bookId = bookId;
        this.localDateTime = localDateTime;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
