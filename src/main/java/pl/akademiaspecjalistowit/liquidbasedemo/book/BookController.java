package pl.akademiaspecjalistowit.liquidbasedemo.book;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    private final FullBookRepository fullBookRepository;

    @GetMapping
    public List<BookEntity> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/full")
    public List<FullBookEntity> getAllFullBooks(){
        return fullBookRepository.findAll();
    }

    @GetMapping("/isbn")
    public BookIsbnView getIsbnByBookName(@RequestParam(name = "name") String name){
        return bookRepository.getIsbnByTitle(name);
    }

    @PostMapping
    public void createBook(){
        fullBookRepository.saveAll(List.of(
            new FullBookEntity("72938792734","Ania ma kota","name", "surname"),
            new FullBookEntity("34565423235","book2","name2", "surname2"),
            new FullBookEntity("78657457862","book2","name3", "surname3"),
            new FullBookEntity("65766341234","book2","name4", "surname4"),
            new FullBookEntity("42099089567","book2","name", "surname"),
            new FullBookEntity("14333335760","book2","name3", "surname3"),
            new FullBookEntity("45454545323","book2","name4", "surname4"),
            new FullBookEntity("12123123123","book2","name", "surname"),
            new FullBookEntity("09978676343","book2","name6", "surname6"),
            new FullBookEntity("77742312379","book2","name7", "surname7")));
    }
}
