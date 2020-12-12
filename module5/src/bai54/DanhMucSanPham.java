package bai54;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* Các hàm xử lý Danh Mục, Sản phẩm
*  1. nhap:         Nhập thông tin danh mục
*  2. xuat:         Xuất list sản phẩm trong danh mục
*  3. addSanPham:   Thêm sản phẩm vào danh mục
*  4. updateSanPham:Cho phép cập nhật thông tin sản phẩm
*  5. deleteSanPham:Xóa sản phẩm bất kỳ trong danh mục
*  6. getTongGiaTriSanPham: Thống kê tổng giá trị của các mặt hàng
*  7. searchViTriSanPham: Tìm kiếm sản phẩm trong danh mục trả về vị trí
*/

public class DanhMucSanPham {

    // Khai báo mảng lưu sản phẩm của danh mục
    ArrayList<SanPham> sanPhams = new ArrayList<>();

    // Biến sản phẩm chỉ để xuất tiêu đề | ngắt dòng
    SanPham sptemp = new SanPham();

    // Khai báo biến
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    private String maDanhMuc;
    private String tenDanhMuc;

    // Contructor

    public DanhMucSanPham() {
        maDanhMuc = tenDanhMuc = "";
    }

    public DanhMucSanPham(String maDanhMuc, String tenDanhMuc) {
        this.maDanhMuc = maDanhMuc;
        this.tenDanhMuc = tenDanhMuc;
    }

    // Start Get Set
    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }
    // End Get Set

    // Nhập thông tin danh mục
    public void nhap() {
        sptemp.inDauNgatDong();
        System.out.print("Nhập mã danh mục: ");
        maDanhMuc = scan.nextLine();
        System.out.print("Nhập tên danh mục: ");
        tenDanhMuc = scan.nextLine();
    }

    // Thêm sản phẩm vào danh mục
    public void addSanPham(SanPham sanPham) {
        sanPhams.add(sanPham);
    }

    // Xuất list sản phẩm trong danh mục
    public void xuat() {

        // nếu danh sách rỗng
        if (sanPhams.size() == 0) {
            System.out.println("Không có sản phẩm trong danh sách " + tenDanhMuc);
        }
        else {
            System.out.println("\nMã danh mục "+ maDanhMuc);
            sptemp.xuatTieuDe();
            for (SanPham sanPham : sanPhams)
                sanPham.xuat();
        }
    }

    public void xuatTieuDe() {
        System.out.printf("%-15s%-20s\n", "Mã Danh Mục", "Tên danh mục");
    }

    // Tìm kiếm sản phẩm trong danh mục trả về vị trí, không tìm thấy trả về -1
    public int searchViTriSanPham(String maSanPham) {
        for (SanPham sanPham : sanPhams)
            if (sanPham.getMaSanPham().equals(maSanPham))
                // trả về vị trí tìm thấy
                return sanPhams.indexOf(sanPham);

        // không tìm thấy sản phẩm, trả về -1
        return -1;
    }

    // Cho phép cập nhật thông tin sản phẩm
    public boolean updateSanPham(SanPham sanPham) {
        int vitri = searchViTriSanPham(sanPham.getMaSanPham());

        // không tìm thấy vị trí, trả về false
        if (vitri == -1)
            return false;
        else {
            // update sản phẩm và trả về true
            sanPhams.get(vitri).update(sanPham);
            return true;
        }
    }
    // Xóa sản phẩm bất kỳ trong danh mục
    public void deleteSanPham() {
        // xóa ngẫu nhiên sản phẩm
        int randomViTri = rand.nextInt(sanPhams.size()-1);
        System.out.println("Sản phẩm được xóa tại Danh mục " + tenDanhMuc);
        sptemp.xuatTieuDe();
        sanPhams.get(randomViTri).xuat();
        sanPhams.remove(randomViTri);
    }

    // Thống kê tổng giá trị của các mặt hàng
    public long getTongGiaTriSanPham() {
        long sumPrice = 0;

        for (SanPham sanPham : sanPhams) {
            sumPrice += sanPham.getPrice();
        }

        return sumPrice;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-20s\n", maDanhMuc, tenDanhMuc);
    }
}
