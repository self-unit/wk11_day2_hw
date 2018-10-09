import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
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

        borrower = new Borrower();
    }

    @Test
    public void hasCollection() {
        assertEquals(0, borrower.getBooksInCollection());
    }

    @Test
    public void addBookToCollection() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.addBookToCollection(library, book1);
        assertEquals(1, borrower.getBooksInCollection());
        assertEquals(2, library.getBookCount());
    }
}
