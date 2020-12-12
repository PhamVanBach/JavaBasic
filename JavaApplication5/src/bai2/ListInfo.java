/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class ListInfo {
    Scanner scan = new Scanner(System.in);
    ArrayList<Info> listInfo = new ArrayList<>();
    int maxSize = 25;

    public void inputInfo(int x) {

        // Khoi tao chuoi nhanh
        if (x == 1) {
            if (listInfo.size() > 25) {
                System.out.println("Khong them duoc");
            } else {
                listInfo.add(new Info("Thanh    Long    75641"));
                listInfo.add(new Info("Lan  Tine    26131"));
                listInfo.add(new Info("Dong Lao 99999"));
                listInfo.add(new Info("Mai  Xinh    323141"));
                listInfo.add(new Info("Ngoc Long   23101"));
            }
        } else if (x == 2) {
            if (listInfo.size() > 25) {
                System.out.println("Khong them duoc");
            } else {
                Info temp = new Info();
                temp.nhap();
                listInfo.add(temp);
            }
        }
    }

    public void xuat() {
        System.out.println("\n---------------------------------------------");
        System.out.println("Xuat du lieu");
        // Xuat du lieu
        System.out.println("Ten\tHo\tMa Buu Dien");
        for (Info temp : listInfo) {
            System.out.println(temp);
        }
    }
}
