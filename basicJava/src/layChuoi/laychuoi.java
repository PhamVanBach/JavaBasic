package layChuoi;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bachp
 */
public class laychuoi {
    void NhapVaLayChuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String chuoi = sc.nextLine();
        char[] arrayChar = chuoi.toCharArray();
        for(char c:arrayChar){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        laychuoi lc = new laychuoi();
        lc.NhapVaLayChuoi();
    }
}
