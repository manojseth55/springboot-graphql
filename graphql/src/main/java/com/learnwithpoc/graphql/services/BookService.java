package com.learnwithpoc.graphql.services;

import java.util.List;

import com.learnwithpoc.graphql.model.Book;
import com.learnwithpoc.graphql.model.BookInput;

public interface BookService {


    // create book
    public Book createbook( BookInput bookInput);

    // get book by id

    public Book getBook(int id);


    // get all boooks
    public List<Book> getallBooks();

    // update book
    Book updateBook(BookInput bookInput);

    boolean deleteBook(int id);

}