/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TruyenThamSo;

/**
 *
 * @author bachp
 */
public class truyenthamso {
    double square(double x){
        double squareOfNumber = Math.pow(x, 2);
        return squareOfNumber;
    }
    public static void main(String[] args) {
        truyenthamso tts = new truyenthamso();
        System.out.println(tts.square(3.5));
    }
}
