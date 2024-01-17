package BookClass;

public class Main {
    public static void main(String[] args) {
        Book b1 = new StoryBook("12345", "isufsofh", "ius", 123, 10, "Lawra");
        Book b2= new StoryBook("eiurtuierg", "nwsjklkflhjewul", "ksjldfuiohwfenull", 0345, 78, "eoirh");
        b1.addQuantity(6);
        b1.sellQuantity(9);
        b2.addQuantity(9);
        b2.sellQuantity(6);

        b1.showDetails();   b2.showDetails();

        Book b3 = new TextBook("12345", "isufsofh", "ius", 123, 10, "Lawra");
        Book b4= new TextBook("eiurtuierg", "nwsjklkflhjewul", "ksjldfuiohwfenull", 0345, 78, "eoirh");
        b3.addQuantity(6);
        b4.sellQuantity(9);
        b3.addQuantity(9);
        b4.sellQuantity(6);
        b3.insertTextBook(osief);
        b4.removeTextBook(weiu);
        b3.

        b3.showDetails(); b4.showDetails();
        System.out.println("\n");

        Book b5 = new TextBook("oiweuhiujw", "uiosdoiwey8f", "isudy", 98347, 14, 10);
        Book b6 = new TextBook("oiweuhiujw", "uiosdy8f", "isiweuudy", 98347, 14, 10);
        b5.addQuantity(4);
        b6.sellQuantity(6);
        b5.sellQuantity(5);
        b6.addQuantity(7);

        b5.showDetails(); b6.showDetails();

        System.out.println("\n");

        Book



    }
}