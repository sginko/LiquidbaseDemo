package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "borrows")
public class BorrowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long readerId;
    private Long bookId;

    public BorrowEntity(Long readerId, Long bookId) {
        this.readerId = readerId;
        this.bookId = bookId;
    }
}
