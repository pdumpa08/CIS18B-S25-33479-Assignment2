public class Magazine extends Item {

    private int issueNumber;
    private String borrower;

    // constructor
    public Magazine(String title, int publicationYear, int issueNumber) {
        super(title, publicationYear);
        this.issueNumber = issueNumber;
    }

    // getters
    public int getIssueNumber() {
        return this.issueNumber;
    }

    // methods
    public void borrowItem(String borrower) {}

    public void returnItem() {}

    public boolean isBorrowed() {
        if (this.borrower != null) {
            return true;
        }
        return false;
    }

}