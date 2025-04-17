package cheapter6.singleton;

import cheapter6.factory.model.Book;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    private List<Book> cart;

    // Private constructor
    private CartManager() {
        cart = new ArrayList<>();
    }

    // Static method to get the single instance
    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        cart.add(book);
        System.out.println("Added to cart: " + book.getTitle());
    }

    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("No cart to display");
        }
        System.out.println("🛒 Cart contains:");
        for (Book book : cart) {
            book.displayInfo();
        }
    }

    public void clearCart() {
        cart.clear();
        System.out.println("Cart cleared.");
    }
}

