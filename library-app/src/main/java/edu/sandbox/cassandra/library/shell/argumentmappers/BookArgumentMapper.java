package edu.sandbox.cassandra.library.shell.argumentmappers;

import edu.sandbox.cassandra.library.domain.Book;

import java.util.List;

public interface BookArgumentMapper {

    Book map(String title, String genreId, List<String> authorIds);

    Book map(String id, String title, String genreId, List<String> authorIds);
}
