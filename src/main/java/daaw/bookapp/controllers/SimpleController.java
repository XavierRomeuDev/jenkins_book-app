package daaw.bookapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

  @GetMapping("/listbooks/new")

  public String addBook(Model model) {
    Book book = new Book();

    model.addAttribute("book", book);
    model.addAttribute("pageTitle", "Create new Book");

    return "book_form";
  }

  @PostMapping("/listbooks/save")
  public String saveBook(Book book, RedirectAttributes redirectAttributes) {
    try {
      bookRepository.save(book);

      redirectAttributes.addFlashAttribute("message", "The Book has been saved successfully!");
    } catch (Exception e) {
      redirectAttributes.addAttribute("message", e.getMessage());
    }

    return "redirect:/listbooks";
  }

  @GetMapping("/listbooks/{id}")
  public String editTutorial(@PathVariable("id") long id, Model model, RedirectAttributes redirectAttributes) {
    try {
      Optional<Book> book = bookRepository.findById(id);

      model.addAttribute("book", book);
      model.addAttribute("pageTitle", "Edit book (id: " + id + ")");

      return "book_form";
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());

      return "redirect:/listbooks";
    }
  }

  @GetMapping("/listbooks/delete/{id}")
  public String deleteBook(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
    try {
      bookRepository.deleteById(id);

      redirectAttributes.addFlashAttribute("message", "The book with id=" + id + " has been deleted successfully!");
    } catch (Exception e) {
      redirectAttributes.addFlashAttribute("message", e.getMessage());
    }

    return "redirect:/listbooks";
  }

}