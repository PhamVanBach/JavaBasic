package bai53;

import bai54.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {

    ArrayList<SinhVien> sinhViens = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    // Biến sản phẩm chỉ để xuất tiêu đề | ngắt dòng
    SinhVien svtemp = new SinhVien();

    private String maLop;
    private String tenLop;
    private int siSo;

    // Contructor
    public LopHoc() {
        maLop = tenLop = "";
        siSo = 0;
    }

    public LopHoc(String maLop, String tenLop, int siSo) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
    }

    // Start Get Set
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }
    // End Get Set

    // Nhập dữ liệu sinh viên
    public void nhap() {
        svtemp.inDauNgatDong();

        System.out.print("Nhập mã lớp học: ");
        maLop = scan.nextLine();
        System.out.print("Nhập tên lớp học: ");
        tenLop = scan.nextLine();
        System.out.print("Nhập sĩ số lớp: ");
        siSo = scan.nextInt();
    }

    // Xuất tiêu đề
    public void xuatTieuDe() {
        System.out.printf("%-15s%-20s%-20s\n", "Mã Lớp", "Tên Lớp", "Sĩ Số");
//        System.out.format("%-15s%-30s%-20s%\n", "Mã Lớp", "Tên Lớp", "Sĩ Số");
//        System.out.println("Mã Lớp\tTên Lớp\tSĩ Số");
    }

    // Xuất thông tin lớp học
    public void xuat() {
        // nếu danh sách rỗng
        if (sinhViens.size() == 0) {
            System.out.println("\nKhông có sinh viên trong Lớp học " + tenLop);
        }
        else {
            System.out.println("\nThông tin lớp học "+ tenLop);
            svtemp.xuatTieuDe();
            for (SinhVien sinhVien : sinhViens)
                sinhVien.xuat();
        }
    }

    @Override
    public String toString() {
        return String.format("%-15s%-20s%-20s\n", maLop, tenLop, siSo);
    }
}
