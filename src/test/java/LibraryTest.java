import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;

    @Before
    public void before() {
        book1 = new Book("Neuromancer", "William Gibson", "Sci-Fi");
        book2 = new Book("Life of Pi", "Yann Martel", "Fiction");
        book3 = new Book("Candide", "Voltaire", "Fiction");
        book4 = new Book("Democracy in America", "Alexis de Tocqueville", "Non-Fiction");

        library = new Library();
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void getBookCount() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void getCapacity() {
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void addBookFalse() {
        library.checkCapacityBeforeAddBook(book1);
        library.checkCapacityBeforeAddBook(book2);
        library.checkCapacityBeforeAddBook(book3);
        library.checkCapacityBeforeAddBook(book4);
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void getGenreCount() {
        library.checkCapacityBeforeAddBook(book1);
        library.checkCapacityBeforeAddBook(book2);
        library.checkCapacityBeforeAddBook(book3);
        assertEquals(2, library.getGenreCount("Fiction"));
    }
}
