package BookClass;

public class StoryBook extends Book {
    private String category;

    StoryBook() {
        System.out.println("-----");
    }

    StoryBook(String isbn, String bookTile, String authorName, double price, int availableQuantity, String category) {
        super(isbn, bookTile, authorName, price, availableQuantity);
        this.category = category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    String getCategory() {
        return category;
    }

    public void showDetails() {
        System.out.println("Isbn :" + super.getIsbn());
        System.out.println("Book Title :" + super.getBookTile());
        System.out.println("Author Name :" + super.getAuthorName());
        System.out.println("Price :" + super.getPrice());
        System.out.println("Available Quantity :" + super.getAvailableQuantity());
        System.out.println("Category :" + category);
    }

}
