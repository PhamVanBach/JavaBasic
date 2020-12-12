/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soSanhHaiChuoi;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class soSanhChuoi {
    void NhapVaSoSanhChuoi(){
        Scanner sc = new Scanner(System.in);
        String chuoiSo1, chuoiSo2;
        System.out.println("Nhap chuoi 1");
        chuoiSo1 = sc.nextLine().toLowerCase();
        System.out.println("Nhap chuoi 2");
        chuoiSo2 = sc.nextLine().toLowerCase();
        
        if(chuoiSo1 == null ? chuoiSo2 == null : chuoiSo1.equals(chuoiSo2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        soSanhChuoi ssc = new soSanhChuoi();
        ssc.NhapVaSoSanhChuoi();
    }
}
