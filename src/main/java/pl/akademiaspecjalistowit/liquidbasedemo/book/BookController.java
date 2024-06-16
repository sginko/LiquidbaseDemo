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
        fullBookRepository.save(
            new FullBookEntity("72938792734","Ania ma kota","Adaś"));
    }
}
