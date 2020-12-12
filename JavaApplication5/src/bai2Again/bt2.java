/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2Again;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class bt2 {
    public static void main(String[] args) {
        
        ListInfo lstInfo = new ListInfo();
        Scanner sc = new Scanner(System.in);
        int keyPress = 0;

        do{
            System.out.println("\n--------Chuong Trinh Doc Chuoi---------");
            System.out.println("\n1. Khoi Tao Nhanh");
            System.out.println("2.Them Chuoi");
            System.out.println("3.Hien Thi Cac Chuoi");
            System.out.println("0.Exit");
            System.out.println("-->your choise: ");
            keyPress = sc.nextInt();
            
            switch(keyPress){
                case 1:
                    lstInfo.inputInfo(1);
                    break;
                case 2: 
                    lstInfo.inputInfo(2);
                case 3:
                    lstInfo.xuat();
            }
        }while(keyPress != 0);
    }
}
