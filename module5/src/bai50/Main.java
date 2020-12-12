package bai50;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;

        System.out.print("Nhap so luong phan tu cua mang hinh tron: ");
        n = scan.nextInt();

        // Khởi tạo mảng hình tròn
        CircleCollection circleCollection = new CircleCollection(n);

        // Xuất mảng hình tròn
        System.out.println(circleCollection);

        // Xuất tổng diện tích hình tròn
        System.out.println("Tổng diện tích hình tròn là: " + circleCollection.sumAreas());

        // Xuất diện tích lớn nhất
        System.out.println("Diện tích hình tròn lớn nhất là: " + circleCollection.maxAreas());

        // Xuất thông tin hình tròn có diện tích nhỏ nhất
        System.out.print("Thông tin hình tròn có diện tích nhỏ nhất");
        System.out.println(circleCollection.getMinCircle());
    }


}
