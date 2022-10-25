package edu.sandbox.cassandra.library.repository.impl;

import edu.sandbox.cassandra.library.domain.Author;
import edu.sandbox.cassandra.library.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private final CassandraOperations operations;

    /*
    // Tasks
    1. Create DM models layer - pure data marts
    2. Create Repository layer - interfaces with implementations using CassandraOperations
    3. Create Service layer - business logic which calls repository and converters
    4. Create Messaging layer - configure camel and working with new queue
    5. Create Converters and TMF models

    // Structure
    // config - congifuration for camel, cassandra and activemq
    // converters
        // tmf629
    // services
        // tmf629
    // messaging
        MessagingService
    // repositories
        // tmf629
    // models
        // datamarts
        // tmf629
        // tmf728
        // tmf823
        // tmf948


        // Sync API, Async API, Filtering, Paging, Sorting. For CRUD operations
        Examples:
            return operations.select("select id, name from authors", Author.class);

            CriteriaDefinition criteria = where("name").is("Pat Cambridge");
            return operations.select(query(criteria), Author.class);

            return operations.select(newInstance("select id, name from authors where name = :name", Map.of("name", "Pat Cambridge")), Author.class);

            return operations.getCqlOperations().queryForList("select id, name from authors where name = ?", Author.class, "Pat Cambridge");

            return Optional.ofNullable(operations.selectOneById("8f9c9065-8312-4e73-bf79-261ddb7e7f1b", Author.class));
     */

    @Override
    public List<Author> findAll() {
//        operations.select()
//        CqlOperations cqlOperations = operations.getCqlOperations();
//        String cql = "select id, name from authors where name = :name";
//        cqlOperations.query(cql, PreparedStatementBinder);
//        operations.setUsePreparedStatements(false);
//        return operations.slice();
        return null;
    }

    @Override
    public Optional<Author> findById(String id) {
        return Optional.ofNullable(operations.selectOneById("8f9c9065-8312-4e73-bf79-261ddb7e7f1b", Author.class));
    }

    @Override
    public Author save(Author object) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
