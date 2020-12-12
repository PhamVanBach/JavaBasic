/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TruyenThamSo.TestThamSoNguyen;

/**
 *
 * @author bachp
 */
public class test {
    boolean square(int x){
        if(x % 2 == 0){
           return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        test tts = new test();
        System.out.println(tts.square(32));
    }
}
