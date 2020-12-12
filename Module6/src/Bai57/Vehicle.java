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
public class Vehicle {

    protected int numOfWheels;

    public Vehicle() {
    }
    
    public Vehicle(int x) {
        numOfWheels = x;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
    
    public static void drive() {
        System.out.println("Driving a vehicle");
    } 

    @Override
    public String toString() {
        return "Vehicle: " + "numOfWheels = " + numOfWheels + '}';
    }
    
}
