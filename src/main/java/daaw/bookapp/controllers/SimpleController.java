package daaw.bookapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import daaw.bookapp.persistence.model.Book;
import daaw.bookapp.persistence.repo.BookRepository;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
 
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);

        return "home";
    }

    @GetMapping("/listbooks")
    public String listBooks(Model model) {
        Iterable<Book> books = bookRepository.findAll();

        model.addAttribute("books", books);
        
        return "listbooks";
    }
}