package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.akademiaspecjalistowit.liquidbasedemo.borrow.view.BorrowView;

import java.util.List;

@RestController
@RequestMapping("/borrows")
public class BorrowController {
    private BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @PostMapping
    public void addBorrow(@RequestBody BorrowRequestDto requestDto){
        borrowService.addBorrow(requestDto);
    }

    @GetMapping
    public List<BorrowView> getAllBorrows(){
        return borrowService.getAllBorrows();
    }
}
