public class LibraryItemFactory {

    public Item createItem(String type, String title, int publicationYear, String extraData) {
        if (type.equals("book")) {
            return new Book(title, publicationYear, extraData);
        } 
        else if (type.equals("magazine")) {
            return new Magazine(title, publicationYear, Integer.parseInt(extraData));
        }
        return null;
    }

}