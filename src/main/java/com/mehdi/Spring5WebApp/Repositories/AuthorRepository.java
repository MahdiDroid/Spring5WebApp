package com.mehdi.Spring5WebApp.Repositories;

import com.mehdi.Spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
