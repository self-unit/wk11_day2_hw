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

    public void addBook(Book book) {
        stock.add(book);
        capacity -= 1;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void checkCapacityBeforeAddBook(Book book) {
        if (this.capacity >= 1) {
            addBook(book);
        }
    }
}
