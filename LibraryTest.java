public class LibraryTest {

    public static void main(String... args) {

        LibraryItemFactory lif = new LibraryItemFactory();

        // two books
        Item bookOne = lif.createItem("book", "Test Book One", 2025, "John Smith");
        Item bookTwo = lif.createItem("book", "Test Book Two", 1607, "John Rolfe");

        // one magazine
        Item magazineOne = lif.createItem("magazine", "Test Magazine One", 1901, "100");

        // create a library object
        Library libby = Library.getInstance();
        // add books to library
        libby.addItem(bookOne);
        libby.addItem(bookTwo);
        libby.addItem(magazineOne);

        System.out.println("Is Book One Borrowed? " + bookOne.isBorrowed());
        // borrow book one
        bookOne.borrowItem("Test Borrower");
        System.out.println("Is Book One Borrowed (After borrowItem)? " + bookOne.isBorrowed());
        // return book one
        bookOne.returnItem();
        System.out.println("Is Book One Borrowed (After returnItem)? " + bookOne.isBorrowed() + "\n");

        // list available items
        System.out.println("List available items: ");
        libby.listAvailableItems();

        // search by title
        System.out.println("Find 'Test Book One' by title: ");
        libby.findItemByTitle("Test Book One");

    }
    
}
