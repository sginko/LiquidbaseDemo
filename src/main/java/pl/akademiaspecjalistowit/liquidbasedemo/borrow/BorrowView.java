package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import java.time.LocalDate;
import java.util.UUID;

public interface BorrowView {
    Long getId();
    UUID getTechnicalId();
    Long getReaderId();
    Long getBookId();
    LocalDate getBorrowDate();
    LocalDate getReturnDate();
}
