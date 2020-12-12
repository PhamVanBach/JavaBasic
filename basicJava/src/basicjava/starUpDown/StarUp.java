/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava.starUpDown;

/**
 *
 * @author bachp
 */
public class StarUp {
    public static void main(String[] args) {
//        variable
        int soNgoiSao = 12;
        int i, j;
        for(i = 0; i < soNgoiSao; i++){
           for(j = 0; j < i; j++){
               System.out.print("*");
           }
            System.out.println(" ");
        }
    }
}
