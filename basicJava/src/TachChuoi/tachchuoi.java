/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TachChuoi;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class tachchuoi {
    void NhapVaTachChuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi muon tach: ");
        String chuoiChuaTach = sc.nextLine();
        String[] arrOfChuoi = chuoiChuaTach.split("\\s");
        for(String c:arrOfChuoi){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        tachchuoi tc = new tachchuoi();
        tc.NhapVaTachChuoi();
    }
}
