/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai50Again;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class Main {
    public static void main(String[] args) {
        CircleCollection circlcl = new CircleCollection();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n;
        
        do {            
            System.out.println("Nhap lua chon cua ban: ");
            System.out.println("0.Them ngau nhien n hinh tron");
            System.out.println("1.Them 1 hinh tron");
            System.out.println("2.Tong so luong hinh tron");
            System.out.println("3.Nhap hinh tron tai vi tri thu:");
            System.out.println("4.Tong dien tich hinh tron:");
            System.out.println("5.dien tich hinh tron max:");
            System.out.println("6.Hinh tron co dien tich hinh tron min:");
            System.out.println("7.Xuat cac hinh tron trong mang");
            System.out.print("-->");
            n = sc.nextInt();
            switch(n){
                case 0: 
                    circlcl.randomCircle();
                    break;
                case 1:
                    circlcl.addCircle();
                    break;
                case 2:
                    System.out.println(circlcl.getSizeOfCircle());
                    break;
                case 3:
                    System.out.println("Nhap vao vi tri muon lay hinh tron trong mang");
                    int position1 = sc.nextInt();
                    circlcl.getCircleAt(position1);
                    System.out.println("Nhap vao vi tri muon gan hinh tron trong mang");
                    int position2 = sc.nextInt();
                    Circle temp = circlcl.getCircleAt(position2);
                    circlcl.setCircleToArr(circlcl.getCircleAt(position1),position2);
                    circlcl.setCircleToArr(temp,position1);
                    break;
                case 4: 
                    System.out.println("tong dien tich hinh tron la : "+circlcl.SumOfAreaCircle());
                    break;
                case 5:
                    circlcl.MaxAreaValue();
                    break;
                case 6:
                    circlcl.MinCircleValue();
                    break;
                case 7:
                    circlcl.outputArr();
                    break;    
                default:
                    flag = false;
                    System.out.println("Bye");
                    break;
            }
            
        } while (flag);
    }
}
