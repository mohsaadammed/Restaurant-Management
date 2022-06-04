/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Labors_management;

import java.text.NumberFormat;
import java.util.ArrayList;
import resturants_management.Order;
/**
 *
 * @author Mohammed
 */
public class Cashier extends Labor{

  Order Order;
  
    public Cashier(String name, int Id, Order o) {
        super(name, Id);
        this.Order=o;
    }
    public double getCostOfOrder(){
        double cost=0;
        for (int i = 0; i < Order.items.size(); i++) {
            cost+=Order.getItem(i).getPrice();
        }
        return cost;
    }
    public String printrecipt(){
        String s="---------Resturant----------"+"\n"
                + "Order No:"+Order.getOrderNo()+"\n"
                +"Server's Name "+Order.getS().getName()+"\n"
                +"------------------------------"+"\n"
                +Order.toString()+"\n"+"\n"
                +"------------------------------"+"\n"
                +"Cost:"+getCostOfOrder();
        return s;
        
    }
}
