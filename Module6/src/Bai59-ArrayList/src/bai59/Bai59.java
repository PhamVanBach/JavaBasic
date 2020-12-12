/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai59;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
//class array{
//    ArrayList<HinhVuong>arr= new ArrayList<>();
//    HinhVuong hv= new HinhVuong();
//    
//    public void nhap(){
//        hv.setCanh(3);
//        arr.add(hv);
//    }
//    public void xuat(){
//        System.out.println(arr.get(0).toString());
//    }
//}
public class Bai59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
//        array ar  =  new array();
//        ar.nhap();
//        ar.xuat();
        
        
        ArrayList<HinhVuong> hv = new ArrayList<>();
        hv.add(new HinhVuong(3));
        
        for(HinhVuong a : hv ){
            System.out.println(a);
        }
       
//        showList(hv);
    }
    
     public static void showList(ArrayList<HinhVuong> list) {
        // Show list through for-each
        for (HinhVuong obj : list) {
            System.out.println("chu vi  "+obj.chuVI());
            System.out.println("dien tich  "+obj.dienTich());
            System.out.print("" + obj + ",");
        }
        System.out.println();
    }
    
}
