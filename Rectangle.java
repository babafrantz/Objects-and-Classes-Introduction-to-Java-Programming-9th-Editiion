/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yomol
 */
public class Rectangle {
    
    public static final double DEFAULT_WIDTH = 1;
    public static final double DEFAULT_HEIGHT = 1;
    
    private double width ;
    private double height ;

    public Rectangle() {
    }
    
    public Rectangle(double Width, double Height){
        
        this.width=Width;
        this.height=Height;
      
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return getWidth()*getHeight();
    }
    public double getPerimeter(){
        return getWidth()*2 + getHeight()*2;
        
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        return true;
    }
    
    
}
