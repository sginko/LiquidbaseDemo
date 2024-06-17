package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.stereotype.Component;

@Component
public class BorrowMapper {

    public BorrowEntity toEntity(BorrowRequestDto requestDto) {
        return new BorrowEntity(requestDto.getReaderId(), requestDto.getBookId());
    }
}
