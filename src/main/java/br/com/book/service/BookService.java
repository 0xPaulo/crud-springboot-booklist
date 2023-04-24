package br.com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.book.Repository.BookRepository;
import br.com.book.entity.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void save(Book book) {
        this.bookRepository.save(book);
    }

    public List<Book> findAll() { // Posso converter aqui ou la no repository
        return (List<Book>) this.bookRepository.findAll();
    }
}
