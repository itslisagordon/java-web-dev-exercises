package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    //price, description, category (appetizer, main course, or dessert)
    //should display whether MenuItem is new or not

    //fields:
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isVegan;

    //constructors:
    public MenuItem(String name, double price, String description, String category, boolean isNew, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.isVegan = isVegan;
        //setter will be different because it's a boolean
    }

    //getters/setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

}