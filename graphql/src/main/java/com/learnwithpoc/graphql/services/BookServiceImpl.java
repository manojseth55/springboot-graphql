package com.learnwithpoc.graphql.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnwithpoc.graphql.model.Book;
import com.learnwithpoc.graphql.model.BookInput;
import com.learnwithpoc.graphql.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book createbook(BookInput bookInput) {

		Book book = new Book();
		book.setTitle(bookInput.getTitle());
		book.setAuthor(bookInput.getAuthor());
		book.setPrice(bookInput.getPrice());
		book.setPublisher(bookInput.getPublisher());
		book.setDescription(bookInput.getDescription());
		book.setPages(bookInput.getPages());
		return bookRepository.save(book);
	}

	@Override
	public Book getBook(int id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getallBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(BookInput updateBook) {
		Optional<Book> existingBook = bookRepository.findById(updateBook.getId());

		if (existingBook.isPresent()) {
			Book book = existingBook.get();
			book.setTitle(updateBook.getTitle());
			book.setAuthor(updateBook.getAuthor());
			book.setDescription(updateBook.getDescription());
			book.setPrice(updateBook.getPrice());
			book.setPublisher(updateBook.getPublisher());
			return bookRepository.save(book);
		} else {
			// Handle the case when the book does not exist
			// You can throw an exception or handle it in any other appropriate way
			throw new RuntimeException(("Book not found: " + updateBook.getId()));
		}

	}

	@Override
	public boolean deleteBook(int id) {
		Optional<Book> book = bookRepository.findById(id);
		if (book.isPresent()) {
			bookRepository.deleteById(id);
			return true;
		}
		return false;
	}
}