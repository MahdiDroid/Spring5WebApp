package com.mehdi.Spring5WebApp.Controllers;


import com.mehdi.Spring5WebApp.Repositories.AuthorRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}
