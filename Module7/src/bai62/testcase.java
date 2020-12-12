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
public class testcase {
    public int div(int a, int b) throws ArithmeticException{
        String s = "a va b phai la so duong";
        if(a<=0 || b <= 0){            
            throw new ArithmeticException(s);
        }
        else
            return a/b;
    }
}
