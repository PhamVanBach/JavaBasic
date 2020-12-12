package bai53;

import java.util.Scanner;
import java.util.Formatter;

public class SinhVien {

    Scanner scan = new Scanner(System.in);

    // Khởi tạo biến
    private String maSV;
    private String name;
    private String noiSinh;
    private String maLop;

    // Contructor
    public SinhVien() {
        maSV = name = noiSinh = maLop = "";
    }

    public SinhVien(String maSV, String name, String noiSinh, String maLop) {
        this.maSV = maSV;
        this.name = name;
        this.noiSinh = noiSinh;
        this.maLop = maLop;
    }

    // Start Get Set
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    // End Get Set

    // Nhập dữ liệu sinh viên
    public void nhap() {
        inDauNgatDong();

        System.out.print("Nhập mã sinh viên: ");
        maSV = scan.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        name = scan.nextLine();
        System.out.print("Nhập nơi sinh: ");
        noiSinh = scan.nextLine();
        System.out.print("Nhập mã lớp: ");
        maLop = scan.nextLine();
    }

    // Xuất tiêu đề
    public void xuatTieuDe() {
        System.out.printf("%-20s%-30s%-30s%-20s\n", "Mã Sinh Viên", "Họ Tên", "Nơi Sinh", "Mã Lớp");
//        System.out.format("%-20s%-40s%-50s%-30s\n", "Mã Sinh Viên", "Họ Tên", "Nơi Sinh", "Mã Lớp");
//        System.out.println("Mã Sinh Viên\tHọ Tên\t Nơi Sinh\t Mã Lớp");
    }

    // Xuất dữ liệu sinh viên
    public void xuat() {
        System.out.printf("%-20s%-30s%-30s%-20s\n", maSV, name, noiSinh, maLop);
//        System.out.format("%-15s%-30s%-20s%-20s%\n", maSV, name, noiSinh, maLop);
//        System.out.println(maSV + name + noiSinh + maLop);
    }

    // Ngắt dòng cho đẹp
    public void inDauNgatDong() {
        int count = 53;
        for (int i = 0; i < count; i++)
            System.out.print("-");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", name='" + name + '\'' +
                ", noiSinh='" + noiSinh + '\'' +
                ", maLop='" + maLop + '\'' +
                '}';
    }
}
