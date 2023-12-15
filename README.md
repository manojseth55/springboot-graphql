# Spring Boot with GraphQL

Creating a GraphQL API with Spring Boot involves integrating the GraphQL Java library into your Spring Boot application.

To use GraphQL with Spring Boot, you can leverage the spring-graphql module, which provides integration with the GraphQL Java implementation. Here are the steps to set up a Spring Boot project with GraphQL

## Create a Spring Boot Project

You can use Spring Initializer (https://start.spring.io/) or your favorite IDE to create a new Spring Boot project. Make sure to include the "Spring Web" and "GraphQL" dependencies.

## Add GraphQL Dependencies

Open your `pom.xml` file and make sure it includes the necessary dependencies. Here is an example

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>com.graphql-java-kickstart</groupId>
    <artifactId>graphql-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>com.graphql-java-kickstart</groupId>
    <artifactId>graphql-java-tools</artifactId>
</dependency>
```

### Create GraphQL Schema

Create a GraphQL schema file (usually with a `.graphqls` extension) where you define your types and queries. Place it in the src/main/resources directory. Here's a simple example:

```
type Book {

    id: ID!
    author: String
    title: String
    description: String
    pages: Int
    price: Float
    publisher: String

}

type Mutation {

    createBook(bookInput: CreateBookInput) : Book
    updateBook(bookInput: UpdateBookInput) : Book
    deleteBook(bookId : Int) : Boolean


}


type Query {
    allBooks : [Book]
    getBookById(bookId:Int ) : Book
}


input CreateBookInput {
    author: String
    title: String
    description: String
    pages: Int
    price: Float
    publisher: String

}
input UpdateBookInput {
    id: ID!
    author: String
    title: String
    description: String
    pages: Int
    price: Float
    publisher: String

}
```

**Note:**  This is a basic setup, and you can explore code for your better understading, how we are using GraphQL in Spring Boot application. 

## GraphQL API Endpoints

## Get Book by ID

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
query {
  getBookById(bookId: 2) {
    id
    author
    description
    title
    publisher
    price
    pages
  }
}
```

## Get All Books [ Example 1 ]

Example one with all details(id, title, author, description, publisher, price and pages).

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
query {
  allBooks {
    id
    title
    author
    description
    publisher
    price
    pages
  }
}
```

## Get All Books [ Example 2 ]

Another example with few details(title, author and description).

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
query {
  allBooks {
    title
    author
    description
  }
}
```
## Create Book

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
mutation {
  createBook(
    bookInput: {
      title: "Black Hat GraphQL"
      author: "Nick Aleks"
      description: "Black Hat GraphQL is for anyone interested in learning how to break and protect GraphQL APIs with the aid of offensive security testing."
      publisher: "Opheliar Chan"
      price: 1200.0
      pages: 263
    }
  ) {
    id
    title
    author
    description
    publisher
    price
    pages
  }
}
```

## Update Book

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
mutation {
  updateBook(
    bookInput: {
      id : 2
      title: "GraphQL in Action"
      author: "Samer Buna"
      description: "GraphQL in Action gives you the tools to get comfortable with the GraphQL language, build and optimize a data API service, and use it in a front-end client application."
      publisher: "Manning Publications"
      price: 2200.0
      pages: 800
    }
  ) {
    id
    title
    author
    description
    publisher
    price
    pages
  }
}
```

## Delete Book

**Method:** POST

**Endpoint:** `http://localhost:8080/api/graphql`

**Request Payload:** Select Body -> GraphQL and put below payload sample in Query

```graphql
mutation {
  deleteBook(bookId: 3)
}
```

These are the GraphQL API endpoints and operations available for managing books.








