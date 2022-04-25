package mk.ukim.finki.emt.lab2.emt.service;

import mk.ukim.finki.emt.lab2.emt.model.Author;
import mk.ukim.finki.emt.lab2.emt.model.Country;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();

    Author create(String name, String surname, Country country);
}
