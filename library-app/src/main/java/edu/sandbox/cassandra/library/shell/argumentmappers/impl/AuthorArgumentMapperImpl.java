package edu.sandbox.cassandra.library.shell.argumentmappers.impl;

import edu.sandbox.cassandra.library.shell.argumentmappers.AuthorArgumentMapper;
import org.springframework.stereotype.Service;
import edu.sandbox.cassandra.library.domain.Author;

@Service
public class AuthorArgumentMapperImpl implements AuthorArgumentMapper {

    @Override
    public Author map(String id, String name) {
        return new Author(id, name);
    }

    @Override
    public Author map(String name) {
        return new Author(null, name);
    }
}
