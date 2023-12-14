package com.learnwithpoc.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnwithpoc.graphql.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
}