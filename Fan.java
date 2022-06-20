/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class Fan {
    
    public final static int  SLOW=1;
    public final static int MEDIUM =2;
    public final static int FAST=3;
    
    private int speed = Fan.SLOW;
    private boolean on =false;
    private double radius=5;
    private String color ="blue";
    
    
    public Fan(){
        
    }
    
    public Fan(int Speed, boolean On, double Radius, String Color){
        this.speed=Speed;
        this.on=On;
        this.radius=Radius;
        this.color=Color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
       
        if(on == true){
            return "Fan{" + "speed=" + speed + ", radius=" + radius + ", color=" + color + '}';
            
        }
        
        else if (on==false){
            
            return "Fan{" + "radius=" + radius + ", color=" + color + '}';
            
        
    }
        return null;
    
}
}
