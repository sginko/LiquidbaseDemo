package pl.akademiaspecjalistowit.liquidbasedemo.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "books")
public class FullBookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String isbn;

    private String title;

    private String name;

    private String surname;

    public FullBookEntity(String isbn, String title, String name, String surname) {
        this.isbn = isbn;
        this.title = title;
        this.name = name;
        this.surname = surname;
    }
}
