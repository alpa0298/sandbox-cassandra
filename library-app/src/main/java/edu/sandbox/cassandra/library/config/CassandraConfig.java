package edu.sandbox.cassandra.library.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Data
@ConstructorBinding
@ConfigurationProperties("spring.data.cassandra")
public class CassandraConfig extends AbstractCassandraConfiguration {

    private final String contactPoints;
    private final String keyspaceName;
    private final String localDataCenter;
    private final int port;
}
