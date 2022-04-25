package mk.ukim.finki.emt.lab2.emt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.lab2.emt.model.enumerator.Category;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String name;

    private Category category;

    private Long author;

    private Integer availableCopies;

}
