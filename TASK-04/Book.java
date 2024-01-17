package BookClass;
public abstract class Book {
    private String isbn;
    private String bookTile;
    private String authorName;
    private double price;
    private int availableQuantity;

    Book() {
        System.out.println("-----");
    }

    Book(String isbn, String bookTile, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTile = bookTile;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void setBookTile(String bookTile) {
        this.bookTile = bookTile;
    }

    void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    String getIsbn() {
        return isbn;
    }

    String getBookTile() {
        return bookTile;
    }

    String getAuthorName() {
        return authorName;
    }

    double getPrice() {
        return price;
    }

    int getAvailableQuantity() {
        return availableQuantity;
    }

    void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    void sellQuantity(int amount) {
        this.availableQuantity -= amount;
    }

    public abstract void showDetails();

}