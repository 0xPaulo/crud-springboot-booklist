package br.com.book.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.book.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
