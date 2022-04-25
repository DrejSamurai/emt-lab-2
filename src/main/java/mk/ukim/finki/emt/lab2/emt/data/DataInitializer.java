package mk.ukim.finki.emt.lab2.emt.data;

import mk.ukim.finki.emt.lab2.emt.service.AuthorService;
import mk.ukim.finki.emt.lab2.emt.service.BookService;
import mk.ukim.finki.emt.lab2.emt.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    private final CountryService countryService;
    private final AuthorService authorService;

    public DataInitializer(CountryService countryService, AuthorService authorService, BookService bookService) {
        this.countryService = countryService;
        this.authorService = authorService;
    }

    @PostConstruct
    public void initData(){

        for (int i = 1; i < 8; i++) {
            this.countryService.create("Country " + i,"Continent " + i);
        }
        for (int i = 1; i < 15; i++) {
            this.authorService.create("Author Name " + i, "Author Surname " + i, this.countryService.findAll().get((i-1) % 7));
        }
    }
}
