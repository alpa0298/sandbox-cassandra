package edu.sandbox.cassandra.library.shell.responsemappers.impl;

import edu.sandbox.cassandra.library.shell.responsemappers.ToStringResponseMapper;
import org.springframework.stereotype.Service;
import edu.sandbox.cassandra.library.domain.Genre;

import static java.lang.String.format;

@Service
public class GenreToStringResponseMapper implements ToStringResponseMapper<Genre> {

    @Override
    public String map(Genre genre) {
        return format("id: %s | name: %s", genre.getId(), genre.getName());
    }
}
