import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = book13.getClass();
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
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
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 100L);
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
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
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        model.Book book26 = bookService0.update(book25);
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
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.lang.Class<?> wildcardClass18 = bookList17.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.lang.Class<?> wildcardClass6 = bookList5.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        bookService0.delete((java.lang.Long) 1L);
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
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.Class<?> wildcardClass17 = bookList16.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.lang.Class<?> wildcardClass28 = bookList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
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
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        model.Book book23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book24 = bookService0.save(book23);
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        bookService0.delete((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        model.Book book24 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.lang.Class<?> wildcardClass4 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 100L);
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.Class<?> wildcardClass22 = bookList21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        model.Book book19 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        model.Book book9 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        model.Book book16 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        model.Book book31 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book32 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book33 = bookService0.save(book32);
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
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNull(book29);
        org.junit.Assert.assertNull(book31);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        java.util.List<model.Book> bookList28 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 10L);
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("hi!");
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        model.Book book16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book17 = bookService0.save(book16);
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
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        bookService0.delete((java.lang.Long) 0L);
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.util.List<model.Book> bookList24 = bookService0.findAll();
        java.lang.Class<?> wildcardClass25 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        model.Book book12 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        bookService0.delete((java.lang.Long) 0L);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 100L);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        model.Book book23 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.util.List<model.Book> bookList33 = bookService0.findByTitle("hi!");
        model.Book book34 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book35 = bookService0.save(book34);
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
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNull(book29);
        org.junit.Assert.assertNotNull(bookList31);
        org.junit.Assert.assertNotNull(bookList33);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass7 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 100L);
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        java.lang.Class<?> wildcardClass19 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = book9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.util.List<model.Book> bookList14 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book10 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        model.Book book21 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        model.Book book16 = null;
        model.Book book17 = bookService0.update(book16);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("hi!");
        model.Book book18 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        model.Book book15 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        model.Book book14 = bookService0.update(book13);
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        model.Book book13 = null;
        model.Book book14 = bookService0.update(book13);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        model.Book book18 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        bookService0.delete((java.lang.Long) 100L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass23 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        bookService0.delete((java.lang.Long) (-1L));
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 100L);
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        model.Book book21 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList25 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass24 = bookList23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
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
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass15 = bookList14.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
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
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass10 = bookList9.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.Class<?> wildcardClass19 = bookList18.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.lang.Class<?> wildcardClass10 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        model.Book book23 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("hi!");
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        bookService0.delete((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
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
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.lang.Class<?> wildcardClass8 = bookList7.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList22 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList15 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book8 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("hi!");
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
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
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 100L);
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
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 100L);
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        model.Book book15 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book10 = bookService0.save(book9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.lang.Class<?> wildcardClass16 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        model.Book book15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book16 = bookService0.save(book15);
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
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.Class<?> wildcardClass20 = bookList19.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList6 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book11 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        java.util.List<model.Book> bookList19 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList26 = bookService0.findAll();
        java.util.List<model.Book> bookList28 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNotNull(bookList28);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        bookService0.delete((java.lang.Long) 100L);
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 0L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book24 = null;
        model.Book book25 = bookService0.update(book24);
        model.Book book27 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNull(book27);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book13 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        java.util.List<model.Book> bookList15 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        model.Book book26 = bookService0.findById((java.lang.Long) 100L);
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
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass12 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = book22.getClass();
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book8 = bookService0.findById((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        java.util.List<model.Book> bookList20 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass21 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        bookService0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 0L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.Class<?> wildcardClass16 = bookList15.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        model.Book book25 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList23 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        bookService0.delete((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        model.Book book24 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList26 = bookService0.findByTitle("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNotNull(bookList26);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        model.Book book24 = bookService0.findById((java.lang.Long) 100L);
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
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        model.Book book25 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList27 = bookService0.findByAuthor("hi!");
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
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNull(book25);
        org.junit.Assert.assertNotNull(bookList27);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = book8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.Class<?> wildcardClass24 = bookList23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        model.Book book10 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass13 = bookList12.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 0L);
        model.Book book16 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList18 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList21 = bookService0.findAll();
        java.lang.Class<?> wildcardClass22 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList18 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        java.util.List<model.Book> bookList23 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        model.Book book15 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        java.util.List<model.Book> bookList20 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        model.Book book18 = bookService0.update(book17);
        java.util.List<model.Book> bookList19 = bookService0.findAll();
        java.util.List<model.Book> bookList21 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 100L);
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
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        model.Book book21 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNull(book21);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList17 = bookService0.findByTitle("hi!");
        model.Book book18 = null;
        model.Book book19 = bookService0.update(book18);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        java.util.List<model.Book> bookList20 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = bookList13.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = book26.getClass();
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
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book24);
        org.junit.Assert.assertNull(book26);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        model.Book book14 = bookService0.findById((java.lang.Long) 1L);
        model.Book book16 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        bookService0.delete((java.lang.Long) 1L);
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
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookList8.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        model.Book book4 = null;
        model.Book book5 = bookService0.update(book4);
        java.util.List<model.Book> bookList7 = bookService0.findByAuthor("hi!");
        model.Book book9 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        model.Book book13 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList25 = bookService0.findAll();
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
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        model.Book book7 = null;
        model.Book book8 = bookService0.update(book7);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList9 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("");
        model.Book book15 = null;
        model.Book book16 = bookService0.update(book15);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book12 = bookService0.findById((java.lang.Long) 100L);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList14 = bookService0.findByTitle("hi!");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList14);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book11 = bookService0.save(book10);
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
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 0L);
        model.Book book18 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        java.util.List<model.Book> bookList7 = bookService0.findByTitle("");
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findAll();
        model.Book book12 = bookService0.findById((java.lang.Long) 1L);
        java.lang.Class<?> wildcardClass13 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.Class<?> wildcardClass18 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book11 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList21 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass22 = bookList21.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList25);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList5 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList8 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookList8);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book24 = bookService0.findById((java.lang.Long) 100L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book6 = null;
        model.Book book7 = bookService0.update(book6);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        model.Book book23 = null;
        model.Book book24 = bookService0.update(book23);
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
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        java.util.List<model.Book> bookList9 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 0L);
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        bookService0.delete((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        // The following exception was thrown during execution in test generation
        try {
            model.Book book15 = bookService0.save(book14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        java.lang.Class<?> wildcardClass17 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.util.List<model.Book> bookList24 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList26 = bookService0.findByAuthor("");
        model.Book book27 = null;
        model.Book book28 = bookService0.update(book27);
        java.util.List<model.Book> bookList29 = bookService0.findAll();
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
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNull(book22);
        org.junit.Assert.assertNotNull(bookList24);
        org.junit.Assert.assertNotNull(bookList26);
        org.junit.Assert.assertNull(book28);
        org.junit.Assert.assertNotNull(bookList29);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 1L);
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        model.Book book12 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
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
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByTitle("hi!");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        model.Book book15 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList17 = bookService0.findAll();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList17);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        bookService0.delete((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
        model.Book book20 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNull(book20);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass7 = bookList6.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.Class<?> wildcardClass29 = bookService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass11 = bookList10.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList6 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass11 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList3 = bookService0.findAll();
        java.util.List<model.Book> bookList4 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.util.List<model.Book> bookList16 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.util.List<model.Book> bookList22 = bookService0.findByAuthor("hi!");
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.Class<?> wildcardClass20 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList7);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        bookService0.delete((java.lang.Long) 1L);
        java.util.List<model.Book> bookList12 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList14 = bookService0.findByAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass8 = bookService0.getClass();
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.Class<?> wildcardClass15 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("");
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        bookService0.delete((java.lang.Long) (-1L));
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        model.Book book22 = null;
        model.Book book23 = bookService0.update(book22);
        model.Book book25 = bookService0.findById((java.lang.Long) 0L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNull(book23);
        org.junit.Assert.assertNull(book25);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        model.Book book9 = null;
        model.Book book10 = bookService0.update(book9);
        java.util.List<model.Book> bookList11 = bookService0.findAll();
        java.lang.Class<?> wildcardClass12 = bookList11.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book6 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList13 = bookService0.findByAuthor("");
        java.lang.Class<?> wildcardClass14 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = book24.getClass();
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
        org.junit.Assert.assertNull(book24);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        model.Book book10 = bookService0.findById((java.lang.Long) (-1L));
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
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        java.util.List<model.Book> bookList18 = bookService0.findAll();
        model.Book book19 = null;
        model.Book book20 = bookService0.update(book19);
        java.util.List<model.Book> bookList22 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNull(book20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.util.List<model.Book> bookList17 = bookService0.findByAuthor("hi!");
        java.util.List<model.Book> bookList19 = bookService0.findByAuthor("");
        model.Book book20 = null;
        model.Book book21 = bookService0.update(book20);
        java.util.List<model.Book> bookList23 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList25 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList27 = bookService0.findByTitle("");
        java.lang.Class<?> wildcardClass28 = bookList27.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book21);
        org.junit.Assert.assertNotNull(bookList23);
        org.junit.Assert.assertNotNull(bookList25);
        org.junit.Assert.assertNotNull(bookList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findByAuthor("hi!");
        model.Book book14 = bookService0.findById((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = book17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        java.util.List<model.Book> bookList24 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
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
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        bookService0.delete((java.lang.Long) 1L);
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
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNull(book23);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        bookService0.delete((java.lang.Long) (-1L));
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
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
        org.junit.Assert.assertNotNull(bookList9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        bookService0.delete((java.lang.Long) 0L);
        java.lang.Class<?> wildcardClass24 = bookService0.getClass();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        model.Book book14 = null;
        model.Book book15 = bookService0.update(book14);
        bookService0.delete((java.lang.Long) 10L);
        model.Book book19 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNull(book15);
        org.junit.Assert.assertNull(book19);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        bookService0.delete((java.lang.Long) (-1L));
        bookService0.delete((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList7 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
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
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("hi!");
        model.Book book6 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.lang.Class<?> wildcardClass9 = bookService0.getClass();
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList10 = bookService0.findByAuthor("");
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        model.Book book14 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList16 = bookService0.findByTitle("hi!");
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
        java.util.List<model.Book> bookList15 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(bookList15);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        model.Book book6 = bookService0.findById((java.lang.Long) 100L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList12);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        service.BookService bookService0 = new service.BookService();
        model.Book book1 = null;
        model.Book book2 = bookService0.update(book1);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        bookService0.delete((java.lang.Long) 100L);
        model.Book book9 = bookService0.findById((java.lang.Long) 0L);
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        model.Book book12 = null;
        model.Book book13 = bookService0.update(book12);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNull(book13);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 1L);
        bookService0.delete((java.lang.Long) 100L);
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 100L);
        model.Book book11 = null;
        model.Book book12 = bookService0.update(book11);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        org.junit.Assert.assertNull(book10);
        org.junit.Assert.assertNull(book12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        model.Book book10 = null;
        model.Book book11 = bookService0.update(book10);
        java.util.List<model.Book> bookList12 = bookService0.findAll();
        java.util.List<model.Book> bookList13 = bookService0.findAll();
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        service.BookService bookService0 = new service.BookService();
        model.Book book2 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) (-1L));
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book3 = null;
        model.Book book4 = bookService0.update(book3);
        model.Book book5 = null;
        model.Book book6 = bookService0.update(book5);
        bookService0.delete((java.lang.Long) 1L);
        model.Book book10 = bookService0.findById((java.lang.Long) 10L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByTitle("");
        bookService0.delete((java.lang.Long) 10L);
        model.Book book8 = bookService0.findById((java.lang.Long) 10L);
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
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        model.Book book17 = null;
        model.Book book18 = bookService0.update(book17);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNull(book16);
        org.junit.Assert.assertNull(book18);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        model.Book book4 = bookService0.findById((java.lang.Long) 10L);
        java.util.List<model.Book> bookList6 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList8 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList9 = bookService0.findAll();
        java.util.List<model.Book> bookList11 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("hi!");
        model.Book book15 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNull(book15);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNull(book13);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
        model.Book book17 = bookService0.findById((java.lang.Long) 1L);
        java.util.List<model.Book> bookList19 = bookService0.findByTitle("hi!");
        java.util.List<model.Book> bookList20 = bookService0.findAll();
        model.Book book22 = bookService0.findById((java.lang.Long) 1L);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookList8);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookList12);
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList15);
        org.junit.Assert.assertNull(book17);
        org.junit.Assert.assertNotNull(bookList19);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNull(book22);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        service.BookService bookService0 = new service.BookService();
        bookService0.delete((java.lang.Long) 10L);
        java.util.List<model.Book> bookList4 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList5 = bookService0.findAll();
        model.Book book7 = bookService0.findById((java.lang.Long) 0L);
        model.Book book8 = null;
        model.Book book9 = bookService0.update(book8);
        java.util.List<model.Book> bookList11 = bookService0.findByAuthor("");
        java.util.List<model.Book> bookList13 = bookService0.findByTitle("");
        org.junit.Assert.assertNotNull(bookList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(bookList11);
        org.junit.Assert.assertNotNull(bookList13);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        org.junit.Assert.assertNull(book14);
        org.junit.Assert.assertNotNull(bookList16);
        org.junit.Assert.assertNotNull(bookList18);
        org.junit.Assert.assertNotNull(bookList20);
        org.junit.Assert.assertNotNull(bookList22);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        org.junit.Assert.assertNotNull(bookList19);
    }
}

