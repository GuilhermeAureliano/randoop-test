import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        model.Book book18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book19 = bookService0.save(book18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass5 = bookList4.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass5 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book20 = bookService0.findById((java.lang.Long) 10L);
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        bookService0.delete((java.lang.Long) (-1L));
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
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = book14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
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
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = book7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        bookService0.delete((java.lang.Long) (-1L));
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
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book9 = bookService0.save(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        java.util.List<model.Book> bookList20 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book8 = bookService0.save(book7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass21 = bookList20.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book4 = bookService0.save(book3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
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
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
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
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        model.Book book19 = bookService0.update(book18);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        model.Book book9 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = book15.getClass();
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
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = book11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.util.List<model.Book> bookList20 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
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
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book9 = bookService0.save(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        model.Book book24 = bookService0.findById((java.lang.Long) 0L);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book17 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass28 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.lang.Class<?> wildcardClass6 = bookList5.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        model.Book book9 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        bookService0.delete((java.lang.Long) 1L);
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        model.Book book7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book8 = bookService0.save(book7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
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
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
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
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book12 = bookService0.save(book11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = book6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book20 = bookService0.save(book19);
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
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        model.Book book21 = null;
        model.Book book22 = bookService0.update(book21);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book7 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book8 = bookService0.save(book7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        bookService0.delete((java.lang.Long) (-1L));
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.util.List<model.Book> bookList25 = bookService0.findByAuthor("");
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
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
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book9 = bookService0.save(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book21 = bookService0.save(book20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        model.Book book28 = null;
        model.Book book29 = bookService0.update(book28);
        java.util.List<model.Book> bookList31 = bookService0.findByAuthor("");
        model.Book book32 = null;
        model.Book book33 = bookService0.update(book32);
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
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNull(book29);
        org.junit.Assert.assertNotNull(bookList31);
        org.junit.Assert.assertNull(book33);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        model.Book book25 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book9 = bookService0.save(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = book10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book18 = bookService0.save(book17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        bookService0.delete((java.lang.Long) 10L);
        model.Book book21 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = book12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        bookService0.delete((java.lang.Long) 1L);
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
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        model.Book book14 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book9 = bookService0.save(book8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass28 = bookList27.getClass();
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
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
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
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.lang.Class<?> wildcardClass22 = bookList21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book13 = bookService0.save(book12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

