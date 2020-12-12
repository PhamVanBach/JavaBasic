/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai59;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        int canh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a: ");
        canh = sc.nextInt();
        HinhVuong hv = new HinhVuong(canh);
        
        System.out.println("Chu vi hình vuông cạnh "+ canh + " là: " + hv.tinhChuVi());
        System.out.println("Diện tích hình vuông cạnh "+ canh + "là : " + hv.tinhDienTich());
    }
}
