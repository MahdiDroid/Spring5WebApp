package com.mehdi.Spring5WebApp.Repositories;

import com.mehdi.Spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author,long>{
    @Override
    default <S extends Author> S save(S s) {
        return null;
    }

    @Override
    default <S extends Author> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<Author> findById(long l) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(long l) {
        return false;
    }

    @Override
    default Iterable<Author> findAll() {
        return null;
    }

    @Override
    default Iterable<Author> findAllById(Iterable<long> iterable) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(long l) {

    }

    @Override
    default void delete(Author author) {

    }

    @Override
    default void deleteAll(Iterable<? extends Author> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
