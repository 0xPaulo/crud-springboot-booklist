package br.com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import br.com.book.entity.Book;

import br.com.book.entity.Author;
import br.com.book.service.AuthorService;
import br.com.book.service.BookService;
import jakarta.validation.Valid;

@Controller // quem ta fazendo o trabalho de junta tudo
public class BookController {

    @Autowired
    private AuthorService authorService;
    @Autowired
    private BookService bookService;

    @GetMapping("/book/form/add") // ta jogando na tela o formulario
    public ModelAndView getFormAdd() {
        ModelAndView mv = new ModelAndView("bookform");
        List<Author> authorList = this.authorService.getAuthorList();
        mv.addObject("authorList", authorList);
        return mv;
    }

    @PostMapping("book/form/save") // ta redirecionando depois de salvar
    public String saveBook(@Valid Book book, BindingResult result,
            RedirectAttributes redirect) {

        if (result.hasErrors()) { // se ocorrer erro vai ir
            redirect.addFlashAttribute("mensagem", "verifique os campos obrigatorios");
            return "redirect:/book/form/add"; // pra ca
        }
        this.bookService.save(book);

        return "redirect:/list";

    }
}
