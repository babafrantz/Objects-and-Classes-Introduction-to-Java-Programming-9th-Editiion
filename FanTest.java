/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class FanTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Creatin an object from the no-arg constructor");
        
        System.out.println("000000000000000000000000000000000000000");
        Fan fan= new Fan();
        System.out.println(fan.toString());
        
        
        System.out.println("Creatin an object from the all-arg constructor");
        
        System.out.println("000000000000000000000000000000000000000");
        
        Fan fan1 = new Fan(Fan.FAST,true,10,"yellow");
        
        System.out.println(fan1.toString());
        
        Fan fan2 = new Fan(Fan.MEDIUM,false,11,"green");
        
        System.out.println(fan2.toString());
        
    }
    
}
