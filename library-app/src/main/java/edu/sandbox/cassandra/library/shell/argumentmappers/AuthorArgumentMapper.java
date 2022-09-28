package edu.sandbox.cassandra.library.shell.argumentmappers;

import edu.sandbox.cassandra.library.domain.Author;

public interface AuthorArgumentMapper {

    Author map(String id, String name);

    Author map(String name);
}
