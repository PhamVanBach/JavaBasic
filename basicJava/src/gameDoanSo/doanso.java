/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameDoanSo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class doanso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 5;

        while (true){
            Random rd = new Random();
            int numOfDev = rd.nextInt(6);
//            System.out.println(numOfDev);
            System.out.println("Nhap so ban muon chon");
            int numOfYourChoise = sc.nextInt();
            if(numOfYourChoise == numOfDev){
                point++;
                System.out.println("correct");
            }       
            else{
                point--;
                System.out.println("fail");
            }
            if(point == 10){
                System.out.println("you won");
                break;
            }
            if(point == 0){
                System.out.println("you lose");
                break;
            }     
        }
    }
}
