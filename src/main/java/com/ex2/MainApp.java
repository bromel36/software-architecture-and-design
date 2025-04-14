package com.ex2;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Clean Code", "Robert C. Martin"));
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("The Pragmatic Programmer", "Andy Hunt"));
        books.add(new Book("Java Concurrency in Practice", "Brian Goetz"));

        Book target = new Book("Effective Java", "Joshua Bloch");

        Search<Book> linear = new LinearSearch<>();
        Search<Book> binary = new BinarySearch<>();
        System.out.println(books);

        int index1 = linear.search(books, target);
        System.out.println("Linear Search: Found at index " + index1);

        int index2 = binary.search(books, target);
        System.out.println("Binary Search: Found at index " + index2);
    }
}
