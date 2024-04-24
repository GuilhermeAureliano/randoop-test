import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
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
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList27 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(bookList31);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
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
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        java.lang.Class<?> wildcardClass26 = bookList25.getClass();
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
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book25 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = book25.getClass();
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
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        model.Book book27 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book27);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        model.Book book27 = bookService0.update(book26);
        java.util.List<model.Book> bookList28 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNull(book27);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        model.Book book25 = null;
        model.Book book26 = bookService0.update(book25);
        java.util.List<model.Book> bookList27 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNull(book26);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book25 = bookService0.save(book24);
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
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
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
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        model.Book book20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
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
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = book20.getClass();
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
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
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
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        bookService0.delete((java.lang.Long) 10L);
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book21 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        model.Book book18 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList27 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book25 = bookService0.save(book24);
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
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.util.List<model.Book> bookList25 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.util.List<model.Book> bookList26 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList26 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
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
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book27 = null;
        model.Book book28 = bookService0.update(book27);
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
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNull(book28);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
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
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        model.Book book26 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book28 = bookService0.save(book27);
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        java.util.List<model.Book> bookList26 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book25 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
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
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        bookService0.delete((java.lang.Long) 1L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        service.BookService bookService0 = new service.BookService();
        java.util.List<model.Book> bookList1 = bookService0.findAll();
        java.util.List<model.Book> bookList3 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book28 = bookService0.save(book27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        bookService0.delete((java.lang.Long) 0L);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass26 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
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
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        model.Book book23 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
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
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book24 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book25 = bookService0.save(book24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        bookService0.delete((java.lang.Long) 1L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        bookService0.delete((java.lang.Long) 1L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
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
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
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
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 100L);
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
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book18 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        model.Book book30 = null;
        model.Book book31 = bookService0.update(book30);
        java.util.List<model.Book> bookList33 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book31);
        org.junit.Assert.assertNotNull(bookList33);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        model.Book book26 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNull(book26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book22 = bookService0.save(book21);
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
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        model.Book book19 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book28 = bookService0.save(book27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        model.Book book24 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
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
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList29 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList28);
        org.junit.Assert.assertNotNull(bookList29);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList27 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("");
        model.Book book25 = null;
        model.Book book26 = bookService0.update(book25);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass29 = bookService0.getClass();
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
        org.junit.Assert.assertNull(book26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        model.Book book27 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book28 = bookService0.save(book27);
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
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book25 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
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
        bookService0.delete((java.lang.Long) (-1L));
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
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
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
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book9 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        model.Book book25 = bookService0.findById((java.lang.Long) 1L);
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
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = book18.getClass();
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
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        model.Book book21 = bookService0.findById((java.lang.Long) 100L);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList24 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
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
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList25 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book9 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.lang.Class<?> wildcardClass22 = bookList21.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book27);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book23 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
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
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        model.Book book21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book22 = bookService0.save(book21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        model.Book book29 = bookService0.findById((java.lang.Long) 0L);
        model.Book book31 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList32 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book29);
        org.junit.Assert.assertNull(book31);
        org.junit.Assert.assertNotNull(bookList32);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book18 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        bookService0.delete((java.lang.Long) 1L);
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
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
        model.Book book21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book22 = bookService0.save(book21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        java.lang.Class<?> wildcardClass27 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book28 = bookService0.findById((java.lang.Long) 0L);
        model.Book book29 = null;
        model.Book book30 = bookService0.update(book29);
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNull(book28);
        org.junit.Assert.assertNull(book30);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        model.Book book21 = bookService0.findById((java.lang.Long) 100L);
        model.Book book22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book23 = bookService0.save(book22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

