/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class RegularPolygonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("00000000000000000000000000000000");
        
        RegularPolygon regpoly = new  RegularPolygon();
        
        System.out.println(regpoly.toString());
        
        System.out.println(regpoly.getPerimeter());
        System.out.println(regpoly.getArea());
        
        
        System.out.println("00000000000000000000000000000000");
        
        RegularPolygon regpoly1 = new  RegularPolygon(6,4);
        
        System.out.println(regpoly1.toString());
        
        System.out.println(regpoly1.getPerimeter());
        System.out.println(regpoly1.getArea());
        
        System.out.println("00000000000000000000000000000000");
        
        RegularPolygon regpoly2 = new  RegularPolygon(10,4,5.6,7.8);
        
        System.out.println(regpoly2.toString());
        
        System.out.println(regpoly2.getPerimeter());
        System.out.println(regpoly2.getArea());
        
        
        
    }
    
}
