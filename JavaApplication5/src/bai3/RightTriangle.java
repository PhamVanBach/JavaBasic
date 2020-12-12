/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author bachp
 */
public class RightTriangle extends Shape{
    private int canhVuong;
    
    public RightTriangle(){
        super();
    }
    public RightTriangle(int canhVuong){
        super();
        if(canhVuong >= 1 && canhVuong <= 20){
            this.canhVuong = canhVuong;
        }else{
            System.out.println("Gia tri phai nam trong khoang [1, 20], mac dinh la 0");
            this.canhVuong = 0;
        }
    }

    public int getCanhVuong() {
        return canhVuong;
    }

    public void setCanhVuong(int canhVuong) {
        this.canhVuong = canhVuong;
    }

    @Override
    public void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        for(int i = 0; i < canhVuong; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    
}
