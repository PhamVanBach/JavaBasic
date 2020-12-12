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
public class tamGiac {
    Scanner sc = new Scanner(System.in);
    protected int soCanh = 0;
    protected int tongSoCanh[];
    public tamGiac() {
        this.soCanh = 3;
        this.tongSoCanh = new int[3];
    }    
    //geter/seter
    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getTongSoCanh() {
        return tongSoCanh;
    }

    public void setTongSoCanh(int[] tongSoCanh) {
        this.tongSoCanh = tongSoCanh;
    }
    //Nhap
    public void Nhap()
    {
        do{
            System.out.println("Nhap 3 canh tam giac: ");
            for (int i = 0; i < 3; i++) {
                System.out.println("nhap canh thu " + (i+1) +":");
                this.tongSoCanh[i] = sc.nextInt();
            }
        }while(tongSoCanh[0] + tongSoCanh[1] <= tongSoCanh[2] || tongSoCanh[0] + tongSoCanh[2] <= tongSoCanh[1] || tongSoCanh[2] + tongSoCanh[1] <= tongSoCanh[0]);
    }
    public int tinhCV(){
        int cv = 0;    
        for(int i = 0; i < 3; i++){
            cv += this.tongSoCanh[i];
        }
        return cv;
    }
    public Double tinhDienTich(){
        int A,B,C;
        double dienTich = 0;
        A = this.tongSoCanh[0];
        B = this.tongSoCanh[1];
        C = this.tongSoCanh[2];
        double P = (A+B+C)/2;
        dienTich = Math.sqrt(P*(P-A)*(P-B)*(P-C));
        return dienTich;
    }
    
}

