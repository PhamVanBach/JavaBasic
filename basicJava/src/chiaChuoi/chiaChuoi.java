/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiaChuoi;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class chiaChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word;
        System.out.println("Nhap chuoi muon nhap: ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            word = str.charAt(i);
            System.out.println(word);
        }
    }
}
