package com.example.demo.infraestructure.entrypoint;

import com.example.demo.domain.model.dto.BookDTO;
import com.example.demo.domain.usecase.BookUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookApiRest {
    private final BookUseCase bookUseCase;

    @PostMapping()
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        return new ResponseEntity<>(bookUseCase.createBook(bookDTO), HttpStatus.CREATED);
    }


    @GetMapping("/{isbn}")
    public ResponseEntity<BookDTO> getBookByIsbn(String isbn) {
        return new ResponseEntity<>(bookUseCase.getBookByIsbn(isbn), HttpStatus.OK);
    }
}
