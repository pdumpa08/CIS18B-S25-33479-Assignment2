public abstract class Item {

    private String title;
    private int publicationYear;

    // constructor
    public Item(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // getters
    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    // methods
    public abstract boolean isBorrowed();
    public abstract void returnItem();
    public abstract void borrowItem(String borrower);

}