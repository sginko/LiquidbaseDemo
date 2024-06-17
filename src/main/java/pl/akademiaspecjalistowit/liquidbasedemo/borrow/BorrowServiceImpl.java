package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.stereotype.Service;

@Service
public class BorrowServiceImpl implements BorrowService {
    private final BorrowRepository borrowRepository;
    private final BorrowMapper borrowMapper;

    public BorrowServiceImpl(BorrowRepository borrowRepository, BorrowMapper borrowMapper) {
        this.borrowRepository = borrowRepository;
        this.borrowMapper = borrowMapper;
    }

    @Override
    public void addBorrow(BorrowRequestDto requestDto) {
        borrowRepository.save(borrowMapper.toEntity(requestDto));
    }
}
