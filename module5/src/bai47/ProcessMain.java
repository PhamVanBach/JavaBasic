package bai47;

import java.util.Scanner;

public class ProcessMain {

    public static void main(String[] args) {

        // Khởi tạo biến, mảng
        RandomArray rndArr;
        Scanner scan = new Scanner(System.in);
        int lenArr;


        System.out.print("Nhap so luong phan tu cua mang: ");
        lenArr = scan.nextInt();
        rndArr = new RandomArray(lenArr);

        System.out.println("Tong cua tat ca phan tu trong mang la: " + rndArr.sum());

        System.out.println("Gia tri nho nhat trong mang la: " + rndArr.min());
        rndArr.show();

        rndArr.add(7);
        rndArr.show();

        rndArr.add(8,3);
        rndArr.show();

        System.out.println("\nSort");
        rndArr.sort();
        rndArr.show();

    }
}
