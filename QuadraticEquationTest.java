
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class QuadraticEquationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("enter value for a ");
        
        double a = kbd.nextDouble();
        
        System.out.println("enter value for b ");
        
        double b = kbd.nextDouble();
        
        System.out.println("enter value for c ");
        
        double c = kbd.nextDouble();
        
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        
        System.out.println("print first root");
        
        System.out.println(quad.getRoot1());
        
        
         System.out.println("print seconds root");
        
          System.out.println(quad.getRoot2());
        
        
    }
    
}
