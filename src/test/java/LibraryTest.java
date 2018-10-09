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
        assertEquals(true, library.addBook(book1));
    }

    @Test
    public void getBookCount() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.getBookCount());
    }

    @Test
    public void getCapacity() {
        assertEquals(3, library.getCapacity());
    }
}
