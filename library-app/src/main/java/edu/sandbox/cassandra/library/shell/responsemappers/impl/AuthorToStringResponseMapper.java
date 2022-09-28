package edu.sandbox.cassandra.library.shell.responsemappers.impl;

import edu.sandbox.cassandra.library.shell.responsemappers.ToStringResponseMapper;
import org.springframework.stereotype.Service;
import edu.sandbox.cassandra.library.domain.Author;

import static java.lang.String.format;

@Service
public class AuthorToStringResponseMapper implements ToStringResponseMapper<Author> {

    @Override
    public String map(Author author) {
        return format("id: %s | name: %s", author.getId(), author.getName());
    }
}
