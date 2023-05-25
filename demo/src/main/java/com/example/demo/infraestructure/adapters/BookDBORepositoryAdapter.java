package com.example.demo.infraestructure.adapters;

import com.example.demo.domain.model.Book;
import com.example.demo.domain.model.gateways.BookRepository;
import com.example.demo.infraestructure.adapters.entity.BookDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class BookDBORepositoryAdapter implements BookRepository {

    private final BookDBORepository bookDBORepository;
    @Override
    public Book saveBook(Book book) {
        BookDBO bookDBO = BookDBO.fromDomain(book);
        bookDBO.setAvailable(true);
        return BookDBO.toDomain(bookDBORepository.save(bookDBO));
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return bookDBORepository.findById(isbn)
                .map(BookDBO::toDomain)
                .orElseThrow(RuntimeException::new);
    }
}
