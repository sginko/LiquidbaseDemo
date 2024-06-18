package pl.akademiaspecjalistowit.liquidbasedemo.borrow;

import org.springframework.stereotype.Component;
import pl.akademiaspecjalistowit.liquidbasedemo.book.FullBookEntity;
import pl.akademiaspecjalistowit.liquidbasedemo.book.FullBookRepository;
import pl.akademiaspecjalistowit.liquidbasedemo.reader.ReaderEntity;
import pl.akademiaspecjalistowit.liquidbasedemo.reader.ReaderRepository;

@Component
public class BorrowMapper {
    private final ReaderRepository readerRepository;
    private final FullBookRepository fullBookRepository;

    public BorrowMapper(ReaderRepository readerRepository, FullBookRepository fullBookRepository) {
        this.readerRepository = readerRepository;
        this.fullBookRepository = fullBookRepository;
    }

    public BorrowEntity toEntity(BorrowRequestDto requestDto) {
        ReaderEntity readerEntity = readerRepository.findById(requestDto.getReaderId()).orElseThrow();
        FullBookEntity fullBookEntity = fullBookRepository.findById(requestDto.getBookId()).orElseThrow();
        return new BorrowEntity(readerEntity, fullBookEntity);
    }
}
