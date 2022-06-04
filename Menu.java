/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resturants_management;

import java.util.ArrayList;

/**
 *
* @author Mohammed
 */
public class Menu {
    ArrayList<Item> appetizers=new ArrayList<>();
    ArrayList<Item> main=new ArrayList<>();
    ArrayList<Item> drinks=new ArrayList<>();

    public Menu() {
         populatemenue();
    }
    public Item getAppetizer(int i){
        return appetizers.get(i);
    }
     public Item getMain(int i){
        return main.get(i);
    }
      public Item getDrink(int i){
        return drinks.get(i);
    }
   public String getAllAppetizers(){
        String aMenu="";
        aMenu+="Appetizers:\n";
        for (int i = 0; i < appetizers.size(); i++) {
           aMenu+="(A"+(i+1)+")"+appetizers.get(i)+"\n";
       }
        return aMenu;}
         public String getAllMain(){
        String aMenu="";
        aMenu+="Main Dish:\n";
        for (int i = 0; i < main.size(); i++) {
           aMenu+="(M"+(i+1)+")"+main.get(i)+"\n";
       }
        return aMenu;
         }
         public String getAllDrinks(){
        String aMenu="";
        aMenu+="Drinks:\n";
        for (int i = 0; i < drinks.size(); i++) {
           aMenu+="(D"+(i+1)+")"+drinks.get(i)+"\n";
       }
        return aMenu;
        
    }
public void populatemenue(){
    appetizers.add(new Item( "French Fries", "Appetizers", 6));
    appetizers.add(new Item( "Salads", "Appetizers", 4));
     appetizers.add(new Item( "noodles", "Appetizers", 5));
    
  main.add(new Item( "Ruz Al Bukhari", "main", 15));
   main.add(new Item( "Saleeg", "main", 10));
   main.add(new Item( "Kabsa", "main", 12));
   
   drinks.add(new Item( "Ayran", "drinks", 3));
   drinks.add(new Item( "Cola", "drinks", 2));
   drinks.add(new Item( "Water", "drinks", 0));
  
   
}

    @Override
    public String toString() {
   String menu="";
   menu="Resturant Menu"+"\n";
   
          menu+=getAllAppetizers()+"\n";
            menu+=getAllMain()+"\n";
          menu+=getAllDrinks()+"\n";
          return menu;
        
    }

}
