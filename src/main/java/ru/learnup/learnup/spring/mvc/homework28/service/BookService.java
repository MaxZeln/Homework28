package ru.learnup.learnup.spring.mvc.homework28.service;


import org.springframework.stereotype.Service;
import ru.learnup.learnup.spring.mvc.homework28.entity.Book;
import ru.learnup.learnup.spring.mvc.homework28.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getBooksByTitleAndPrice(String title, Integer price) {
        List<Book> list = new ArrayList<>();
        if (title != null && price != null) {
            return repository.findAllByTitleContainsAndPriceContains(title, price);
        } else {
            return repository.findAll();
        }

    }

    public Book findById(int id) {
        return repository.getById(id);
    }
}
