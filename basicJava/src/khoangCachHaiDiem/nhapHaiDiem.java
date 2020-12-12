/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoangCachHaiDiem;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class nhapHaiDiem {
    private int x1,x2,y1,y2;
    Scanner sc = new Scanner(System.in);
    //constructor

    public nhapHaiDiem() {
    }
    
    public nhapHaiDiem(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    //geter/seter
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void Nhap(){
        System.out.print("Nhap vao diem x1: "); x1 = sc.nextInt();sc.nextLine();
        System.out.print("Nhap vao diem x2: "); x2 = sc.nextInt();sc.nextLine();
        System.out.print("Nhap vao diem x3: "); y1 = sc.nextInt();sc.nextLine();
        System.out.print("Nhap vao diem x4: "); y2 = sc.nextInt();
    }
    
   public Double tinhKhoangCach(){
       double distance = 0;
       distance = Math.sqrt(Math.pow((x1 - x2),2)+ Math.pow((y1 - y2),2));
       System.out.println(distance);
       return distance;
   }
    
}
