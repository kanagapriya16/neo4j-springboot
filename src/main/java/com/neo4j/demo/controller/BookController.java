package com.neo4j.demo.controller;

import com.neo4j.demo.node.Book;
import com.neo4j.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){
        bookRepository.save(book);
        return "book added";
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks(){

        return (List<Book>) bookRepository.findAll();
    }
    @GetMapping ("/getBook/{name}")
    public List<Book> getBook(@PathVariable String name){
        return bookRepository.findByName(name);
    }
    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepository.deleteById(id);
        return "book deleted with id:"+id;
    }

}
