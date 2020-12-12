package bai48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomArray {
    // Khởi tạo biến
    Random rnd = new Random();
    ArrayList<Integer> arrList = new ArrayList<>();
    // Contructor
    public RandomArray() {

    }

    public RandomArray(int size) {

        // Sinh giá trị ngẫu nhiên vào mảng
        for (int count = 0; count < size; count++)
            // Randon số nguyên 0-99
            arrList.add(rnd.nextInt(100));
    }

    // add chỉ có 1 tham số thì thêm giá trị của tham số đó vào vị trí cuối cùng của mảng
    public void add(int rndInt) {
        arrList.add(rndInt);
    }

    // add 2 tham số thì thêm rndInt chèn vào vị trí được truyền vào của mảng
    public void add(int rndInt, int viTri) {
        arrList.add(viTri, rndInt);
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
        int minArr = arrList.get(0);

        for (int count = 1; count < arrList.size(); count++)
            if (arrList.get(count) < minArr) {
                int temp = arrList.get(count);
                arrList.set(count, minArr);
                minArr = temp;
            }

        return minArr;
    }

    public void sort() {
        Collections.sort(arrList);
    }

    public void show() {
//        System.out.println("");
        for (int temp : arrList) {
            System.out.print(temp + " ");
        }
        System.out.println("");
    }
}
