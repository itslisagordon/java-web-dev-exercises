package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
//app should know when the menu was last updated
    //will use Date() in some form

    private ArrayList<MenuItem> listOfPlates;
    private Date lastUpdated;

    public Menu() {
        this.listOfPlates = new ArrayList<>();
        this.lastUpdated = new Date(); //right now
    }



}
