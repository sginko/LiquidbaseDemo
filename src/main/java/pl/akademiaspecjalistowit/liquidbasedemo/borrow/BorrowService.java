package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import pl.akademiaspecjalistowit.liquidbasedemo.borrow.view.BorrowView;

import java.util.List;

public interface BorrowService {
    void addBorrow(BorrowRequestDto requestDto);

    List<BorrowView> getAllBorrows();
}
