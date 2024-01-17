//import java.lang.*;
public class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    public Book() {
        System.out.print("");
    }

    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAurthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        this.availableQuantity -= amount;
    }

    public void ShowDetails() {
        System.out.println("ISBN :" + isbn);
        System.out.println("BOOK-TITlE :" + bookTitle);
        System.out.println("PRICE :" + price);
        System.out.println("AVAILABLE QUANTITY :" + availableQuantity);
    }
}