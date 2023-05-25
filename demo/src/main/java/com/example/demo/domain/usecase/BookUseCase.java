package com.example.demo.domain.usecase;

import com.example.demo.domain.model.Book;
import com.example.demo.domain.model.dto.BookDTO;
import com.example.demo.domain.model.gateways.BookRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BookUseCase {

    private final BookRepository bookRepository;

//    public BookUseCase(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public BookDTO createBook(BookDTO bookDTO){
        return BookDTO
                .fromDomain(
                        bookRepository.saveBook(bookDTO.toDomain())
                );
    }

    public BookDTO getBookByIsbn(String isbn) {
        return BookDTO
                .fromDomain(
                        bookRepository.getBookByIsbn(isbn)
                );
    }
}
