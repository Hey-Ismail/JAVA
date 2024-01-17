//import java.lang.*;

public class StoryBook extends Book {
    private String category;

    StoryBook() {
        System.out.println("");
    }
    public StoryBook(String isbn, String bookTitle, String authurName, double price, int availableQuantity,
            String category) {
        super(isbn, bookTitle, authurName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Category :" + category);
    }
    public static void setDiscountRate(int i) {
    }
    public static String getDiscountRate() {
        return null;
    }

}
