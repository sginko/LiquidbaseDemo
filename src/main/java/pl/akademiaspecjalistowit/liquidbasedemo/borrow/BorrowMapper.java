package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

public class BorrowMapper {

    public BorrowEntity toEntity(BorrowRequestDto requestDto) {
        return new BorrowEntity(requestDto.getReaderId(), requestDto.getBookId());
    }
}
