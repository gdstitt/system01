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
        Properties p = new Properties(System.getProperties());
        
        for(int count = 0; count < p.size(); count++) {
            System.out.println("Value number " + (count + 1));
        }
    }
    
}
