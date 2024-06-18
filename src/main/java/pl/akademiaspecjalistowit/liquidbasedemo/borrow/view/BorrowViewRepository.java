package pl.akademiaspecjalistowit.liquidbasedemo.borrow.view;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowViewRepository extends JpaRepository<BorrowView, BorrowCompositeId> {
}
