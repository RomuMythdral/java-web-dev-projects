package org.restaurant;
import java.util.ArrayList;
import java.util.Date;



public class Main {

    public static void main(String[] args) {
        // NewItem(double p, String d, String c, boolean iN)

    MenuItem turkeySandwich = new MenuItem( p: 10.00, d: "Turkey Sandwich", c: "Entree" iN: "True");
    MenuItem fishTacos = new MenuItem( p: 9.50, d: "Fish Tacos", c: "Entree" iN: "True");
    MenuItem pizza = new MenuItem( p: 9.00, d: "Pizza", c: "Appetizer" iN: "True");

    ArrayList<MenuItme> itemHolder = new ArrayList<>();

    itemHolder.add(turkeySandwich);
    itemHolder.add(fishTacos);
    itemHolder.add(pizza);

    Menu  menu = new Menu(new Date(), itemHolder);





    }
}



