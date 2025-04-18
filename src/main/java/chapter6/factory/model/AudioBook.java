package chapter6.factory.model;

public class AudioBook extends Book {

    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Audio Book: \"" + title + "\" by " + author);
    }
}

