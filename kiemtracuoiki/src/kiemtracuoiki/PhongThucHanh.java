/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class PhongThucHanh {
    tienXuly txl = new tienXuly();
    private static int MA_PHONG = 10000;
    private int maPhong, soMay;
    private String tenPhong;
    Scanner sc = new Scanner(System.in);
   
    public PhongThucHanh() {
    }
    
    public PhongThucHanh(int mp ,String tp ,int sm) {
        int sum = mp + MA_PHONG;
        this.maPhong = sum;
        this.soMay = sm;
        this.tenPhong = tp;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public boolean setTenPhong(String tenPhong) {
        if(!tenPhong.isEmpty()){
            this.tenPhong = tenPhong;
            return true; 
        }
        else{
            System.out.println("Nhap lai ten phong");
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "PhongThucHanh{" + "maPhong=" + maPhong + ", soMay=" + soMay + ", tenPhong=" + tenPhong + '}';
    }
    
}
