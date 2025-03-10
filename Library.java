import java.util.ArrayList;

public class Library {

    private static Library instance;
    private ArrayList<Item> collection = new ArrayList<>();

    // constructor
    private Library() {}

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // methods
    public void addItem(Item item) {
        collection.add(item);
    }

    public void listAvailableItems() {
        for (Item item : collection) {
            if (!item.isBorrowed()) {
                System.out.println("Title: " + item.getTitle());
                System.out.println("publicationYear: " + item.getPublicationYear());
                System.out.println("Available: " + !item.isBorrowed() + "\n");
            }
        }
    }

    public void findItemByTitle(String title) {
        for (Item item : collection) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Title: " + item.getTitle());
                System.out.println("publicationYear: " + item.getPublicationYear());
                System.out.println("Available: " + !item.isBorrowed() + "\n");
            }
        }
    }

}