/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai61;

/**
 *
 * @author bachp
 */
public class b61main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(div(10, 0));          
        }catch(ArithmeticException e){
            System.err.println("Loi chia cho 0!");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    static int div(int a, int b) throws ArithmeticException{
        String s = "Loi chia cho 0";
        if(b == 0){            
            throw new ArithmeticException(s);
        }
        else{
            return a/b;
        }
    }
}
