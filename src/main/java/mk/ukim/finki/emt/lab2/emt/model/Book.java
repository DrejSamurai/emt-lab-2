package mk.ukim.finki.emt.lab2.emt.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.lab2.emt.model.enumerator.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Category category;

    @ManyToOne
    private Author author;

    private Integer available_copies;

    public Book() {
    }

    public Book(String name, Category category, Author author, Integer available_copies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.available_copies = available_copies;
    }
}
