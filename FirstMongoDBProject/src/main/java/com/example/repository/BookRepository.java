package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.domain.Book;

public interface BookRepository  extends MongoRepository<Book,Integer>{

}
