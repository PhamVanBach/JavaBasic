/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai60;

/**
 *
 * @author Administrator
 */
import java.util.*;
public class AirtistDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        int chieuDai = scanner.nextInt();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        int chieuRong = scanner.nextInt();
        Rectangle rectangle = new Rectangle(chieuDai,chieuRong);

        rectangle.draw();
         
        System.out.print("Nhập cạnh vuông: ");
        int canhVuong = scanner.nextInt();
        RightTriagle rightTriangle = new RightTriagle(canhVuong);
        rightTriangle.draw();
    }
}
