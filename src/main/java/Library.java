import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
        this.stock = new ArrayList<>();
        this.capacity = 3;
    }

    public int getBookCount() {
        return stock.size();
    }

    public boolean addBook(Book book) {
        return stock.add(book);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
