package com.example.demo.domain.model.gateways;

import com.example.demo.domain.model.Book;

public interface BookRepository {

    Book saveBook(Book book);
    Book getBookIsbn(String isbn);

}
