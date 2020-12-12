/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai58;

/**
 *
 * @author Administrator
 */
import java.util.*;

class array{
    Scanner sc =new Scanner(System.in);
    ArrayList<Circle> arr = new ArrayList<>();
    
    public void getArr(){
        Circle cl = new Circle();
        System.out.println("Nhập tọa độ trục hoành: ");
        cl.setX(sc.nextInt());
        System.out.println("Nhập tọa độ trục tung: ");
        cl.setY(sc.nextInt());
        System.out.println("Nhập bán kính: ");
        cl.setRadius(sc.nextDouble());
        arr.add(cl);
    }
    
    public void xuat(){
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, n = 0;
        boolean flag = true;
        array arr = new array();
        
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println("1.Nhập thông tinh hình tròn. \n" +
                    "2.Xuất thông tin hình tròn.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    arr.getArr();
                    break;
                case 2:
                    arr.xuat();
                    break;
                default:
                    System.out.println("GET OUT");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
