package com.codeclan.example;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity = 1000;

    public Library(int capacity, ArrayList stock) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }
    public int bookCount() {
        return this.stock.size();
    }

    public void add(Book book) {
        this.stock.add(book);
    }
    public boolean getCapacity(Book book) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(book);
            return true;
        } else {
            System.out.println("Sorry the Library is full");
            return false;
        }
    }
}
