/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resturants_management;

import java.text.NumberFormat;

/**
 *
 * @author Mohammed
 */
public class Item {
    double price;
    String name;
    String category;
   
    public Item( String name, String category,double price) {
        this.price = price;
        this.name = name;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   

    @Override
    public String toString() {
        return name + "\t "+(price) ; //To change body of generated methods, choose Tools | Templates.
    }
   
}
