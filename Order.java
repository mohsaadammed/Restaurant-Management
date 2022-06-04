/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturants_management;

import java.util.ArrayList;
import java.util.Random;

import Labors_management.Server;

/**
 *
 * @author Mohammed
 */
public class Order {

    int order_ID;
    public ArrayList<Item> items = new ArrayList<Item>();
    private static int orderNo = 0;
    Server s;
    ArrayList<Server> servers;

    public Order(ArrayList<Server> s) {
        servers = s;
    }

    public Server getS() {
        return s;
    }

    public void setS(Server s) {
        this.s = s;
    }

    public void addnewItem(Item i) {
        items.add(i);
    }

    public Item getItem(int i) {
        return items.get(i);
    }
    //  Random r = new Random();
        int num;
                //= r.nextInt(5) + 1;

    public void setNum(int num) {
        this.num = num;
    }
       
    public String placeServer() {
       switch (num) {
            case 1: {
                for (int i = 0; i < servers.size(); i++) {
                    if (servers.get(i).getId() == 1) {
                        this.setS(servers.get(i));
                      return this.getS().getName();
                    }
                }
            }
            ;
            break;
            case 2: {
                for (int i = 0; i < servers.size(); i++) {
                    if (servers.get(i).getId() == 2) {
                        this.setS(servers.get(i));
                         return this.getS().getName();
                    }
                }
            }
            ;
            break;
            case 3: {
                for (int i = 0; i < servers.size(); i++) {
                    if (servers.get(i).getId() == 3) {
                        this.setS(servers.get(i));
                          return this.getS().getName();
                    }
                }
            }
            ;
            break;
            case 4: {
                for (int i = 0; i < servers.size(); i++) {
                    if (servers.get(i).getId() == 4) {
                        this.setS(servers.get(i));
                          return this.getS().getName();
                    }
                }
            }
            ;
            break;
            case 5: {
                for (int i = 0; i < servers.size(); i++) {
                    if (servers.get(i).getId() == 5) {
                        this.setS(servers.get(i));
                         return this.getS().getName();
                    }
                }
            }
            ;
            break;
        }
        return "No Server";

    }

    public static int getOrderNo() {
        return orderNo;
    }

    public void incrementNo() {
        orderNo++;
    }

    public int getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < items.size(); i++) {
            s += items.get(i).toString() + "\n";
        }
        return s; //To change body of generated methods, choose Tools | Templates.
    }

}
