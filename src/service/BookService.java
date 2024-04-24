package service;

import model.Book;
import repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository repository = new BookRepository();

    public Book save(Book book) {
        return repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book findById(Long id) {
        return repository.findById(id);
    }

    public Book update(Book book) {
        return repository.update(book);
    }

    public void delete(Long id) {
        repository.delete(id);
    }

    public List<Book> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    public List<Book> findByTitle(String title) {
        return repository.findByTitle(title);
    }

}
