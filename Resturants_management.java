/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resturants_management;

import Labors_management.Server;
import Labors_management.Cashier;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mohammed
 */
public class Resturants_management {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Server>  servers=new ArrayList<>();

    public static ArrayList<Server> getServers() {
        return servers;
    }
        
    public static void main(String[] args) {
        ArrayList<Server> servers=new ArrayList<>();
        servers.add(new Server("Mohammed Saad", 1,"Drinks"));
         servers.add(new Server("Yasser", 2,"MA"));
        servers.add(new Server("Walled", 3,"MA"));
        servers.add(new Server("Rayan", 4,"Drinks"));
        servers.add(new Server("Khalid", 5,"MA"));
       
       Menu menu=new Menu();
          Order order=new Order(servers);
          order.placeServer();
        Scanner read=new Scanner(System.in);
        System.out.println("Welcome to our Resturant");
        System.out.println("whould you like to view the full menu or just a section? [FULL] [SEC]");
  String ans=read.next();
        while (!(ans.equalsIgnoreCase("full")||ans.equalsIgnoreCase("sec"))) {            
            ans=read.next();
            
        }
        if(ans.equalsIgnoreCase("full"))
            System.out.println(menu);
           System.out.println("Which Section? {Appetizers} {Main} {Drinks}");
            String sec=read.next();
        while (!(sec.equalsIgnoreCase("Appetizers")||sec.equalsIgnoreCase("Main")||sec.equalsIgnoreCase("Drinks"))) {            
            System.out.println("Not Valid");
         sec=read.next();
        }
            if(sec.equalsIgnoreCase("Appetizers"))
                System.out.println(menu.getAllAppetizers());
            else if(sec.equalsIgnoreCase("Main"))
                System.out.println(menu.getAllMain());
            else if(sec.equalsIgnoreCase("Drinks"))
                       System.out.println(menu.getAllDrinks());
         
        System.out.println("To Order,Enter the item ID to the right of item's name. "+"\n "
       );
        String itemID=read.next().toUpperCase();
        
        while(!itemID.equalsIgnoreCase("f0")){
        char itemSec=itemID.charAt(0);
        while(!(itemSec=='A'||itemSec=='M'||itemSec=='D'))
        {   System.out.println("InValid Input Please Enter Again");
        itemID=read.next().toUpperCase();
       itemSec=itemID.charAt(0);
        }
        Integer num=Integer.parseInt(itemID.substring(1, itemID.length()));
//        while(!(num>menu.appetizers.size()||num>menu.drinks.size()||num>menu.main.size())){
//      itemSec=itemID.charAt(0);
//        num=Integer.parseInt(itemID.substring(1, itemID.length()));
//        }
//    
    order.incrementNo();
    if(itemSec=='A')
    order.addnewItem(menu.getAppetizer(num-1));
    else if(itemSec=='D'){
      order.addnewItem(menu.getDrink(num-1));
     }
    else if(itemSec=='M'){
      order.addnewItem(menu.getMain(num-1));
     }
            System.out.println("Do you Want to Order something else? [y/N] ");
                
        if(read.next().equalsIgnoreCase("y")){
                   System.out.println("Which Section? {Appetizers} {Main} {Drinks}");
            String sec2=read.next();
        while (!(sec2.equalsIgnoreCase("Appetizers")||sec2.equalsIgnoreCase("Main")||sec2.equalsIgnoreCase("Drinks"))) {            
            System.out.println("Not Valid");
         sec2=read.next();
        }
            if(sec2.equalsIgnoreCase("Appetizers"))
                System.out.println(menu.getAllAppetizers());
            else if(sec2.equalsIgnoreCase("Main"))
                System.out.println(menu.getAllMain());
            else if(sec2.equalsIgnoreCase("Drinks"))
                       System.out.println(menu.getAllDrinks());
           
          System.out.println("To Order,Enter the item ID to the right of item's name. "+"\n "
        +"if you finish Ordering Press F0"+"\n");
         itemID=read.next().toUpperCase();
        }
        else
            break;
                  
        }
    Cashier manager=new Cashier("MOHAMMED", 10, order);
        System.out.println(manager.printrecipt());
    }
   
}
