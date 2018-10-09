import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;

    public Library() {
        this.stock = new ArrayList<>();
    }

    public int getBookCount() {
        return stock.size();
    }

    public boolean addBook(Book book) {
        return stock.add(book);
    }
}
