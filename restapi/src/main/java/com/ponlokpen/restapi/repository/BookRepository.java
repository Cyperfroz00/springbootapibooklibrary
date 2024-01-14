package com.ponlokpen.restapi.repository;

import com.ponlokpen.restapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    @Override
    List<Book> findAll();
    @Override
    <S extends Book> List<S> saveAll(Iterable<S> entities);
    @Override
    void delete(Book entity);
}
