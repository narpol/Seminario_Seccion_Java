package com.example.demo.application.configuration;

import com.example.demo.domain.model.gateways.BookRepository;
import com.example.demo.domain.model.gateways.ClientRepository;
import com.example.demo.domain.usecase.BookUseCase;
import com.example.demo.domain.usecase.ClientUseCase;
import org.springframework.context.annotation.Bean;

public class UseCaseBeanConfig {
    @Bean
    public BookUseCase bookUseCase(BookRepository bookRepository){
        return new BookUseCase(bookRepository);
    }

    @Bean
    public ClientUseCase clientUseCase (ClientRepository clientRepository){
        return clientUseCase(clientRepository);
    }
}
