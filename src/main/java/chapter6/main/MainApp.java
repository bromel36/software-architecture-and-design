package chapter6.main;

import chapter6.factory.BookFactory;
import chapter6.factory.enums.BookTypeEnum;
import chapter6.factory.model.Book;
import chapter6.singleton.CartManager;

public class MainApp {
    public static void main(String[] args) {
        Book printed = BookFactory.createBook(BookTypeEnum.PRINTED, "The Great Gatsby", "F. Scott Fitzgerald");
        Book ebook = BookFactory.createBook(BookTypeEnum.EBOOK, "1984", "George Orwell");
        Book audio = BookFactory.createBook(BookTypeEnum.AUDIO, "Becoming", "Michelle Obama");

        printed.displayInfo();
        ebook.displayInfo();
        audio.displayInfo();

        CartManager cart = CartManager.getInstance();

        cart.addBook(printed);
        cart.addBook(ebook);
        cart.addBook(audio);

        cart.showCart();

        System.out.println("========================================================");

        cart.clearCart();

        cart.showCart();
    }
}

