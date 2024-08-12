package com.example.controller;

import com.example.entity.Author;
import com.example.entity.Book;
import com.example.repository.AuthorRepository;
import com.example.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookRepository.findById(id).orElse(null);
    }//--------------------------------------------------------------------------------------------

    @SchemaMapping
    public Author author(Book book) {
        Long authorId = book.getAuthor().getId();
        return authorRepository.findById(authorId).orElse(null);
    }//--------------------------------------------------------------------------------------------

}
