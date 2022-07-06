package ru.learnup.learnup.spring.mvc.homework28.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.learnup.learnup.spring.mvc.homework28.entity.Book;
import ru.learnup.learnup.spring.mvc.homework28.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String getBooks(
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "price", required = false) Integer price,
            Model model
    ) {

        List<Book>  books = bookService.getBooksByTitleAndPrice(title,price);
        model.addAttribute("books", books);
        return "Books";
    }

    @GetMapping("/{bookId}")
    public String getBook(@PathVariable(name = "bookId") int bookId, Model model) {
        Book book = bookService.findById(bookId);
        model.addAttribute("book", book);
        return "Book";
    }
}
