/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumRange;

/**
 *
 * @author bachp
 */
public class SumRange {
    //main method
    public static void main(String[] args) {
      SumRange sr = new SumRange();
        System.out.println(sr.sumRange(2, 5));
    }
    //method for cal sum of number
    int sumRange(int a, int b){
        int sum = 0;
        if(a > b){
            return 0;
        }
        else{
            for(int i = a; i <= b; i++){
                sum += i;
            }
            return sum;
        }
    }
}
