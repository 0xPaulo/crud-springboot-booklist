package br.com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.book.entity.Book;
import br.com.book.service.BookService;

@Controller
public class IndexController {

    @Autowired
    BookService bookService;

    @RequestMapping("/lista")
    private ModelAndView getLista() {
        List<Book> bookList = this.bookService.findAll();

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("bookList", bookList);
        return mv;
    }
}
