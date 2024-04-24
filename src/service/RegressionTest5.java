import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book23 = bookService0.save(book22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        model.Book book27 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList30 = bookService0.findAll();
        model.Book book31 = null;
        model.Book book32 = bookService0.update(book31);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNull(book27);
        org.junit.Assert.assertNotNull(bookList30);
        org.junit.Assert.assertNull(book32);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        model.Book book21 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book23 = bookService0.save(book22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book22 = bookService0.save(book21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 100L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("hi!");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        model.Book book7 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book9 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book21 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
        model.Book book25 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        java.util.List<model.Book> bookList27 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book21 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book30 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book31 = bookService0.save(book30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book26 = bookService0.save(book25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass8 = bookList7.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book9 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 100L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.util.List<model.Book> bookList26 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        model.Book book25 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList27 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList29 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass30 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        model.Book book21 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book27 = bookService0.findById((java.lang.Long) 0L);
        model.Book book29 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book27);
        org.junit.Assert.assertNull(book29);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book9 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
        model.Book book27 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList29 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList31 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNull(book27);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertNotNull(bookList31);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        model.Book book25 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        model.Book book24 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book23 = bookService0.save(book22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        model.Book book19 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        model.Book book18 = bookService0.findById((java.lang.Long) 100L);
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book23 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList25 = bookService0.findByAuthor("hi!");
        model.Book book26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book27 = bookService0.save(book26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        java.lang.Class<?> wildcardClass24 = bookList23.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        model.Book book21 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book20 = bookService0.findById((java.lang.Long) 100L);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        java.util.List<model.Book> bookList27 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList29 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList31 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertNotNull(bookList31);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        model.Book book26 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNull(book26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        model.Book book26 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book21 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book8 = bookService0.save(book7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        model.Book book24 = bookService0.findById((java.lang.Long) 100L);
        model.Book book25 = null;
        model.Book book26 = bookService0.update(book25);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        model.Book book24 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        model.Book book25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book26 = bookService0.save(book25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = book19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = book21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList26 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        model.Book book27 = null;
        model.Book book28 = bookService0.update(book27);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNull(book28);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        model.Book book21 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass25 = bookList24.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book25 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("hi!");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        model.Book book26 = null;
        model.Book book27 = bookService0.update(book26);
        model.Book book28 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book29 = bookService0.save(book28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNull(book27);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList25 = bookService0.findByAuthor("");
        model.Book book26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book27 = bookService0.save(book26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass21 = bookList20.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book21 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("");
        model.Book book25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book26 = bookService0.save(book25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        model.Book book22 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book24 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book24 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book24 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        model.Book book26 = null;
        model.Book book27 = bookService0.update(book26);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNull(book27);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book26 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = book23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        model.Book book25 = null;
        model.Book book26 = bookService0.update(book25);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        model.Book book26 = null;
        model.Book book27 = bookService0.update(book26);
        java.util.List<model.Book> bookList28 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNull(book27);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        model.Book book13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book14 = bookService0.save(book13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }
}

