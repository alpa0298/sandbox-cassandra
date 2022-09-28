package edu.sandbox.cassandra.library.domain;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("authors")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @PrimaryKey
    private String id;

    @Column("name")
    private String name;
}
