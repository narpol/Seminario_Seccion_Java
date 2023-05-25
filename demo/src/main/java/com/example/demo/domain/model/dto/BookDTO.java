package com.example.demo.domain.model.dto;

import com.example.demo.domain.model.Book;

public class BookDTO {
    private String tittle;
    private String author;
    private String isbn;

    public BookDTO(String tittle, String author, String isbn) {
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;
    }

    public Book toDomain(){
        return new Book(tittle, author,isbn);
    }

    public static BookDTO fromDomain(Book book){
        return new BookDTO(book.getTitle(), book.getAuthor(), book.getIsbn());
    }



    public String getTittle() {
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
