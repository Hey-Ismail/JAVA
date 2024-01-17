//import java.lang.*;

public class Start {
    public static void main(String[] args) {

        System.out.println("DETAILS OF STORY-BOOK-----\n");
        Book book = new StoryBook("978-0-345-33366-2", "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", 15.08, 10, "Fantasy Novel");
        book.addQuantity(8);
        book.sellQuantity(5);
        book.showDetails();

        System.out.println("");

        System.out.println("DETAILS OF TEXT-BOOK-----\n");
        Book book2 = new TextBook("978-0-393-97913-7", "Algebra and Trigonometry", "Robert Blitze", 109.99, 12,
                8);
        book2.addQuantity(5);
        book2.sellQuantity(3);
        book2.showDetails();

    }
}
