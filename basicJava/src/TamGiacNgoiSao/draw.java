/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TamGiacNgoiSao;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class draw {
    //main method

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n > 0: ");
        n = sc.nextInt();
        Hinh1(n);
        Hinh2(n);
        Hinh3(n);
        Hinh4(n);
        Hinh5(n);
    }
    
    public static void Hinh1(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                // 
                if (i == j || j == 1 | i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
    
    public static void Hinh2(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= 1; j--) {
                if (i == j || i == n | j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void Hinh3(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= 1; j--) {
                if (i == j || j == n || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void Hinh4(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j || i == 1|| j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void Hinh5(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == j || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
