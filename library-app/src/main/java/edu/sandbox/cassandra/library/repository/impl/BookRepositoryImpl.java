package edu.sandbox.cassandra.library.repository.impl;

import edu.sandbox.cassandra.library.domain.Book;
import edu.sandbox.cassandra.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Optional<Book> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Book save(Book object) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
