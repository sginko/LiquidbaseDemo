package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class BorrowRequestDto {
    private Long readerId;
    private Long bookId;

    public BorrowRequestDto(Long readerId, Long bookId) {
        this.readerId = readerId;
        this.bookId = bookId;
    }
}
