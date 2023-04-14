package br.com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    
    @RequestMapping("/lista")
    private ModelAndView getLista() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
        
    }
}
