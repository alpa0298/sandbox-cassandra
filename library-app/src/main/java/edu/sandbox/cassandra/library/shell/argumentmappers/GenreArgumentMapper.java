package edu.sandbox.cassandra.library.shell.argumentmappers;

import edu.sandbox.cassandra.library.domain.Genre;

public interface GenreArgumentMapper {

    Genre map(String id, String name);

    Genre map(String name);
}
