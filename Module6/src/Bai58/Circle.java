/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai58;

/**
 *
 * @author Administrator
 */
public class Circle extends Point {

    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return (double) this.radius * 2;
    }

    public double getCircleference() {
        return (double)Math.round((2 * 3.14 * this.radius)*100)/100 ;
    }

    public double getArea() {
        return (double)Math.round((this.radius * 3.14 * this.radius)*100)/100 ;
    }

    @Override
    public String toString() {
        return super.toString() + "Hình tròn: " + "\nBán kính: " + radius + "\nĐường kính: " + getDiameter() 
                                + "\nChu vi: " + getCircleference() + "\nDiện tích: " + getArea()+ "\n";
    }

}
