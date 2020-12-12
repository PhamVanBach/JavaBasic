/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava.tinhTheTichHinhCau;
import  java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author bachp
 */
public class theTichHinhCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.####"); 
        System.out.println("Nhap vao ban kinh(r): ");
        double banKinh = sc.nextInt();
        double pi = Math.PI;
        //4/3*pi*r^3
        double theTich = (double)4/3*pi*Math.pow(banKinh, 3);
        double dienTichBeMat = (double)4*pi*Math.pow(banKinh, 2);
        System.out.println(df.format(theTich));
        System.out.println(df.format(dienTichBeMat));
//        System.out.println(Math.PI*Math.pow(banKinh , 3));
//        System.out.println(4/3);
    }
}
