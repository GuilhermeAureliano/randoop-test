import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        model.Book book25 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = book16.getClass();
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
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        model.Book book24 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        java.util.List<model.Book> bookList27 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        model.Book book20 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        bookService0.delete((java.lang.Long) 0L);
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
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
        java.util.List<model.Book> bookList25 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        model.Book book23 = bookService0.update(book22);
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }
}

