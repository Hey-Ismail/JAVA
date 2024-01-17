public class StoryBook//parent {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQunatity;
    private String category;
    static double discountRate = 0.0;

    public StoryBook() {
        System.out.println("\n");
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String category) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQunatity = availableQuantity;
        this.category = category;
    }

    public static void setDiscountRate(double rate) {
        StoryBook.discountRate = rate;
    }

    public static double getDiscountRate() {
        return StoryBook.discountRate;
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

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
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
        System.out.println("Category of the book: " + category);

    }
}
