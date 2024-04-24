package repository;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public Book save(Book book) {
        book.setId((long) (books.size() + 1));
        books.add(book);
        return book;
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public Book update(Book book) {
        for (Book b : books) {
            if (b.getId().equals(book.getId())) {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                return b;
            }
        }
        return null;
    }

    public void delete(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;
    }


}

