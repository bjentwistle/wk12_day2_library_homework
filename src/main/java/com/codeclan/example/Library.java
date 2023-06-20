package com.codeclan.example;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity = 1000;
    public Library(int capacity, ArrayList stock) {
        this.stock = new ArrayList<>();
        this.capacity = 1000;
    }
    public int bookCount() {
        return this.stock.size();
    }

}
