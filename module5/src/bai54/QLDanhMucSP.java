package bai54;

import bai52.NhanVien;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QLDanhMucSP {

    ArrayList<DanhMucSanPham> danhMucSanPhams = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    // Biến sản phẩm chỉ để xuất tiêu đề | ngắt dòng
    SanPham sptemp = new SanPham();

    public void xuly() {
        // Nhân giá trị đầu vào
        int keypress;

        // exitCode = 0 thoát chương trình
        int exitCode = -1;

        do {
            System.out.println("");
            sptemp.inDauNgatDong();
            System.out.println("-----------------Quản Lý Danh Mục-------------------");
            System.out.println("99. Khởi tạo nhanh danh sách danh mục");
            System.out.println("1. Thêm danh mục.");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Xuất danh sách sản phẩm thuộc danh mục.");
            System.out.println("4. Xuất tất cả danh mục");
            System.out.println("5. Cho phép cập nhật thông tin sản phẩm.");
            System.out.println("6. Thống kê giá trị của các mặt hàng.");
            System.out.println("7. Liệt kê các sản phẩm có xuất xứ từ Trung Quốc.");
            System.out.println("0. Exit.");
            System.out.print("\nNhập lựa chọn: ");
            keypress = scan.nextInt();

            switch (keypress) {

                // 99. Khởi tạo nhanh list danh mục
                case 99:
                    initDanhMuc();
                    break;
                // 1. Thêm danh mục
                case 1:
                    addDanhMuc();
                    break;

                // 2. Thêm sản phẩm
                case 2:
                    addSanPham();
                    break;

                // 3. Xuất danh sách sản phẩm thuộc danh mục.
                case 3:
                    xuatDanhSachDuocChon();
                    break;

                // 4. Xuất tất cả danh mục
                case 4:
                    xuat();
                    break;

                // 5. Cho phép cập nhật thông tin sản phẩm.
                case 5:
                    updateSanPham();
                    break;

                // 6. Thống kê giá trị của các mặt hàng.
                case 6:
                    thongKeGiaTriCacMatHang();
                    break;

                // Liệt kê các sản phẩm có xuất xứ từ Trung Quốc.
                case 7:
                    lietKeSanPhamTrungQuoc();
                    break;

                case 0:
                    exitCode = 0;
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng");
                    break;

            }
        } while (exitCode != 0);
    }
    // Khởi tạo nhanh danh mục sản phẩm
    public void initDanhMuc() {
        danhMucSanPhams.add(new DanhMucSanPham("DM001", "Mì Tôm"));
        danhMucSanPhams.add(new DanhMucSanPham("DM002", "Sữa"));
        danhMucSanPhams.add(new DanhMucSanPham("DM003", "Nước Giải Khát"));
        danhMucSanPhams.add(new DanhMucSanPham("DM004", "Dầu Ăn"));

        danhMucSanPhams.get(0).addSanPham(new SanPham("SP005", "Mì Hảo Hảo", 3500, "Việt Nam"));
        danhMucSanPhams.get(0).addSanPham(new SanPham("SP007", "Mì 3 Miền", 3000, "Việt Nam"));
        danhMucSanPhams.get(0).addSanPham(new SanPham("SP010", "Mì Chaina", 3500, "Trung Quốc"));
        danhMucSanPhams.get(1).addSanPham(new SanPham("SP001", "Sữa Ông Thọ", 23000, "Việt Nam"));
        danhMucSanPhams.get(1).addSanPham(new SanPham("SP002", "Sữa Nhật Bản", 50000, "Nhật Bản"));
        danhMucSanPhams.get(1).addSanPham(new SanPham("SP008", "Mì Hảo Hảo", 3500, "Việt Nam"));
        danhMucSanPhams.get(2).addSanPham(new SanPham("SP003", "Coca", 15000, "Việt Nam"));
        danhMucSanPhams.get(2).addSanPham(new SanPham("SP004", "Bò Húc", 10000, "Thái Lan"));
        danhMucSanPhams.get(2).addSanPham(new SanPham("SP011", "Pepsi", 9000, "Việt Nam"));
        danhMucSanPhams.get(3).addSanPham(new SanPham("SP012", "Meizan", 35000, "Việt Nam"));
        danhMucSanPhams.get(3).addSanPham(new SanPham("SP009", "Dầu Hàn Quốc", 150000, "Hàn Quốc"));
        danhMucSanPhams.get(3).addSanPham(new SanPham("SP013", "Cái Lân", 120000, "Trung Quốc"));

        sptemp.inDauNgatDong();
        System.out.println("Khởi tạo nhanh danh sách danh mục thành công");
    }

    //Viết hàm cho phép thông tin danh mục sản phẩm
    public void addDanhMuc() {
        // khởi tạo biến danh mục tạm thời
        DanhMucSanPham danhMucSanPham = new DanhMucSanPham();
        danhMucSanPham.nhap();
        danhMucSanPhams.add(danhMucSanPham);
    }

    // Viết hàm cho phép thông tin sản phẩm
    public void addSanPham() {
        SanPham sanPham = new SanPham();
        sanPham.nhap();

        // nhập mã danh mục phân loại sp
        System.out.print("Nhập mã danh mục sản phẩm để phân loại: ");
        scan.nextLine();
        String maDanhMuc = scan.nextLine();

        // kiểm tra mã danh mục có tồn tại không
        int viTriDanhMuc = checkViTri_MaDanhMuc(maDanhMuc);

        if (viTriDanhMuc != -1) {
            danhMucSanPhams.get(viTriDanhMuc).addSanPham(sanPham);
            System.out.println("Thêm sản phẩm vào Danh mục " + danhMucSanPhams.get(viTriDanhMuc).getMaDanhMuc() + " thành công!");
        }
        else {
            System.out.println("Không tìm thấy danh mục cần thêm vào, vui lòng nhập lại");
        }
    }

    // Kiểm tra và trả lại vị trí của tên danh mục nhập vào
    public int checkViTri_MaDanhMuc(String maDanhMuc) {
        for (DanhMucSanPham danhMucSanPham : danhMucSanPhams)
            if (danhMucSanPham.getMaDanhMuc().equals(maDanhMuc))
                // trả lại vị trí tên danh mục tìm được
                return danhMucSanPhams.indexOf(danhMucSanPham);

        // không tìm thấy vị trí
        return -1;
    }

    // Xuất tất cả tiêu đề danh mục, không có trả về false
    public boolean xuatTieuDeDanhMuc() {
//         sptemp.inDauNgatDong();
        if (danhMucSanPhams.size() == 0) {
            System.out.println("Không có danh mục nào");
            return false;
        }
        else {
            // xuất tiêu đề
            danhMucSanPhams.get(0).xuatTieuDe();
            return true;
        }
    }

    // xuất danh sách sản phẩm thuộc một danh mục bất kỳ nhập vào từ bàn phím
    public void xuatDanhSachDuocChon() {
        sptemp.inDauNgatDong();
        if (xuatTieuDeDanhMuc()) {
            // Xuất list danh mục
            for (DanhMucSanPham danhMucSanPham : danhMucSanPhams)
                System.out.print(danhMucSanPham);

            System.out.print("Nhập mã danh mục cần xuất: ");
            scan.nextLine();
            String maDanhMuc = scan.nextLine();
            // khởi tạo biến lưu vị trí danh mục được tìm, mặc định -1
            int vitri = checkViTri_MaDanhMuc(maDanhMuc);

            if (vitri == -1)
                System.out.println("Không tìm thấy mã danh mục vừa nhập");
            else {

                sptemp.xuatTieuDe();
                danhMucSanPhams.get(vitri).xuat();
            }
        }
    }

    // Xuất tất cả danh mục
    public void xuat() {
        if (danhMucSanPhams.size() == 0)
            System.out.println("Danh mục rỗng");
        else {
            for (DanhMucSanPham danhMucSanPham : danhMucSanPhams)
                danhMucSanPham.xuat();
        }
    }

    // Cho phép cập nhật thông tin sản phẩm
    public void updateSanPham() {
        // Nhập sản phẩm
        SanPham sanPham = new SanPham();
        sanPham.nhap();

        // kiểm tra xem update thành công
        boolean checkupdate = false;

        for (DanhMucSanPham danhMucSanPham : danhMucSanPhams) {
            // lấy từng sản phẩm trong list sản phẩm
            for (int i = 0; i < danhMucSanPham.sanPhams.size(); i++)
                // kiểm tra nếu sản phẩm có mã sản phẩm = sanPham.getMaSanPham
                if (danhMucSanPham.sanPhams.get(i).getMaSanPham().equals(sanPham.getMaSanPham())) {
                    danhMucSanPham.sanPhams.get(i).update(sanPham);
                    checkupdate = true;
                }
        }

        if (checkupdate)
            System.out.println("Update sản phẩm thành công");
        else
            System.out.println("Không tìm thấy sản phẩm trùng khớp");
    }

    // Thống kê tổng giá trị của các mặt hàng
    public void thongKeGiaTriCacMatHang() {
        long sum = 0;
        for (DanhMucSanPham danhMucSanPham : danhMucSanPhams)
            sum += danhMucSanPham.getTongGiaTriSanPham();

        sptemp.inDauNgatDong();
        System.out.println("Tổng giá trị của các mặt hàng là: " + sum);
    }

    // Xóa sản phẩm bất kỳ trong danh mục
    public void randomXoaSP() {
        while(true) {
            int viTriRandom = rand.nextInt(danhMucSanPhams.size());
            if (danhMucSanPhams.get(viTriRandom).sanPhams.size() != 0)
                danhMucSanPhams.get(viTriRandom).deleteSanPham();
            break;
        }
    }

    // Liệt kê các sản phẩm có xuất xứ từ trung quốc
    public void lietKeSanPhamTrungQuoc() {
        sptemp.inDauNgatDong();
        sptemp.xuatTieuDe();

        // điều kiện
        String xuatXuTQ = "Trung Quốc";
        // lấy từng danh mục trong list danh mục
        for (DanhMucSanPham danhMucSanPham : danhMucSanPhams) {
            // lấy từng sản phẩm trong list sản phẩm
            for (int i = 0; i < danhMucSanPham.sanPhams.size(); i++)
                // kiểm tra nếu sản phẩm có xuất xứ = xuatXuTQ
                if (danhMucSanPham.sanPhams.get(i).getXuatXu().equals(xuatXuTQ))
                    danhMucSanPham.sanPhams.get(i).xuat();
        }
    }


}
