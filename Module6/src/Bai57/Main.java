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
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car.drive();
        
        Car p = new Car(2, 4);
        p.drive();
    }
}
