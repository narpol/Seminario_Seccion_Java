package com.example.demo.infraestructure.adapters;

import com.example.demo.infraestructure.adapters.entity.BookDBO;
import org.springframework.data.repository.CrudRepository;

public interface BookDBORepository extends CrudRepository<BookDBO, String> {
}
