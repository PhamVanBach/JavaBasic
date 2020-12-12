package bai54;

import java.util.Scanner;

/*  Các hàm xử lý sản phẩm
    1. nhap:         Nhập dữ liệu sản phẩm
    2. update:       Cập nhật lại sản phẩm với sản phẩm nhập vào
 */
public class SanPham {

    // Khai báo biến
    Scanner scan = new Scanner(System.in);

    private String maSanPham;
    private String tenSanPham;
    private long price;
    private String xuatXu;

    // Contructor

    public SanPham() {
        maSanPham = tenSanPham = xuatXu = "";
        price = 0;
    }

    public SanPham(String maSanPham, String tenSanPham, long price, String xuatXu) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        if (price < 0)
            price = 0;
        else
            this.price = price;
        this.xuatXu = xuatXu;
    }

    // Start Get Set
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    // End Get Set

    // Ngắt dòng cho đẹp
    public void inDauNgatDong() {
        int count = 50;
        for (int i = 0; i < count; i++)
            System.out.print("-");
        System.out.println("");
    }

    // Nhập dữ liệu vào
    public void nhap() {
        inDauNgatDong();

        System.out.print("Nhập mã sản phẩm: ");
        maSanPham = scan.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = scan.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        price = scan.nextLong();
        System.out.print("Nhập xuất xứ sản phẩm: ");
        scan.nextLine();
        xuatXu = scan.nextLine();
    }

    public void xuat() {
        System.out.printf("%-15s%-20s%-20s%-15s\n", maSanPham, tenSanPham, price, xuatXu);
    }

    public void xuatTieuDe() {
        System.out.printf("%-15s%-20s%-20s%-15s\n", "Mã sản phẩm", "Tên sản phẩm", "Giá cả", "Xuất xứ");
    }

    // Cập nhật lại sản phẩm với sản phẩm nhập vào
    public void update(SanPham sanPham) {
        if (sanPham.getTenSanPham() != "")
            this.tenSanPham = sanPham.getTenSanPham();
        if (sanPham.getPrice() != 0)
            this.price = sanPham.getPrice();
        if (sanPham.getXuatXu() != "")
            this.xuatXu = sanPham.getXuatXu();
    }
}
