package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private ArrayList<MenuItem> listOfPlates;
    private Date lastUpdated;

    public Menu() {
        this.listOfPlates = new ArrayList<>();
        this.lastUpdated = new Date(); //right now
    }

    public void addMenuItem(MenuItem newItem) {
        if (!listOfPlates.contains(newItem)) {
            listOfPlates.add(newItem);
            this.lastUpdated = new Date();
        }
    }

    public void removeMenuItem(MenuItem oldItem) {
        if (listOfPlates.contains(oldItem)) {
            listOfPlates.remove(oldItem);
            this.lastUpdated = new Date();
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listOfPlates=" + listOfPlates +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void printItem(String searchVal) {
        if (listOfPlates.contains(searchVal)) {
            int index = listOfPlates.indexOf(searchVal);
            System.out.println(listOfPlates.get(index));
        }
    }

    public void printMenu() {
        System.out.println(listOfPlates);
    }

    public boolean isEqual(MenuItem item) {
        boolean isEqual = false;
        for (MenuItem i : listOfPlates) {
            if (i.equals(item)) {
               isEqual = true;
            }
        }
        return isEqual;
    }
}
