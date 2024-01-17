public class Main {

    public static void main(String args[]) {

        System.out.println("About Story-Book...\n");
        StoryBook storyBook = new StoryBook("978-0-345-33366-2", "Harry Potter and the Sorcerer's Stone",
                "J.K. Rowling", 15.08, 10, "Fantasy Novel");
        storyBook.addQuantity(6);
        storyBook.sellQuantity(9);
        storyBook.ShowDetails();
        StoryBook.setDiscountRate(10);
        System.out.println("YOU WILL GET " + StoryBook.getDiscountRate() + "%" + " DISCOUNT ON THIS BOOK");
        System.out.println("");

        System.out.println("About Text-Book...\n");

        TextBook textBook = new TextBook("978-0-393-97913-7", "Algebra and Trigonometry", "Robert Blitze", 109.99, 10,
                8);
        textBook.addQuantity(8);
        textBook.sellQuantity(5);
        // TextBook.setDiscountRate(10);
        textBook.ShowDetails();
        TextBook.setDiscountRate(18);
        System.out.println("YOU WILL GET " + TextBook.getDiscountRate() + "%" + " DISCOUNT ON THIS BOOK");
        // textBook.ShowDetails();

    }
}