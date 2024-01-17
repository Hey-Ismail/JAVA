import java.lang.*;

public class TextBook extends Book {
    private int standard;

    TextBook() {
        System.out.println("");
    }

    public TextBook(String isbn, String bookTitle, String authurName, double price, int availableQuantity,
            int standard) {
        super(isbn, bookTitle, authurName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Standard :" + standard + "th");
    }

    public static void setDiscountRate(int i) {
    }

    public static String getDiscountRate() {
        return null;
    }
}
