package br.com.book.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.book.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    // Convertendo aqui
    // @Override
    // List<Book> findAll();
}
