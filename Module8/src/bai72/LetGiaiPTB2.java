/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai72;

/**
 *
 * @author bachp
 */
public class LetGiaiPTB2 {
    private float a,b,c;

    public LetGiaiPTB2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String GPTB2(){
        String nghiem = "";
        if(a == 0){
            nghiem = "Phuong trinh co 1 nghiem duy nhat: " + (-b/a); 
        }
        else{
            float denta = b*b - 4*a*c;
            if(denta > 0){
                nghiem = "X1 = " + (-b + Math.sqrt(denta)/(2*a) 
                        + "\nX2 = " + (-b - Math.sqrt(denta)/2*a) );
            }
            else if(denta == 0){
               nghiem = "Phuong trinh co 1 nghiem duy nhat: " + (-b/a);  
            }
            else{
                nghiem = "Phuong Trinh Vo Nghiem!!";
            }
        }
        return nghiem;
    }
}
