package cheapter6.factory.model;

public class EBook extends Book {

    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("E-Book: \"" + title + "\" by " + author);
    }
}

