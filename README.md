# Spring Boot with GraphQL

Creating a GraphQL API with Spring Boot involves integrating the GraphQL Java library into your Spring Boot application.

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








