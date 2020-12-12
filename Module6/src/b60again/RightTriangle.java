/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b60again;

/**
 *
 * @author bachp
 */
public class RightTriangle extends Shape{
    private int canhVuong;

    public RightTriangle() {
    }

    public RightTriangle(int canhVuong) {
        this.canhVuong = canhVuong;
    }

    public int getCanhVuong() {
        return canhVuong;
    }

    public void setCanhVuong(int canhVuong) {
        this.canhVuong = canhVuong;
    }
    
    public void draw(){
        for(int i = 0; i <= canhVuong; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
