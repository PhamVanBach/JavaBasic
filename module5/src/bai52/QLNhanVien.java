package bai52;

import java.util.Scanner;

public class QLNhanVien {

    // Khởi tạo danh sách nhân viên
    DanhSachNhanVien danhSachNhanVien = new DanhSachNhanVien();

    Scanner scan = new Scanner(System.in);

    // Biến nhân viên chỉ để xuất tiêu đề
    NhanVien nvtemp = new NhanVien();

    public void xuly() {

        // Nhân giá trị đầu vào
        int keypress;

        // exitCode = 0 thoát chương trình
        int exitCode = -1;

        do {
            System.out.println("\n--------------------------------");
            System.out.println("-------Danh Sách Nhân Viên-------");
            System.out.println("99. Khởi tạo nhanh danh sách nhân viên");
            System.out.println("1. Thêm nhân viên.");
            System.out.println("2. Xuất danh sách thông tin nhân viên.");
            System.out.println("3. Xuất tổng số nhân viên.");
            System.out.println("4. Lấy thông tin của các nhân viên có số sản phẩm vượt chuẩn");
            System.out.println("5. Đếm số nhân viên có số sản phẩm không vượt chuẩn.");
            System.out.println("6. Tính tổng lương của các nhân viên vượt chuẩn.");
            System.out.println("7. Lấy nhân viên có số sản phẩm ít nhất.");
            System.out.println("8. Lấy nhân viên có lương cao nhất.");
            System.out.println("9. Lấy nhân viên không vượt chuẩn có lương cao nhất.");
            System.out.println("10. Lấy tổng lương của tất cả nhân viên.");
            System.out.println("11. Tìm kiếm nhân viên theo mã nhập vào, trả về nhân viên tìm thấy.");
            System.out.println("12. Sắp xếp mảng nhân viên tăng dần theo số sản phẩm.");
            System.out.println("13. Xóa 1 nhân viên tại vị trí nhập vào.");
            System.out.println("0. Exit.");
            System.out.print("\nNhập lựa chọn: ");
            keypress = scan.nextInt();

            switch (keypress) {

                // 99. Khởi tạo nhanh list nhân viên
                case 99:
                    danhSachNhanVien.initNhanVien();
                    break;
                // 1. Thêm nhân viên
                case 1:
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.Nhap();
                    danhSachNhanVien.add(nhanVien);
                    break;

                // 2. Xuất danh sách nhân viên
                case 2:
                    danhSachNhanVien.xuat();
                    break;

                // 3. Trả về tổng nhân viên
                case 3:
                    System.out.println("\n--------------------------------");
                    System.out.println("Tổng nhân viên: " + danhSachNhanVien.size());
                    break;

                // 4. Xuất danh sách nhân viên vượt chuẩn
                case 4:
                    System.out.println("\n--------------------------------");
                    danhSachNhanVien.ListNV_VuotChuan();
                    break;

                // 5. Đếm số nhân viên có số sản phẩm không vượt chuẩn.
                case 5:
                    System.out.println("\n--------------------------------");
                    System.out.println("Số nhân viên có số sản phẩm không vượt chuẩn: " + danhSachNhanVien.CountNhanVien_KhongVuotChuan());
                    break;

                // 6. Tính tổng lương của các nhân viên vượt chuẩn.
                case 6:
                    System.out.println("\n--------------------------------");
                    System.out.println("Tổng lương của các nhân viên vượt chuẩn: " + danhSachNhanVien.TongLuongNV_VuotChuan());
                    break;

                // 7. Lấy nhân viên có số sản phẩm ít nhất.
                case 7:
                    System.out.println("\n--------------------------------");
                    NhanVien nvMinSP = danhSachNhanVien.getNhanVien_Min_SanPhan();
                    System.out.println("Nhân viên có số sản phẩm ít nhất");
                    // Hiển thị nhân viên có số sản phẩm ít nhất
                    nvMinSP.XuatTieuDe();
                    System.out.println(nvMinSP);
                    break;

                // 8. Lấy nhân viên có lương cao nhất.
                case 8:
                    System.out.println("\n--------------------------------");
                    NhanVien nvMaxLuong = danhSachNhanVien.getNhanVien_Max_Luong();
                    System.out.println("Nhân viên có lương cao nhất");
                    // Hiển thị nhân viên có lương cao nhất
                    nvMaxLuong.XuatTieuDe();
                    System.out.println(nvMaxLuong);
                    break;

                // 9. Lấy nhân viên không vượt chuẩn có lương cao nhất
                case 9:
                    System.out.println("\n--------------------------------");
                    NhanVien nv_KhongVuotChuan_MaxLuong = danhSachNhanVien.getNhanVien_KhongVuotChuan_Max_Luong();

                    // kiểm tra có nhân viên không vượt chuẩn không
                    if (nv_KhongVuotChuan_MaxLuong.getMaNV() == "")
                        System.out.println("Không có nhân viên không vượt chuẩn");
                    else {
                        System.out.println("Nhân viên không vượt chuẩn có lương cao nhất");
                        nv_KhongVuotChuan_MaxLuong.XuatTieuDe();
                        System.out.println(nv_KhongVuotChuan_MaxLuong);
                    }
                    break;

                // 10. Lấy tổng lương của tất cả nhân viên.
                case 10:
                    System.out.println("\n--------------------------------");
                    System.out.println("Tổng lương của các nhân viên: " + danhSachNhanVien.TongLuongNV());
                    break;

                // 11. Tìm kiếm nhân viên theo mã nhập vào, trả về nhân viên tìm thấy.
                case 11:
                    System.out.println("\n--------------------------------");
                    System.out.print("Nhập Mã Nhân Viên Cần tìm: ");
                    scan.nextLine();
                    NhanVien nv = danhSachNhanVien.search(scan.nextLine());
                    if (nv.getMaNV() == "")
                        System.out.println("Mã nhân viên vừa nhập không tìm thấy");
                    else {
                        System.out.println("Tìm thấy nhân viên có mã nhân viên vừa nhập");
                        nv.XuatTieuDe();
                        System.out.println(nv);
                    }
                    break;

                // 12. Sắp xếp mảng nhân viên tăng dần theo số sản phẩm.
                case 12:
                    System.out.println("\n--------------------------------");
                    System.out.println("Sắp xếp nhân viên tăng dần theo số sản phẩm");
                    danhSachNhanVien.sort();
                    danhSachNhanVien.xuat();
                    break;

                // 13. Xóa 1 nhân viên tại vị trí nhập vào.
                case 13:
                    System.out.println("\n--------------------------------");
                    System.out.print("Nhập vị trí nhân viên cần xóa (Tối đa " + danhSachNhanVien.nhanViens.size() + ") : ");
                    danhSachNhanVien.remove(scan.nextInt());
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
}
