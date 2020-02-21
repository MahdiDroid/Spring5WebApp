package com.mehdi.Spring5WebApp.Bootstrap;

import com.mehdi.Spring5WebApp.model.Author;
import com.mehdi.Spring5WebApp.model.Book;

public class DevBootstrap {

    private void initialData(){

        //mehdi
        Author mehdi = new Author("Mehdi","mhmvd");
        Book ddd = new Book("Domain driven design","1234","Collins");
        mehdi.getBooks().add(ddd);
        ddd.getAuthors().add(mehdi);

        //Rod
        Author bob = new Author("bob","jessy");
        Book ttt = new Book("Test Driven   design","567","Oreilly");
        mehdi.getBooks().add(ttt);
        ddd.getAuthors().add(bob);


    }
}
