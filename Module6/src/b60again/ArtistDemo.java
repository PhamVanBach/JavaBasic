/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b60again;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class ArtistDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        
        do {     
            Artist at = new Artist();
            System.out.println("1.Ve hinh chu nhat");
            System.out.println("2.Ve hinh tam giac phai");
            System.out.print("-->");
            n = sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Nhap vao chieu dai: ");
                    int cd = sc.nextInt();
                    System.out.println("Nhap vao chieu rong: ");
                    int cr = sc.nextInt();
                    Shape retangle = new Rectangle(cd, cr);
                    at.drawShape(retangle);
                    break;
                
                case 2:
                    System.out.println("Nhap vao canh vuong: ");
                    int canhV = sc.nextInt();
                    Shape rightTriangle = new RightTriangle(canhV);
                    at.drawShape(rightTriangle);
                    break;
                default:
                    flag = false;
                    System.out.println("Bye");
                    break;
            }
                
            
        } while (flag);
    
    }
}
