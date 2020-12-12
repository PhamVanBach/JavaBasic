/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaiPhuongTrinhBac2;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class phuongtrinhbac2 {
    public static void main(String[] args) {
        phuongtrinhbac2 ptb2 = new phuongtrinhbac2();
        ptb2.GiaiPTBac2();
    }
    
    //write method to: giai phuong trinh bac 2
    float CalDelta(float a, float b, float c){
        float delta = (float) (Math.pow(b, 2) - (4*a*c));
        return delta;
    }
    public static void GiaiPTBac2(){
        phuongtrinhbac2 ptb2 = new phuongtrinhbac2();
        float a, b, c, x1, x2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = sc.nextFloat();sc.nextLine();
        System.out.println("Nhap he so b: ");
        b = sc.nextFloat();sc.nextLine();
        System.out.println("Nhap he so c: ");
        c = sc.nextFloat();
        
        float delta = ptb2.CalDelta(a, b, c);
        float sqrtOfDelta = (float) Math.sqrt(delta);
        if(delta < 0){
            System.out.println("Phuong Trinh Vo Nghiem");
        }
        if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep : " + (-b / 2*a));
        }
        if (delta > 0){
            x1 = (float)((-b + sqrtOfDelta) / (2*a));
            x2 = (float)((-b - sqrtOfDelta) / (2*a));
            System.out.println("Phuong Trinh Co 2 Nghiem" + " x1 = " + x1 + ", x2 = " + x2);
        } 
    }
}
