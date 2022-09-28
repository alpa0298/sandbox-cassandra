package edu.sandbox.cassandra.library.shell.argumentmappers.impl;

import edu.sandbox.cassandra.library.domain.Genre;
import edu.sandbox.cassandra.library.shell.argumentmappers.GenreArgumentMapper;
import org.springframework.stereotype.Service;

@Service
public class GenreArgumentMapperImpl implements GenreArgumentMapper {

    @Override
    public Genre map(String id, String name) {
        return new Genre(id, name);
    }

    @Override
    public Genre map(String name) {
        return new Genre(null, name);
    }
}
