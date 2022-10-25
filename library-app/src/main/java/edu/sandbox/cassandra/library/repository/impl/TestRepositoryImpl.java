package edu.sandbox.cassandra.library.repository.impl;

import com.datastax.oss.driver.api.querybuilder.QueryBuilder;
import edu.sandbox.cassandra.library.domain.Test;
import edu.sandbox.cassandra.library.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.query.CriteriaDefinition;
import org.springframework.data.cassandra.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static org.springframework.data.cassandra.core.query.Criteria.where;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestRepositoryImpl implements TestRepository {

    private final CassandraOperations operations;

    @Override
    public void test() {
//        List<Test> select = operations.select("select * from tests", Test.class);
//        log.info(">>>> select = " + select);
        CriteriaDefinition definition = where("name").is("test2");
        CriteriaDefinition definition2 = where("id").is(UUID.fromString("88ba7b55-c43d-4cea-b59d-08d141e555df"));
        log.info(">>>> select = " + operations.select(Query.query(definition).and(definition2), Test.class));
    }
}
