package bai46;

import java.util.Random;

public class RandomArray {

    // Khởi tạo biến
    Random rnd = new Random();
    int[] arrList;
    int size;
    // Contructor
    public RandomArray() {

    }

    public RandomArray(int size) {
        this.size = size;
        arrList = new int[this.size];

        // Sinh giá trị ngẫu nhiên vào mảng
        for (int count = 0; count < this.size; count++)
            // Randon số nguyên 0-99
            arrList[count] = rnd.nextInt(100);
    }

    public long sum() {
        long sumArr = 0;

        // tính tổng các phần tử trong mảng
        for (int temp : arrList) {
            sumArr += (long)temp;
        }

        return sumArr;
    }

    public int min() {
        // Gán giá trị đầu tiên là nhỏ nhất
        int minArr = arrList[0];

        for (int count = 1; count < size; count++)
            if (arrList[count] < minArr) {
                int temp = arrList[count];
                arrList[count] = minArr;
                minArr = temp;
            }

        return minArr;
    }

    public void sort() {
        for (int count = 1; count < size; count++)
            if (arrList[count] < arrList[count-1]) {
                int temp = arrList[count];
                arrList[count] = arrList[count-1];
                arrList[count-1] = temp;
                count = 0;
            }
    }

    public void show() {
        System.out.println("");
        for (int temp : arrList) {
            System.out.print(temp + " ");
        }
        System.out.println("");
    }
}
