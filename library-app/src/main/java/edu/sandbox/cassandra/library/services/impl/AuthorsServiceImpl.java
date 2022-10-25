package edu.sandbox.cassandra.library.services.impl;

import edu.sandbox.cassandra.library.domain.Author;
import edu.sandbox.cassandra.library.repository.AuthorRepository;
import edu.sandbox.cassandra.library.services.AuthorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorsServiceImpl implements AuthorsService {

    //    private final AuthorCassandraRepository authorRepository;
    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(String id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void deleteById(String id) {
        authorRepository.deleteById(id);
    }
}
