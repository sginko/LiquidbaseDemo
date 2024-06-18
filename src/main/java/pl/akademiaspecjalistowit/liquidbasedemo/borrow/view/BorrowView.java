package pl.akademiaspecjalistowit.liquidbasedemo.borrow.view;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "borrow_view")
public class BorrowView {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride( name = "name", column = @Column(name = "name")),
            @AttributeOverride( name = "surname", column = @Column(name = "surname"))
    })
    private BorrowCompositeId id;

    @Column(name = "BORROW_COUNT")
    private Long borrow_count;

    @Column(name = "BORROW_PERCENTAGE")
    private Double borrow_percentage;

    public BorrowView(BorrowCompositeId id, Long borrow_count, Double borrow_percentage) {
        this.id = id;
        this.borrow_count = borrow_count;
        this.borrow_percentage = borrow_percentage;
    }
}
