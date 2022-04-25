package mk.ukim.finki.emt.lab2.emt.repository;

import mk.ukim.finki.emt.lab2.emt.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
