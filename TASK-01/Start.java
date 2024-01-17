//import java.lang.*;
public class Start {
        public static void main(String[] args) {
                Book b1 = new Book("978-0-345-33366-2", "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 15.08,
                                10);
                System.out.println("Show-Details of book 1:");
                System.out.println("");
                b1.ShowDetails();
                System.out.println("");

                Book b2 = new Book("978-0134685960", "Thinking in Java", "Bruce Eckel", 49.99, 15);
                System.out.println("Show-Details of book 2:");
                System.out.println("");
                b2.ShowDetails();
                System.out.println();

                System.out.println("After adding and selling books:\n");

                b1.addQuantity(5);
                b2.sellQuantity(3);

                System.out.println("Book 1 details:");
                b1.ShowDetails();
                System.out.println("");

                System.out.println("Book 2 details:");
                b2.ShowDetails();

        }
}