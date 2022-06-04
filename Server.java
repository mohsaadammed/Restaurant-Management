
package Labors_management;

import java.util.ArrayList;
import resturants_management.Order;


public class Server extends Labor{

String specialty;

    public Server(String name, int Id,String spech) {
        super(name, Id);
        
        this.specialty=spech;
    }


    public String getSpecialty() {
        return specialty;
    }

}
