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
public class Rectangle extends Shape{
    private int chieuDai;
    private int chieuRong;

    public Rectangle() {
        super();
    }

    public Rectangle(int dai, int rong) {
        if(dai >= 1 && dai <= 15){
            this.chieuDai = dai;
        }else{
            System.out.println("Chieu Dai Nam Ngoai Khoang [1, 15], Mac Dinh La 0");
            this.chieuDai = 0;
        }
        if(rong >= 1 && rong <= 15){
            this.chieuRong = rong;
        }else{
            System.out.println("Chieu Rong Nam Ngoai Khoang [1, 15], Mac Dinh La 0");
            this.chieuRong = 0;
        }
        
    }

    @Override
    public void draw() {
        super.draw();//To change body of generated methods, choose Tools | Templates.
        for(int rong = 0; rong < chieuRong; rong++){
            for(int dai = 0; dai < chieuDai; dai++){
                if(rong == 0 || rong == chieuRong - 1 || dai == 0 || dai == chieuDai - 1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }  
    
    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int dai) {
        if(dai >= 1 && dai <= 15){
            this.chieuDai = dai;
        }else{
            System.out.println("Chieu Dai Nam Ngoai Khoang [1, 15], Mac Dinh La 0");
            this.chieuDai = 0;
        }
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int rong) {
        if(rong >= 1 && rong <= 15){
            this.chieuRong = rong;
        }else{
            System.out.println("Chieu Rong Nam Ngoai Khoang [1, 15], Mac Dinh La 0");
            this.chieuRong = 0;
        }
    }
    
    
}
