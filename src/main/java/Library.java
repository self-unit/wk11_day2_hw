import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library() {
        this.stock = new ArrayList<>();
        this.capacity = 3;
        this.genreCount = new HashMap<>();
    }

    public int getBookCount() {
        return stock.size();
    }

    public Object giveBook(Book book) {
        return stock.remove(book);
    }

    public void addBook(Book book) {
        stock.add(book);
        String genre = book.getGenre();
//        genreCount.put(genre, 1);
//        genreCount.merge(genre, 1, (oldValue, one) -> oldValue + one);
        genreCount.compute(genre, (genreKey, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        capacity -= 1;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGenreCount(String genre) {
        return genreCount.get(genre);
    }

    public void checkCapacityBeforeAddBook(Book book) {
        if (this.capacity >= 1) {
            addBook(book);
        }
    }
}
