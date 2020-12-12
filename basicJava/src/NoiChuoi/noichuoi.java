/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoiChuoi;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class noichuoi {
    void NhapVaNoiChuoi(){
        String chuoiGoc,chuoiDaNoi = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi muon noi: ");
        chuoiGoc = sc.nextLine();
        int n;
        System.out.println("Nhap vao so lan lap: ");
        n = sc.nextInt();sc.nextLine();
        if(n < 2){
            System.out.println(chuoiGoc);
        }
        else{
            for (int i = 0; i < n; i++) {
                chuoiDaNoi += chuoiGoc;
            }
            System.out.println(chuoiDaNoi);
        }
    }
    
    public static void main(String[] args) {
        noichuoi nc = new noichuoi();
        nc.NhapVaNoiChuoi();
    }
}
