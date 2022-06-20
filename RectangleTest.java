/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class RectangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle rec1 = new Rectangle (4,40);
        
        Rectangle rec2 = new Rectangle (3.5, 35.9);
        
        Rectangle rec3 = new Rectangle();
        
        System.out.println("The first Rectangle is " + rec1);
        
        System.out.println("The second Rectangle is " + rec2);
        
        System.out.println("The Third Rectangle is " + rec3);
        
       
        System.out.println("The area of first rectangle " + rec1.getWidth()+ " and " +rec1.getHeight()+ " and the area is " + rec1.getArea()
        +" and Perimeter is " + rec1.getPerimeter() );
        
        System.out.println("The area of second rectangle " + rec2.getWidth()+ " and " +rec2.getHeight()+ " and the area is " + rec2.getArea()
        + " and Perimeter is " +rec2.getPerimeter());
    }
    
}
