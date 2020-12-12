/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Random;

/**
 *
 * @author bachp
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        for(int i = 0; i < 20; i++){
            int randCharLength = rd.nextInt(100);
            for(int j = 0; j < randCharLength; j++){
                System.out.print("-");
            }
            System.out.println("");
        }
    }   
}
