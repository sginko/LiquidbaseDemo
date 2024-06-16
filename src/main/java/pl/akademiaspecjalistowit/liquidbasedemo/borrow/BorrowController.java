package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/borrows")
public class BorrowController {

    @PostMapping
    public void addBorrow(BorrowRequestDto requestDto){

    }
}
