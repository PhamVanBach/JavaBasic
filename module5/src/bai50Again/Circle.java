/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai50Again;

/**
 *
 * @author bachp
 */
public class Circle {
    private int radius;
    double pi = Math.PI;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return pi*radius*radius;
    }
    
    @Override
    public String toString() {
        return "Circle co ban kinh = " + this.radius + "\nDien Tich la: " + this.getArea(); //To change body of generated methods, choose Tools | Templates.
    }
}
