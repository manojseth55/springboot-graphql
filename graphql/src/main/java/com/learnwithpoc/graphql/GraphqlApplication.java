package com.learnwithpoc.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learnwithpoc.graphql.model.BookInput;
import com.learnwithpoc.graphql.services.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BookInput book1 = new BookInput();
		book1.setTitle("The Road to GraphQL");
		book1.setAuthor("Robin Wieruch");
		book1.setPrice(1000);
		book1.setPublisher("Publisher 1");
		book1.setDescription("The Road to GraphQL is your personal journey to master pragmatic GraphQL in JavaScript.");
		book1.setPages(1000);
		bookService.createbook(book1);

		BookInput book2 = new BookInput();
		book2.setTitle("GraphQL in Action");
		book2.setAuthor("Samer Buna");
		book2.setPrice(2000);
		book2.setPublisher("Manning Publications");
		book2.setDescription("GraphQL in Action gives you the tools to get comfortable with the GraphQL language, build and optimize a data API service, and use it in a front-end client application.");
		book2.setPages(800);
		bookService.createbook(book2);

		BookInput book3 = new BookInput();
		book3.setTitle("Learning GraphQL");
		book3.setAuthor("Eve Porcello and Alex Banks");
		book3.setPrice(1500);
		book3.setPublisher("Publisher 2");
		book3.setDescription("providing a query language for your APIs and a runtime for fulfilling queries with your data, GraphQL presents a clear alternative to REST and ad hoc web service architectures.");
		book3.setPages(1200);
		bookService.createbook(book3);

	}

}
