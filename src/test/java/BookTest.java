import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("Neuromancer", "William Gibson", "Sci-Fi");
    }

    @Test
    public void hasTitle() {
        assertEquals("Neuromancer", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("William Gibson", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Sci-Fi", book.getGenre());
    }
}
