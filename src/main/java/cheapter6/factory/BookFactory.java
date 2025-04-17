package cheapter6.factory;

import cheapter6.factory.enums.BookTypeEnum;
import cheapter6.factory.model.AudioBook;
import cheapter6.factory.model.Book;
import cheapter6.factory.model.EBook;
import cheapter6.factory.model.PrintedBook;

public class BookFactory {
    public static Book createBook(BookTypeEnum type, String title, String author) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case PRINTED:
                return new PrintedBook(title, author);
            case EBOOK:
                return new EBook(title, author);
            case AUDIO:
                return new AudioBook(title, author);
            default:
                throw new IllegalArgumentException("Unsupported book type: " + type);
        }
    }
}

