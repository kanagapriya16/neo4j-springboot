package com.neo4j.demo.repository;

import com.neo4j.demo.node.Book;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface BookRepository  extends Neo4jRepository <Book,Integer> {
    public List<Book> findByName(String name);
}
