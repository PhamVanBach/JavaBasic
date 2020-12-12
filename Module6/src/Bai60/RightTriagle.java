/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai60;

/**
 *
 * @author Administrator
 */
public class RightTriagle extends Shape {
    private int canhVuong, n;
 
    public RightTriagle() {
        super();
    }
 
    public RightTriagle(int canhVuong) {
        super();
        if ((canhVuong < 1) || (canhVuong > 20)) {
            System.out.println("Giá trị của cạnh phải nằm trong khoảng [1...20]");
            return;
        }
        this.canhVuong = canhVuong;
    }
 
    public int getCanhVuong() {
        return canhVuong;
    }
 
    public void setCanhVuong(int canhVuong) {
        this.canhVuong = canhVuong;
    }
     
    public void draw() {
        n = canhVuong;
        for (int i = 1; i <= canhVuong; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
    }
}
