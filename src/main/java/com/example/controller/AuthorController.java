package com.example.controller;

import com.example.entity.Author;
import com.example.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @QueryMapping
    public Author authorById(@Argument Long id) {
        return authorRepository.findById(id).orElse(null);
    }//--------------------------------------------------------------------------------------------

}
