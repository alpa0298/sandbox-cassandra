package edu.sandbox.cassandra.library.services.impl;

import edu.sandbox.cassandra.library.domain.Book;
import edu.sandbox.cassandra.library.repository.BookRepository;
import edu.sandbox.cassandra.library.services.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BooksServiceImpl implements BooksService {

    private final BookRepository bookRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Book> findById(String id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public void updateBookTitleById(String id, String newTitle) {
        Optional<Book> book = bookRepository.findById(id);
        book.ifPresent(b -> b.setTitle(newTitle));
    }

    @Override
    public void deleteById(String id) {
        bookRepository.deleteById(id);
    }
}
