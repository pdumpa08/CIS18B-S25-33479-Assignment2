public class Book extends Item implements IBorrowable {

    private String author;
    private String ISBN;
    private String borrower;

    // constructors
    public Book(String title, int publicationYear, String author) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = "Unknown";
    }

    public Book(String title, int publicationYear, String author, String ISBN) {
        super(title, publicationYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    // getters
    public String getAuthor() {
        return this.author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    // methods to implement IBorrowable interface
    public void borrowItem(String borrower) {
        if (this.borrower == null) {
            this.borrower = borrower;
        } else {
            System.out.println("This item is already borrowed!");
        }
    }

    public void returnItem() {
        this.borrower = null;
    }

    public boolean isBorrowed() {
        if (this.borrower != null) {
            return true;
        }
        return false;
    }

}