package bai53;

import bai54.DanhMucSanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class QLLopHoc {

    ArrayList<LopHoc> lopHocs = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    // Biến sản phẩm chỉ để xuất tiêu đề | ngắt dòng
    SinhVien svtemp = new SinhVien();

    public void xuly() {
        // Nhân giá trị đầu vào
        int keypress;

        // exitCode = 0 thoát chương trình
        int exitCode = -1;

        do {
            System.out.println("");
            svtemp.inDauNgatDong();
            System.out.println("-----------------Quản Lý Sinh Viên-------------------");
            System.out.println("99. Khởi tạo nhanh danh sách lớp học");
            System.out.println("1. Thêm lớp học.");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Xuất danh sách sinh viên thuộc lớp học.");
            System.out.println("4. Xuất tất cả sinh viên theo từng lớp");
            System.out.println("0. Exit.");
            System.out.print("\nNhập lựa chọn: ");
            keypress = scan.nextInt();

            switch (keypress) {

                // 99. Khởi tạo nhanh list lớp học
                case 99:
                    initLopHoc();
                    break;
                // 1. Thêm sinh viên
                case 1:
                    addLopHoc();
                    break;

                // 2. Thêm lớp học
                case 2:
                    addSinhVien();
                    break;

                // 3. Xuất danh sách sinh viên thuộc lớp học.
                case 3:
                    xuatDanhSachDuocChon();
                    break;

                // 4. Xuất tất cả sinh viên theo từng lớp
                case 4:
                    xuat();
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

    // Khởi tạo nhanh danh sách lớp học
    public void initLopHoc() {
        // khởi tạo lớp học
        lopHocs.add(new LopHoc("1811", "18CT111", 4));
        lopHocs.add(new LopHoc("1912", "19NH112", 3));
        lopHocs.add(new LopHoc("2015", "20CT111", 3));
        lopHocs.add(new LopHoc("1711", "17AV111", 2));

        // khởi tạo sinh viên
        lopHocs.get(0).sinhViens.add(new SinhVien("118001263", "Mai Anh", "Hà Nam", "1811"));
        lopHocs.get(0).sinhViens.add(new SinhVien("118001001", "Khánh Ngọc", "Hải Phòng", "1811"));
        lopHocs.get(0).sinhViens.add(new SinhVien("118000424", "Sơn Hải", "Quảng Bình", "1811"));
        lopHocs.get(0).sinhViens.add(new SinhVien("118000900", "Phương Mỹ Chi", "Cà Mau", "1811"));

        lopHocs.get(1).sinhViens.add(new SinhVien("119000123", "Thúy Hằng", "Bắc Ninh", "1912"));
        lopHocs.get(1).sinhViens.add(new SinhVien("119001499", "Ngọc Ánh", "Quảng Nam", "1912"));
        lopHocs.get(1).sinhViens.add(new SinhVien("119000609", "Minh Công", "Hà Tĩnh", "1912"));

        lopHocs.get(2).sinhViens.add(new SinhVien("120000053", "Ngọc Trang", "Thanh Hóa", "2015"));
        lopHocs.get(2).sinhViens.add(new SinhVien("120000286", "Trúc Uyên", "Ninh Bình", "2015"));
        lopHocs.get(2).sinhViens.add(new SinhVien("120000327", "Trang Cẩm Quyến", "Lào Cai", "2015"));

        lopHocs.get(3).sinhViens.add(new SinhVien("117000454", "Văn Tài", "Đồng Nai", "1711"));
        lopHocs.get(3).sinhViens.add(new SinhVien("117000754", "Thái Phúc", "Huế", "1711"));

        svtemp.inDauNgatDong();
        System.out.println("Khởi tạo nhanh danh sách lớp học thành công");
    }

    // Thêm sinh viên mới
    public void addSinhVien() {
        // nhập thông tin sinh viên
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhap();

        // lưu vị trí lớp học tìm được
        int vitriLop = -1;

        for (LopHoc lopHoc : lopHocs)
            // nếu tìm dược lớp học
            if (lopHoc.getMaLop().equals(sinhVien.getMaLop())) {
                vitriLop = lopHocs.indexOf(lopHoc);
                // biến kiểm tra trùng mssv
                boolean check = true;
                // kiểm tra trùng mã sinh viên trong lớp học
                for (SinhVien sinhVien1 : lopHocs.get(vitriLop).sinhViens)
                    if (sinhVien1.getMaSV().equals(sinhVien.getMaSV())) {
                        System.out.println("Mã sinh viên đã tồn tại, vui lòng thử lại");
                        check = false;
                    }

                // nếu không trùng mssv
                if (check) {
                    // thêm sinh viên vào lớp học
                    lopHocs.get(vitriLop).sinhViens.add(sinhVien);
                    System.out.println("Thêm dữ liệu thành công!");
                }
            }

        // không tìm thấy lớp học
        if (vitriLop == -1)
            System.out.println("Mã lớp học không tồn tại, vui lòng thử lại!");
    }

    // Thêm lớp học mới
    public void addLopHoc() {
        // Nhập thông tin lớp học
        LopHoc lopHoc = new LopHoc();
        lopHoc.nhap();

        // kiểm tra xem mã lớp học đã tồn tại chưa
        boolean checkLopHoc = true;

        for (LopHoc lopHoc1 : lopHocs)
            // Nếu tồn tại 1 lớp học trùng mã lớp
            if (lopHoc1.getMaLop().equals(lopHoc.getMaLop())) {
                checkLopHoc = false;
                break;
            }

        // nếu chưa tồn tại mã lớp đó
        if (!checkLopHoc)
            System.out.println("Lớp học đã tồn tại, không thể thêm vào!");
        else {
            lopHocs.add(lopHoc);
            System.out.println("Thêm lớp học mới thành công");
        }
    }

    // Xuất tất cả tiêu đề danh mục, không có trả về false
    public boolean xuatTieuDeLopHoc() {
//         sptemp.inDauNgatDong();
        if (lopHocs.size() == 0) {
            System.out.println("Không có lớp học nào");
            return false;
        }
        else {
            // xuất tiêu đề
            lopHocs.get(0).xuatTieuDe();
            return true;
        }
    }

    // Xuất thông tin sinh viên của lớp nhập từ bàn phím
    public void xuatDanhSachDuocChon() {
        svtemp.inDauNgatDong();
        if (xuatTieuDeLopHoc()) {
            // xuất list lớp học
            for (LopHoc lopHoc : lopHocs)
                System.out.print(lopHoc);

            System.out.print("Nhập mã lớp học cần xuất: ");
            scan.nextLine();
            String maLop = scan.nextLine();

            // khởi tạo biến lưu vị trí lớp học tìm được
            int vitri = -1;
            // tìm lớp học = mã lớp nhập vào
            for (LopHoc lopHoc : lopHocs)
                if (lopHoc.getMaLop().equals(maLop)) {
                    vitri = lopHocs.indexOf(lopHoc);

                    // Xuất thông tin lớp học
                    lopHocs.get(vitri).xuat();
                }

            if (vitri == -1) {
                System.out.println("Không tìm thấy mã lớp học!");
            }
        }
    }

    public void xuat() {
        if (lopHocs.size() == 0)
            System.out.println("Danh mục rỗng");
        else {
            for (LopHoc lopHoc : lopHocs)
                lopHoc.xuat();
        }
    }
}
