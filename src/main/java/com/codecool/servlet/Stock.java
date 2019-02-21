package com.codecool.servlet;

public class Stock {
    public static ItemStore stock = new ItemStore();

    static {
        stock.add(new Item("HP laptop", 1500));
        stock.add(new Item("Samsung tablet", 300));
        stock.add(new Item("Lg phone", 400));
        stock.add(new Item("Lenovo laptop", 1350));
        stock.add(new Item("Tesla ebook", 25));
    }
}
