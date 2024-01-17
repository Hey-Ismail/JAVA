package BookClass;

public class TextBook extends Book {
    private String standard;

    TextBook() {
        System.out.println("-----");
    }

    TextBook(String isbn, String bookTile, String authorName, double price, int availableQuantity, String standard) {
        super(isbn, bookTile, authorName, price, availableQuantity);
        this.standard = standard;
    }

    void setStandard(String standard) {
        this.standard = standard;
    }

    String getStandard() {
        return standard;
    }

    public void showDetails() {
        System.out.println("Isbn :" + super.getIsbn());
        System.out.println("Book Title :" + super.getBookTile());
        System.out.println("Author Name :" + super.getAuthorName());
        System.out.println("Price :" + super.getPrice());
        System.out.println("Available Quantity :" + super.getAvailableQuantity());
        System.out.println("Standard :" + standard + " th");
    }
}
