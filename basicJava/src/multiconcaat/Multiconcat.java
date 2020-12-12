/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiconcaat;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class Multiconcat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String str;

        System.out.print("Nhap mot chuoi bat ky: ");
        str = sc.nextLine();
        System.out.print("Nhap so lan ghep chuoi: ");
        n = sc.nextInt();

        System.out.println(multiConcat(str, n));
        System.out.println("\n");
    }  
    
    public static String multiConcat(String str, int n) {
        if(n < 2) {
            return str;
        } else {
            String str2 = "";
            for(int i = 0; i < n; i++) {
                str2 += str;
            }
            return str2;
        }
    }
}
