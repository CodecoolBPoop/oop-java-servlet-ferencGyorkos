package com.codecool.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItemStore {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        for (Iterator<Item> iterator = items.iterator(); iterator.hasNext(); ) {
            Item cartItem = iterator.next();
            if (cartItem.getName().equals(item.getName())) {
                iterator.remove();
                break;
            }
        }
    }

    public String getAsHTML() {
        StringBuffer result = new StringBuffer();
        for (Item item: items) {
            result.append("<tr>");
            result.append("<td class=\"text-left\">" + item.getName() + "</td>");
            result.append("<td class=\"text-right\"> $" + item.getPrice() + "</td>");
            result.append("<form action=\"/webshop\" method=\"get\">");
            result.append("<td class=\"text-center\"><button type=\"submit\" value=" + item.getId() + " name=\"add\"> Add </button></td>");
            result.append("<td class=\"text-center\"><button type=\"submit\" value=" + item.getId() + " name=\"remove\"> Remove </button></td>");
            result.append("</tr>");
            result.append("</form>");
        }
        return result.toString();
    }

    public String getCartItems() {
        StringBuffer result = new StringBuffer();
        double sum = 0;
        for (Item item: items) {
            result.append("<tr>");
            result.append("<td class=\"text-left\">" + item.getName() + "</td>");
            result.append("<td class=\"text-right\"> $" + item.getPrice() + "</td>");
            result.append("</tr>");
            sum += item.getPrice();
        }
        result.append("<tr><td><h3>Total: </h3></td><td class=\"text-right\"><h3> $" + sum + "</h3></td></tr>");
        return result.toString();
    }

    public Item findItem(int id) {
        for (Item item: items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

}
