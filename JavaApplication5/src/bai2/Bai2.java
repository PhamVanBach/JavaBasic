/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class Bai2 {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ListInfo lstInfo = new ListInfo();
        
        int keyPress;
        do {
            System.out.println("\n----- Chuong trinh doc chuoi -----");
            System.out.println("\n1. Khoi tao chuoi nhanh");
            System.out.println("2. Them chuoi");
            System.out.println("3. Hien thi cac chuoi");
            System.out.println("0. Exit");
            System.out.print("--->");
            keyPress = scan.nextInt();
            
            switch (keyPress) {
                case 1:
                    lstInfo.inputInfo(1);
                    break;
                case 2:
                    lstInfo.inputInfo(2);
                case 3:
                    lstInfo.xuat();
            }
        } while (keyPress != 0);
        
    }
}
