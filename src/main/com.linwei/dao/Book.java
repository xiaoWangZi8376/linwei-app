package com.linwei.firstappproject.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
@Data
public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
    @Value("${book.number}")
    private int number;
    @Value("${book.value}")
    private String value;
    @Value("${book.test1}")
    private String test1;
    @Value("${book.test2}")
    private String test2;
}
