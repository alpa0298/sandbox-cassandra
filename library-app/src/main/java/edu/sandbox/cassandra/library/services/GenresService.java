package edu.sandbox.cassandra.library.services;

import edu.sandbox.cassandra.library.core.operations.CrudOperations;
import edu.sandbox.cassandra.library.domain.Genre;

import java.util.List;

public interface GenresService extends CrudOperations<Genre> {

    List<Genre> findAllById(Iterable<String> ids);
}
