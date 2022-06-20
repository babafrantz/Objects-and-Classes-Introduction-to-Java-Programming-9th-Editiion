/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class QuadraticEquation {

    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public double getDiscriminant(){
        return ((b*b)-(4*a*c));
    }
    
    public double getRoot1(){
        
        if(getDiscriminant()<0){
            return 0;
        }
        else if (getDiscriminant()>0){
            return (((-b) + (Math.sqrt(getDiscriminant())))/2*a);
        }
        else System.out.println("The system has no roots");
        
        return 0;
    }
    
     public double getRoot2(){
        
        if(getDiscriminant()<0){
            return 0;
        }
        else if (getDiscriminant()>0){
            return (((-b) - (Math.sqrt(getDiscriminant())))/2*a);
        }
        
        else System.out.println("The system has no roots");
        
        return 0;
}
}
