import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int getBooksInCollection() {
        return collection.size();
    }

    public void addBookToCollection(Library library, Book book) {
        library.giveBook(book);
        collection.add(book);
    }

}
