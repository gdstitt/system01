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
        
        
        System.out.println("\n\n\nNOTE: even though the size() function returns zero for p,\n" +
                "the list() function will return properties provided as defaults by\n" +
                "the constructor's calling of System.getProperties()\n");
        p.list(System.out);
        
        
        String ls = System.lineSeparator();
        System.out.println("The System line separator length is: "+ ls.length());
        switch (ls.length()) {
            case 1: 
                System.out.println("Unix system");
                if (ls.contains( "\n")) {
                    System.out.println("Line separator is \"\\n\"");
                } else {
                    System.out.println("The line separator has unexpected contents");
                }
                break;
            case 2:
                System.out.println("Windows System");
                if (ls.contains( "\r\n")) {
                    System.out.println("Line separator is \"\\r\\n\"");
                } else {
                    System.out.println("The line separator has unexpected contents");
                }
                break;
            default:
                System.out.println("Ooops - I haven't got that right!");
        }
        
        
        String userName = p.getProperty("");
        System.out.println("The username is: " + userName);
        
    }
    
}
