/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageTwoThreeNumber;

/**
 *
 * @author bachp
 */
public class Average {
    //main method
    public static void main(String[] args) {
      Average sr = new Average();
        System.out.println(sr.AverageRange(2, 5));
        System.out.println(sr.AverageRange(2, 5, 6));
    }
    //method for cal sum of number
    float AverageRange(int a, int b){
        return (float)(a+b)/2;
    }   
    float AverageRange(int a, int b, int c){
        return (float)(a+b+c)/2;
    }  
}
