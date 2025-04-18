package chapter6.factory;

import chapter6.factory.enums.BookTypeEnum;
import chapter6.factory.model.AudioBook;
import chapter6.factory.model.Book;
import chapter6.factory.model.EBook;
import chapter6.factory.model.PrintedBook;

public class BookFactory {
    public static Book createBook(BookTypeEnum type, String title, String author) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case PRINTED -> new PrintedBook(title, author);
            case EBOOK -> new EBook(title, author);
            case AUDIO -> new AudioBook(title, author);
            default -> throw new IllegalArgumentException("Unsupported book type: " + type);
        };
    }
}

