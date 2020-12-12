package bai52;

import java.util.Scanner;
public class NhanVien {

    Scanner sc = new Scanner(System.in);
    private String maNV;
    private int soSP;
    private final int soLuongSPVuotChuan = 500;

    public NhanVien() {
        maNV = "";
        soSP = 0;
    }

    public NhanVien(String ma, int sp) {
        maNV = ma;
        soSP = sp > 0 ? sp : 0;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP > 0 ? soSP : 0;
    }

    public boolean coVuotChuan() {
        return soSP > soLuongSPVuotChuan ? true : false;
    }

    public String getTongKet() {
        return coVuotChuan() ? "Vuot" : "Khong Vuot";
    }

    public long getLuong() {
        return coVuotChuan() ? (long) (soLuongSPVuotChuan * 20000 + (soSP - soLuongSPVuotChuan) * 30000) : (long) (soSP * 20000);
    }

    public void Nhap() {
        System.out.println("Nhap Thong Tin Nhan Vien.");
        System.out.print("Nhap Ma Nhan Vien: ");
        setMaNV(sc.nextLine());
        System.out.print("Nhap So San Pham Cua Nhan Vien: ");
        setSoSP(sc.nextInt());
    }

    public void XuatTieuDe() {
        System.out.printf("%-15s%-20s%-20s%-20s\n", "Ma nhan vien", "So san pham", "Luong", "Tong ket");
    }

    public void xuat() {
        System.out.printf("\n%-15s%-20s%-20s%-20s", maNV, soSP, getLuong(), getTongKet());
    }

    public String toString() {
        return String.format("%-15s%-20s%-20s%-20s", maNV, soSP, getLuong(), getTongKet());
    }
}

