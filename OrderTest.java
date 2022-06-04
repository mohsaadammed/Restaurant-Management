/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturants_management;

import Labors_management.Server;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohammed
 */
public class OrderTest {
   static ArrayList<Server> servers=new ArrayList<>();
        
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
  /*      servers.add(new Server("Mohammed Saad", 1,"Drinks"));
         servers.add(new Server("Yasser", 2,"MA"));
        servers.add(new Server("Walled", 3,"MA"));
        servers.add(new Server("Rayan", 4,"Drinks"));
        servers.add(new Server("Khalid", 5,"MA"));
       */
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        servers.removeAll(servers);
    }

  
    /**
     * Test of placeServer method, of class Order.
     */
    //     path 1
    @Test
    public void Mohmmed_NoServer() {
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(1);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
    }
    //     path 2
     @Test
    public void Mohmmed_NoServer2() {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(1);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
    }
    //     path 3
     @Test
     public void Mohmmed_Name() {
         servers.add(new Server("Mohammed Saad", 1,"Drinks"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(1);
        String expResult = "Mohammed Saad";
        String result = instance.placeServer();
        assertEquals(expResult, result);
    }
     //     path 4
    
      @Test
    public void Yasser_NoServer() {
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(2);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
    //     path 5
        @Test
     public void Yasser_NoServer2() {
         servers.add(new Server("Mohammed Saad", 0,"Drinks"));
          servers.add(new Server("Yasser", 0,"MA"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(2);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
    
}
//     path 6
     @Test
      public void Yasser_Name() {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 2,"MA"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(2);
        String expResult = "Yasser";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}

//     path 7
     @Test
      public void Walled_NoSever() {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 3,"MA"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(2);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
//     path 8
     @Test
      public void Walled_NoSever2() {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 4,"MA"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
//     path 9
     @Test
      public void Walled_Name() {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 3,"MA"));
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "Walled";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
//     path 10
     @Test
      public void Rayan_NoServer () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
            servers.add(new Server("Rayan", 4,"Drinks"));
            
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}

//     path 11
     @Test
      public void Rayan_NoServer2 () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
         servers.add(new Server("Rayan", 3,"Drinks"));
            
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(4);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
//     path 12
     @Test
      public void Rayan_Name () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
            servers.add(new Server("Rayan", 3,"Drinks"));
            
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "Rayan";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}

//     path 13
     @Test
      public void Khalid_NoServer () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
            servers.add(new Server("Rayan", 4,"Drinks"));
             servers.add(new Server("Khalid", 5,"MA"));
             
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
//     path 14
     @Test
      public void Khalid_NoServer2 () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
            servers.add(new Server("Rayan", 2,"Drinks"));
             servers.add(new Server("Khalid", 5,"MA"));
             
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(3);
        String expResult = "No Server";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}
      //     path 15
     @Test
      public void Khalid_Name () {
        servers.add(new Server("Mohammed Saad", 0,"Drinks"));
        servers.add(new Server("Yasser", 1,"MA"));
         servers.add(new Server("Walled", 2,"MA"));
            servers.add(new Server("Rayan", 2,"Drinks"));
             servers.add(new Server("Khalid", 5,"MA"));
             
        System.out.println("placeServer");
        Order instance = new Order(servers);
        instance.setNum(5);
        String expResult = "Khalid";
        String result = instance.placeServer();
        assertEquals(expResult, result);
}








}