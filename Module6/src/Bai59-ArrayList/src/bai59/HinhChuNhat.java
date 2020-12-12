/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai59;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat {
    protected int chieuDai ,chieurong;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieurong() {
        return chieurong;
    }

    public void setChieurong(int chieurong) {
        this.chieurong = chieurong;
    }

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieurong) {
        this.chieuDai = chieuDai;
        this.chieurong = chieurong;
    }

    @Override
    public String toString() {
        return  "chieuDai= " + chieuDai + ", chieurong= " + chieurong+" chuvi "+chuVI()+" dien tich "+dienTich() ;
    }
    
    
    public int chuVI (){
        return (chieuDai+chieurong)*2;
    }
    
    public int dienTich(){
        return  chieuDai*chieurong;
    }
    
}
