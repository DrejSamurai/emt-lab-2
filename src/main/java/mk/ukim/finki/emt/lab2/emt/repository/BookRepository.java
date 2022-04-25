package mk.ukim.finki.emt.lab2.emt.repository;

import mk.ukim.finki.emt.lab2.emt.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByName(String name);

    void deleteByName(String name);

}