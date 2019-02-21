package com.codecool.servlet;

public class Item {
    // fields: id(generated Integer), name(String), price(float or double)
    public static int staticId = 1;
    private int id;
    private String name;
    private double price;

    public Item(String name, double price) {
        this.id = staticId++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
