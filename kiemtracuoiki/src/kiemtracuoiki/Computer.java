/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class Computer{
    tienXuly txl = new tienXuly();
    private static int SO_HIEU = 1000;
    private int soHieu, namNhap;
    private String ten, xuatXu, cauHinh;
    Scanner sc = new Scanner(System.in);
    
    //---------constructor-----------//
    public Computer() {
        SO_HIEU ++;
        this.soHieu = SO_HIEU;
    }

    public Computer(String t, String xx, int nn,  String ch) {
        SO_HIEU ++;
        this.soHieu = SO_HIEU;
        this.namNhap = nn;
        this.ten = t;
        this.xuatXu = xx;
        this.cauHinh = ch;
    }
    //-----------getset--------//
    public int getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(int soHieu) {
        this.soHieu = soHieu;
    }

    public int getNamNhap() {
        return namNhap;
    }

    public void setNamNhap(int namNhap) {
        this.namNhap = namNhap;
    }

    public String getTen() {
        return ten;
    }

    public boolean setTen(String ten) {
        if(!ten.isEmpty()){
            this.ten = ten;
            return true; 
        }
        else{
            System.out.println("Nhap lai ten");
            return false;
        }
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public boolean setXuatXu(String xuatXu) {
        if(!xuatXu.isEmpty()){
            this.xuatXu = xuatXu;
            return true; 
        }
        else{
            System.out.println("Nhap lai Xuat Xu");
            return false;
        }
    }

    public String getCauHinh() {
        return cauHinh;
    }

    public boolean setCauHinh(String cauHinh) {
        if(!cauHinh.isEmpty()){
            this.cauHinh = cauHinh;
            return true; 
        }
        else{
            System.out.println("Nhap lai Cau Hinh");
            return false;
        }
    }

//-----------tostring-------//
    @Override
    public String toString() {
        return "Computer{" + "soHieu=" + soHieu + ", namNhap=" + namNhap + ", ten=" + ten + ", xuatXu=" + xuatXu + ", cauHinh=" + cauHinh + '}';
    }
    
}