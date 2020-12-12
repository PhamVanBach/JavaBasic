/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai62;

/**
 *
 * @author bachp
 */
public class mainkiemtra {
    
    public static void main(String[] args) {
        testcase tsc = new testcase();
        try {
            tsc.div(10, 5);
        }catch(ArithmeticException e){
            System.err.println("a va b phai khac 0!");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
