package com.mehdi.Spring5WebApp.Repositories;

import com.mehdi.Spring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book,Long> {

}
