package edu.sandbox.cassandra.library.repository;

import edu.sandbox.cassandra.library.domain.Author;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AuthorCassandraRepository extends CassandraRepository<Author, String> {

    Author findByName(String name);

    void deleteByName(String name);
}