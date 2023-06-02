package com.neo4j.demo.node;


import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;

import org.springframework.data.neo4j.core.schema.Id;


@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private int id;
    private String name;
    private String author;
}
