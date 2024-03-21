package com.example.iterable;

import java.util.*;

public class Bag<T> implements Container<T>{
    private List<T> items;

    // Constructor
    public Bag() {
        items = new ArrayList<>();
    }

    // Check if the bag is empty
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Get the size of the bag
    @Override
    public int size() {
        return items.size();
    }

    // Add an item to the bag
    @Override
    public void add(T item) {
        items.add(item);
    }

    // Iterator for iterating over items in the bag
    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }
}
