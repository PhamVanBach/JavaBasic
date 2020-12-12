/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai59;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat {
    protected int chieuDai, chieuRong;


    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong, double chuVi, double dienTich) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }
    
    public double tinhChuVi(){
        
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        return "Bai59{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong;
    }
    
    
}
