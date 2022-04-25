package mk.ukim.finki.emt.lab2.emt.service.impl;

import mk.ukim.finki.emt.lab2.emt.model.Author;
import mk.ukim.finki.emt.lab2.emt.model.Country;
import mk.ukim.finki.emt.lab2.emt.repository.AuthorRepository;
import mk.ukim.finki.emt.lab2.emt.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author create(String name, String surname, Country country) {
        Author author = new Author(name, surname, country);
        return this.authorRepository.save(author);
    }
}
