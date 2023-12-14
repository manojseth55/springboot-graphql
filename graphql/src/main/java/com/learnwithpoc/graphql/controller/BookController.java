package com.learnwithpoc.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnwithpoc.graphql.model.Book;
import com.learnwithpoc.graphql.model.BookInput;
import com.learnwithpoc.graphql.services.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput bookInput) {
        return bookService.createbook(bookInput);
    }

    @QueryMapping("getBookById")
    public Book getBookById(@Argument int bookId) {
        return bookService.getBook(bookId);
    }

    @QueryMapping("allBooks")
    public List<Book> getBooksList() {
       return  bookService.getallBooks();
    }


    @MutationMapping("updateBook")
    public Book updateBook(@Argument  BookInput bookInput){
        return bookService.updateBook(bookInput);
    }


    @MutationMapping("deleteBook")
    public boolean deteBookById(@Argument int bookId){
        return bookService.deleteBook(bookId);
    }

}