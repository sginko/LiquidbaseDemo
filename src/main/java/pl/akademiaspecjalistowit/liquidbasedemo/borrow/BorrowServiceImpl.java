package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.stereotype.Service;
import pl.akademiaspecjalistowit.liquidbasedemo.borrow.view.BorrowView;
import pl.akademiaspecjalistowit.liquidbasedemo.borrow.view.BorrowViewRepository;

import java.util.List;

@Service
public class BorrowServiceImpl implements BorrowService{
    private final BorrowRepository borrowRepository;
    private final BorrowViewRepository borrowViewRepository;
    private final BorrowMapper borrowMapper;

    public BorrowServiceImpl(BorrowRepository borrowRepository, BorrowViewRepository borrowViewRepository, BorrowMapper borrowMapper) {
        this.borrowRepository = borrowRepository;
        this.borrowViewRepository = borrowViewRepository;
        this.borrowMapper = borrowMapper;
    }

    @Override
    public void addBorrow(BorrowRequestDto requestDto) {
        borrowRepository.save(borrowMapper.toEntity(requestDto));
    }

    @Override
    public List<BorrowView> getAllBorrows() {
        return borrowViewRepository.findAll();
    }
}
