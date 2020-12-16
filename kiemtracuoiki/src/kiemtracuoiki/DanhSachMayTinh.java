/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

/**
 *
 * @author bachp
 */
public class DanhSachMayTinh extends PhongThucHanh{
    private String loaiMayTinh, tinhTrangHienThoi;
    private int soLuong;

    public DanhSachMayTinh() {
    }

    public DanhSachMayTinh(String loaiMayTinh, String tinhTrangHienThoi, int soLuong) {
        this.loaiMayTinh = loaiMayTinh;
        this.tinhTrangHienThoi = tinhTrangHienThoi;
        this.soLuong = soLuong;
    }

    public DanhSachMayTinh(int mp, String tp, int sm, String loaiMayTinh, int soLuong, String tinhTrangHienThoi) {
        super(mp, tp, sm);
        this.loaiMayTinh = loaiMayTinh;
        this.tinhTrangHienThoi = tinhTrangHienThoi;
        this.soLuong = soLuong;
    }
    
    
    

    public String getLoaiMayTinh() {
        return loaiMayTinh;
    }

    public boolean setLoaiMayTinh(String loaiMayTinh) {
        if(!loaiMayTinh.isEmpty()){
            this.loaiMayTinh = loaiMayTinh;
            return true; 
        }
        else{
            System.out.println("Nhap lai loai may tinh");
            return false;
        }
    }

    public String getTinhTrangHienThoi() {
        return tinhTrangHienThoi;
    }

    public boolean setTinhTrangHienThoi(String tinhTrangHienThoi) {
        if(!tinhTrangHienThoi.isEmpty()){
            this.tinhTrangHienThoi = tinhTrangHienThoi;
            return true; 
        }
        else{
            System.out.println("Nhap lai tinh trang hien thoi");
            return false;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "DanhSachMayTinh{"+ super.toString() + "\nloaiMayTinh=" + loaiMayTinh + ", tinhTrangHienThoi=" + tinhTrangHienThoi + ", soLuong=" + soLuong + '}';
    }
       
}
