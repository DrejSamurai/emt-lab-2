package mk.ukim.finki.emt.lab2.emt.service;

import mk.ukim.finki.emt.lab2.emt.model.Book;
import mk.ukim.finki.emt.lab2.emt.model.BookDto;
import mk.ukim.finki.emt.lab2.emt.model.enumerator.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, BookDto bookDto);

    Optional<Book> markAsTaken(Long id);

    void deleteById(Long id);
}
