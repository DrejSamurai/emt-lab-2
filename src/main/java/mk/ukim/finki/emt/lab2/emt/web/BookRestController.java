package mk.ukim.finki.emt.lab2.emt.web;

import mk.ukim.finki.emt.lab2.emt.model.Author;
import mk.ukim.finki.emt.lab2.emt.model.Book;
import mk.ukim.finki.emt.lab2.emt.model.BookDto;
import mk.ukim.finki.emt.lab2.emt.model.enumerator.Category;
import mk.ukim.finki.emt.lab2.emt.service.AuthorService;
import mk.ukim.finki.emt.lab2.emt.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BookRestController {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookRestController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping(value = {"/", "/books"})
    private List<Book> findAll(){
        return this.bookService.findAll();
    }

    @GetMapping("books/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        return this.bookService.findById(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping("books/add")
    public ResponseEntity<Book> save(@RequestBody BookDto bookDto) {
        return this.bookService.save(bookDto)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("books/edit/{id}")
    public ResponseEntity<Book> edit(@PathVariable Long id, @RequestBody BookDto bookDto) {
        return this.bookService.edit(id, bookDto)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @DeleteMapping("books/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        this.bookService.deleteById(id);
        if(this.bookService.findById(id).isEmpty()) return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/categories")
    public ResponseEntity<Category[]> findCategories(){
        return ResponseEntity.ok().body(Category.values());
    }

    @GetMapping("/authors")
    public List<Author> findAuthors(){
        return this.authorService.findAll();
    }

    @PostMapping("/books/mark_as_taken/{id}")
    public ResponseEntity<Book> take(@PathVariable Long id) {
        return this.bookService.markAsTaken(id)
                .map(book -> ResponseEntity.ok().body(book))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
