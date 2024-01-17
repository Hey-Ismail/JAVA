
public class TextBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQunatity;
    private int standard;
    static double discountRate = 0.0;

    public TextBook() {
        System.out.println("\n");
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            int standard) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQunatity = availableQuantity;
        this.standard = standard;
    }

    public static void setDiscountRate(double rate) {
        TextBook.discountRate = rate;
    }

    public static double getDiscountRate() {
        return TextBook.discountRate;
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

    public void setPrice(double price)

    {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQunatity = availableQuantity;
    }

    public int getAvailableQuantity() {
        return availableQunatity;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void addQuantity(int amount) {
        this.availableQunatity += amount;
    }

    public void sellQuantity(int amount) {
        this.availableQunatity -= amount;
    }

    public void ShowDetails() {
        System.out.println("ISBN of the Book: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author name: " + authorName);
        System.out.println("Price : " + price);
        System.out.println("Available Quantity :" + availableQunatity);
        System.out.println("This text book is For " + standard + "th standard");

    }
}
