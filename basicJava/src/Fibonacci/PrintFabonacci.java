/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class PrintFabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n số đầu tiên của dãy số fibonacci: ");
        int n = sc.nextInt();
        System.out.println(n + " số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Calfibonacci(i) + " ");
        }
    }
     
    public static int Calfibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return Calfibonacci(n - 1) + Calfibonacci(n - 2);
        }
    } 
}
