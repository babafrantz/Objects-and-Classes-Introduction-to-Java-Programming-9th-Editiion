/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class RegularPolygon {
    
    public final static double Y = 0;
    public final static double X = 0;
   
    private int n = 3;
    private double side=1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        
    }
    public RegularPolygon(int N, double Side,double x, double y){
        this.n=N;
        this.side=Side;
        this.x=x;
        this.y=y;
        
    }
    
    public RegularPolygon(int N, double Side){
        
        this(N,Side,X,Y);
       
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(){
        return n*side;
        
    }
    
    public double getArea(){
        
        return ((n*(side*side))/(4 * Math.tan(3.142/n)));
        
    }
    
    
    
    
    
}
