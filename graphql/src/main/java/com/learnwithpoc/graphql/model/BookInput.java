package com.learnwithpoc.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {
    private int id;
    private String author;
    private String title;
    private String description;
    private String publisher;
    private double price;
    private int pages;
}