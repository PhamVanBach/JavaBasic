package bai49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ProcessArray arr = new ProcessArray();
        arr.nhap();

        arr.xuat();

        arr.doiXung();

        System.out.print("Nhap Gia Tri Can Tim: ");
        int numSearch = scan.nextInt();
        arr.search(numSearch);

        arr.checkPrime();

        System.out.print("Nhap Gia Tri Can Xoa: ");
        int numDelete = scan.nextInt();
        arr.remove(numDelete);

        arr.xuat();

        System.out.println("Sap xep noi bot");
        arr.bubbleSort();
        arr.xuat();




    }
}
