package com.mehdi.Spring5WebApp.Bootstrap;

import com.mehdi.Spring5WebApp.Repositories.AuthorRepository;
import com.mehdi.Spring5WebApp.Repositories.BookRepository;
import com.mehdi.Spring5WebApp.model.Author;
import com.mehdi.Spring5WebApp.model.Book;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initialData();
    }
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    private void initialData(){

        //mehdi
        Author mehdi = new Author("Mehdi","mhmvd");
        Book ddd = new Book("Domain driven design","1234","Collins");
        mehdi.getBooks().add(ddd);
        ddd.getAuthors().add(mehdi);
        authorRepository.save(mehdi);
        bookRepository.save(ddd);

        //Rod
        Author bob = new Author("bob","jessy");
        Book ttt = new Book("Test Driven   design","567","Oreilly");
        mehdi.getBooks().add(ttt);
        ddd.getAuthors().add(bob);

        authorRepository.save(bob);
        bookRepository.save(ttt);



    }
}
