package com.example.demo.domain.model;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private Boolean isAvailable;

    public Book(String tittle, String author, String isbn) {
        this.title = tittle;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }
}
