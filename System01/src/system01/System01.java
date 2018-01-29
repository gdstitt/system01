/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system01;

import java.util.Properties;

/**
 *
 * @author Greg
 */
public class System01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.getProperties().list(System.out);
        Properties p = new Properties(System.getProperties());
        
        
        System.out.println("\n\n\nLooking at our newly created property list.\n" +
                "The number of properties in p is " + p.size());
        for(int count = 0; count < p.size(); count++) {
            System.out.println("Value number " + (count + 1));
        }
        
        
        System.out.println("\n\n\nNOTE: even though the size() function returns zero for p," +
                " the list() function\nwill return properties provided as defaults by " +
                "the constructor's calling of System.getProperties()\n");
        p.list(System.out);
    }
    
}
