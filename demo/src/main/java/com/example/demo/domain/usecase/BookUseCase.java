package com.example.demo.domain.usecase;

import com.example.demo.domain.model.Book;
import com.example.demo.domain.model.gateways.BookRepository;
import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class BookUseCase {

    private final BookRepository bookRepository;

    public BookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.saveBook(book);
    }

    public Book getBookIsbn(String isbn){
        return bookRepository.getBookIsbn(isbn);
    }
}
