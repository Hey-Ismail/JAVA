package BookClass;
public class BookShop {
    private String name;
    TextBook textBooks[];
    StoryBook storyBooks[];

    BookShop() {
        System.out.println("");
    }

    BookShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void insertTextBook(TextBook tb) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                check = 1;
                break;
            }
            if (check == 1) {
                System.out.println("\n-------------------------");
                System.out.println("Text Book has been inserted");
                System.out.println("-------------------------\n");
            } else {
                System.out.println("Text Book has not been inserted yet");
            }

        }

    }

    void removeTextBook(TextBook tb) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == tb) {
                textBooks[i] = null;
                check = 1;
                break;
            }
            if (check == 1) {
                System.out.println("\n-------------------------");
                System.out.println("Text Book has been removed");
                System.out.println("-------------------------\n");
            } else {
                System.out.println("Text Book has not been removed yet");
            }
        }
    }

    TextBook searchTextBook(String isbn) {
        int check = 0;
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i].getIsbn().equals(isbn)) {
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("\n-------------------------");
            System.out.println("Text Book found");
            System.out.println("-------------------------\n");
        } else {
            System.out.println("Text Book not found");
        }
    }

    void showAllTextBooks()
    {
        for(int i=0; i<textbooks.length; i++)
        {
            if(textBooks[i]!=null)
            {
               System.out.println( textBooks[i].showDetails());
            }
            else{
                System.out.println("Text Book are not found");
            }
        }
    }

    void insertStoryBook(StoryBook sb) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("\n-------------------------");
            System.out.println("Story Book has been inserted");
            System.out.println("-------------------------\n");
        } else {
            System.out.println("Story Book has not been inserted");
        }
    }

    void removeStoryBook(StoryBook sb) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == sb) {
                storyBooks[i] = null;
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("\n-------------------------");
            System.out.println("Story Book has been removed");
            System.out.println("-------------------------\n");
        } else {
            System.out.println("Story Book has not been removed yet");
        }
    }

    StoryBook searchStoryBook(String isbn) {
        int check = 0;
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i].getIsbn().equals(isbn)) {
                check = 1;
                break;
            }
        }
        if (check == 1) {
            System.out.println("\n-------------------------");
            System.out.println("Story Book found");
            System.out.println("-------------------------\n");
        } else {
            System.out.println("Story Book has not found yet");
        }
    }

    void showAllStoryBooks() {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null) {
                System.out.println(storyBooks[i].showDetails());
            } else {
                System.out.println("Story Book are not found");
            }
        }
    }

    void showDetails() {
        System.out.println("Shop Name :" + name);
    }

}