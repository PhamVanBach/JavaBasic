/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dienTichTamGiac;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class dienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tamGiac tg = new tamGiac();
        System.out.println("Nhap so tam giac muon nhap: ");
        int x = sc.nextInt();
        for(int i = 0; i < x; i++){
            tg.Nhap();
        }
        int chuVi = tg.tinhCV();
        double dienTich = tg.tinhDienTich();
        System.out.println("chu vi Tam Giac la: " + chuVi + "dien tich tam giac la; " + dienTich);
    }
    
}
