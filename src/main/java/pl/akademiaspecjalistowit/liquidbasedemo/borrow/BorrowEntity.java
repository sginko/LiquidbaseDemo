package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.akademiaspecjalistowit.liquidbasedemo.book.FullBookEntity;
import pl.akademiaspecjalistowit.liquidbasedemo.reader.ReaderEntity;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "borrows")
public class BorrowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID technicalId;

    @ManyToOne
    @JoinColumn(name = "readerId")
    private ReaderEntity readerId;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private FullBookEntity bookId;

    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowEntity(ReaderEntity readerId, FullBookEntity bookId) {
        this.technicalId = UUID.randomUUID();
        this.readerId = readerId;
        this.bookId = bookId;
        this.borrowDate = LocalDate.now();
        this.returnDate = null;
    }
}
