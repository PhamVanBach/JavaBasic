package bai50;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* Các hàm xử lý với mảng hình tròn
    + addCircle:            thêm 1 hình tròn vào mảng;
    + getSize:              lấy số lượng hình tròn trong mảng;
    + getCircle/setCircle:  lấy/gán hình tròn tại vị trí xác định trong mảng;
    + toString:             trả về thông tin của tập các hình tròn trong mảng;
    + sumAreas:             Hàm tính tổng diện tích hình tròn;
    + maxAreas:             Hàm tìm diện tích lớn nhất;
    + getMinCircle:         Hàm lấy hình tròn có diện tích nhỏ nhất
 */
public class CircleCollection {

    // Khai báo mảng lưu các hình tròn
    ArrayList<Circle> circles = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    // Khởi tạo mảng hinh tròn có số lượng 'size' và bán kính ngẫu nhiên
    public CircleCollection(int size) {

        for (int count = 0; count < size; count++) {
            // Random bán kính
            double radius = rand.nextDouble();
            // Khởi tạo hình tròn mới với bán kính random
            Circle circle = new Circle(radius);
            // Thêm hình tròn vào mảng
            circles.add(circle);
        }
    }

    // Overloading
//    public void addCircle() {
//        Circle circle = new Circle();
//        System.out.print("Nhap ban kinh hinh tron: ");
//        circle.setRadius(scan.nextDouble());
//    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    // Đếm số lượng hình tròn trong mảng
    public int getSize() {
        return circles.size();
    }

    // Lấy hình tròn tại vị trí
    public Circle getCircle(int vitri) {
        return circles.get(vitri);
    }

    // Gán hình tròn tại vị trí xác định trong mảng
    public void setCircle(Circle circle, int vitri) {
        circles.set(vitri, circle);
    }

    // Tính tổng diện tích hình tròn
    public double sumAreas() {
        double sumArea = 0.0;

        for (Circle circle : circles)
            sumArea += circle.getArea();

        return sumArea;
    }

    // Tính diện tích hình tròn lớn nhất
    public double maxAreas() {
        double maxArea = 0.0;

        for (Circle circle : circles) {
            // lấy diện tích hình tròn
            double area = circle.getArea();

            // So sánh tìm diện tích hình tròn lớn nhất
            if (area > maxArea)
                maxArea = area;
        }

        return maxArea;
    }

    // Tính hình tròn có diện tích nhỏ nhất
    public Circle getMinCircle() {
        // vị trí của hình tròn nhỏ nhất
        int vitri_minCircle = 0;

        for (Circle circle : circles) {
            // lấy diện tích hình tròn
            double area = circle.getArea();

            // So sánh tìm diện tích hình tròn nhỏ nhất
            if (area < circles.get(vitri_minCircle).getArea())
                vitri_minCircle = circles.indexOf(circle);
        }

        return circles.get(vitri_minCircle);
    }

    @Override
    public String toString() {
        return "Danh sách hình tròn {" +
                circles +
                "\n" +
                '}';
    }
}
