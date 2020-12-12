/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai57;

/**
 *
 * @author Administrator
 */
public class Car extends Vehicle{
    private int numOfDoors;

    public Car() {
    }

    public Car(int d, int w) {
        super(w);
        numOfDoors = d;
    }

    public static void drive() {
        System.out.println("Driving a car");
    } 
}
