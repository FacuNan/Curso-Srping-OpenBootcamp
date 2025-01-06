/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.db_spring_boot.db_springboot.Controller;

import com.db_spring_boot.db_springboot.Entity.Book;
import com.db_spring_boot.db_springboot.Repository.BookRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author facnan
 */
@RestController
public class BookController {
/*Atributo*/
    private BookRepository repository;
    
/*Constructor*/
    public BookController(BookRepository repository) {
        this.repository = repository;
    }
    
    
 /*Metodo Buscar todos los libros*/  
    @GetMapping("/api/book")
    public List<Book> findAll(){
        return repository.findAll();
    }
    
    /*Buscar libro por ID*/
    @GetMapping("/api/book/{id}")
    
    public ResponseEntity<Book> findById(@PathVariable Long id){
        Optional <Book> opBook = repository.findById(id);
        /***
        return opBook.orElse(null);
        ***/
        if(opBook.isPresent()){
            return ResponseEntity.ok(opBook.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
        
        @PostMapping("/api/book")
        public Book crear(@RequestBody Book book){
        
           return repository.save(book);   
        
    }
    
    
}
