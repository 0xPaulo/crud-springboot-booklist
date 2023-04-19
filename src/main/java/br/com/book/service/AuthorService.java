package br.com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.book.Repository.AuthorRepository;
import br.com.book.entity.Author;
import java.util.List;

@Service //classe intermediaria pq sim controller e repository
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository; //findAll vem daqui

    public List<Author> getAuthorList(){ //retorna o findAll de Author formatado pra list
        return (List<Author>) this.authorRepository.findAll();
        
    }
}
