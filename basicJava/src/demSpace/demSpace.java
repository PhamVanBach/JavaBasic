/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demSpace;

import java.util.Scanner;
import layChuoi.laychuoi;

/**
 *
 * @author bachp
 */
public class demSpace {
    void NhapVaLayChuoi(){
        //this is variable
        Scanner sc = new Scanner(System.in);
        int count = 0;
        //Do Work
        System.out.println("Nhap vao chuoi: ");
        String chuoi = sc.nextLine();
        char[] arrayChar = chuoi.toCharArray();
        for(char c:arrayChar){
            if(c == ' ') count ++;       
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        demSpace lc = new demSpace();
        lc.NhapVaLayChuoi();
    }
}
