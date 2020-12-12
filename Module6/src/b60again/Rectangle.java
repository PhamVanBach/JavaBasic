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
public class Rectangle extends Shape{
    private int chieuDai, chieuRong;

    public Rectangle() {
    }

    public Rectangle(int cd, int cr) {
        if(cd > 15 || cd < 1){
            System.out.println("chieu dai phai nam trong khoang [1, 15]");
            return;
        }
        if(cd < cr){
            System.out.println("Chieu dai phai lon hon chieu rong");
            return;
        }
        
        this.chieuDai = cd;
        this.chieuRong = cr;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        if(chieuRong > 15 || chieuRong < 1){
            System.out.println("chieu rong phai nam trong khoang [1, 15]");
            return;
        }
        this.chieuRong = chieuRong;
    }
    
    public void draw(){
        for(int i = 1; i <= chieuRong; i++){
            for(int j = 1; j <= chieuDai; j++){
                if((i == 1) || (j == 1) || (i == chieuRong) || (j == chieuDai)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }               
            }
            System.out.println("\n");
        }
    }
}
