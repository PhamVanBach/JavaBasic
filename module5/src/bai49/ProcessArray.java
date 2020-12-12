package bai49;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProcessArray {

    // Khởi tạo biến
    ArrayList<Integer> arrList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();
    int size = 0;

    // Contructor
    public ProcessArray() {};

    public ProcessArray(int size) {
        this.size = size;
    };

    // Get Set
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void nhap() {
        System.out.print("Nhap so luong phan tu cua mang: ");
        size = scan.nextInt();
//        for (int count = 0; count < size; count++) {
//            System.out.print("Nhap phan tu thu " + count + ": ");
//            arrList.add(scan.nextInt());
//        }

        for (int count = 0; count < size; count++) {
            arrList.add(rnd.nextInt(100));
        }
    }

    public void xuat() {
        for(int i : arrList)
            System.out.print(i + " ");
        System.out.println("");
    }

    public void xuat(ArrayList<Integer> tempArr) {
        for(int i : tempArr)
            System.out.print(i + " ");
        System.out.println("");
    }

    public void search(int inputInt) {

        boolean isExist = arrList.contains(inputInt);
        if (isExist)
            System.out.println("Tim thay duoc gia tri vua nhap trong mang");
        else
            System.out.println("Gia tri vua nhap khong ton tai");
    }

    public boolean isPrimes(int num) {
        if (num == 2 | num == 3) return true;
        if (num % 2 == 0 | num % 3 == 0) return false;

        int k = 5;
        for (int i = k; i < (int) Math.sqrt(num); k += 6) {
            if ((num % i == 0) | (num % (i+2) == 0))
                return false;
        }
        return true;
    }

    public void checkPrime() {

        System.out.println("----------------------------------------");
        // Tạo mảng chứa số nguyên tố
        ArrayList<Integer> primesArr = new ArrayList<>();


        for(int i = 0; i < arrList.size(); i++)
            if (isPrimes(i)) {
                primesArr.add(arrList.get(i));
            }

        // Xuất các số nguyên tố ra
        if (primesArr.size() > 0) {
            System.out.println("Cac so nguyen to trong mang");
            xuat(primesArr);
        }
        else {
            System.out.println("Không tìm được số nguyên tố trong mảng");
        }
    }

    public void remove(int num) {
        while (arrList.contains(num)) {
            arrList.set(arrList.indexOf(num), 0);
        }
    }

    public void bubbleSort()
    {
        int n = arrList.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arrList.get(j) > arrList.get(j+1))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arrList.get(j);
                    arrList.set(j, arrList.get(j+1));
                    arrList.set(j+1, temp);
                }
    }

    public void doiXung() {

        System.out.println("----------------------------------------");
        boolean checkDX = true;
        int n = arrList.size();
        for (int i = 0; i < n/2; i++)
            if (arrList.get(i) != arrList.get(n-i-1)) {
                checkDX = false;
                break;
            }

        if (checkDX)
            System.out.println("Day la mang doi xung");
        else
            System.out.println("Day khong phai la mang doi xung");
    }

}
