/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterTester;

/**
 *
 * @author bachp
 */
public class TestParam {
    public static void changeValues(int f1, Num f2, Num f3){
        System.out.println("Before changing the values: ");
        System.out.println("f1 \tf2 \tf3");
        System.out.println(f1 +"\t"+ f2 + "\t" + f3 + "\n");
        f1 = 999; f2.setValue(888); f3 = new Num(777);
        System.out.println ("After changing the values:"); 
        System.out.println ("f1\tf2\tf3"); 
        System.out.println(f1 +"\t"+ f2 + "\t" + f3 + "\n");
    }
    public static void main(String[] args) {
        int a1 = 111;
        Num a2 = new Num(222);
        Num a3 = new Num(333);
        System.out.println ("Before calling changeValues:"); 
        System.out.println ("a1\t a2\t a3"); 
        System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n"); 
        changeValues (a1, a2, a3); 
        System.out.println ("After calling changeValues:"); 
        System.out.println ("a1\t a2\t a3"); 
        System.out.println (a1 + "\t" + a2 + "\t" + a3 + "\n"); 
        //do ham changeValues đã set lại giá trị cho biến f2 nên khi new mới thì sẽ lấy giá trị set chứ k lấy biến gán
        //ở hàm main nữa, còn a1, a2 trong hàm main là tạo 2 Num mới nên khi gọi lại vẫn sẽ lấy gtri gán ở hàm main
    } 
 } 
