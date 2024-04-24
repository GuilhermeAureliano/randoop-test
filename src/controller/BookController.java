package controller;

import model.Book;
import service.BookService;

import java.util.List;

public class BookController {

    private BookService service = new BookService();

    public Book createBook(Book book) {
        return service.save(book);
    }

    public List<Book> getAllBooks() {
        return service.findAll();
    }
}
