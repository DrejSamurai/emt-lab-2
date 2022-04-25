package mk.ukim.finki.emt.lab2.emt.model;

import mk.ukim.finki.emt.lab2.emt.model.enumerator.Category;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private Long id;

    private String name;

    private Category category;
}
