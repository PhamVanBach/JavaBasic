package bai52;

import java.util.ArrayList;

/*  Các hàm xử lý nhân viên
    1. add:                                         Thêm một nhân viên vào danh sách (mỗi nhân viên cho nhập vào mã nhân viên và số sản phẩm).
    2. ListNV_VuotChuan:                            Lấy thông tin của tất cả nhân viên, xuất dạng bảng với các cột: mã nhân viên, số sản phẩm, lương, tổng kết.
    3. CountNhanVien_KhongVuotChuan:                Lấy tổng số nhân viên.
    4. CountNhanVien_KhongVuotChuan:                Lấy thông tin của các nhân viên có số sản phẩm vượt chuẩn.
    5. CountNhanVien_KhongVuotChuan:                Đếm số nhân viên có số sản phẩm không vượt chuẩn.
    6. getNhanVien_Min_SanPhanTongLuongNV_VuotChuan:Tính tổng lương của các nhân viên vượt chuẩn.
    7. getNhanVien_Min_SanPhan:                     Lấy nhân viên có số sản phẩm ít nhất.
    8. getNhanVien_Max_Luong:                       Lấy nhân viên có lương cao nhất.
    9. getNhanVien_KhongVuotChuan_Max_Luong:        Lấy nhân viên không vượt chuẩn có lương cao nhất.
    10. TongLuongNV:                                Lấy tổng lương của tất cả nhân viên.
    11. search:                                     Tìm kiếm nhân viên theo mã nhập vào, trả về nhân viên tìm thấy.
    12. sort:                                       Sắp xếp mảng nhân viên tăng dần theo số sản phẩm.
    13. remove:                                     Xóa 1 nhân viên tại vị trí nhập vào
 */
public class DanhSachNhanVien {

    ArrayList<NhanVien> nhanViens = new ArrayList<>();

    // Biến nhân viên chỉ để xuất tiêu đề
    NhanVien nvtemp = new NhanVien();

    // Contructor
    public DanhSachNhanVien() { };

    // Khởi tạo nhanh danh sách nhân viên
    public void initNhanVien() {
        // Khởi tạo nhanh danh sách nhân viên mẫu
        nhanViens.add(new NhanVien("NV01", 1200));
        nhanViens.add(new NhanVien("NV02", 400));
        nhanViens.add(new NhanVien("NV03", 702));
        nhanViens.add(new NhanVien("NV04", 140));
        nhanViens.add(new NhanVien("NV05", 100));
        nhanViens.add(new NhanVien("NV06", 500));
        nhanViens.add(new NhanVien("NV07", 700));
        nhanViens.add(new NhanVien("NV08", 200));
    }
    // 1. Thêm nhân viên
    public void add(NhanVien nhanVien) {
        nhanViens.add(nhanVien);
    }

    // 2. Xuất danh sách nhân viên
    public void xuat() {
        System.out.println("\n--------------------------------");

        // kiểm tra danh sách nhân viên rỗng
        if (nhanViens.size() == 0) {
            System.out.println("Danh sách nhân viên rỗng");
        }
        else {
            nvtemp.XuatTieuDe();
            for (NhanVien nhanVien : nhanViens)
                System.out.println(nhanVien);
        }
    }

    // 3. Trả về tổng nhân viên
    public int size() {
        return nhanViens.size();
    }

    // 4. Xuất danh sách nhân viên vượt chuẩn
    public void ListNV_VuotChuan() {
        if (CountNhanVien_VuotChuan() == 0)
            System.out.println("Không có nhân viên nào vượt chuẩn");
        else {
            nvtemp.XuatTieuDe();
            for (NhanVien nhanVien : nhanViens)
                if (nhanVien.coVuotChuan())
                    nhanVien.xuat();
        }
    }

    // 4.1 Đếm số nhân viên có số sản phẩm vượt chuẩn.
    public int CountNhanVien_VuotChuan() {
        int count = 0;
        for (NhanVien nhanVien : nhanViens)
            if (nhanVien.coVuotChuan())
                count++;

        return count;
    }

    // 5. Đếm số nhân viên có số sản phẩm không vượt chuẩn.
    public int CountNhanVien_KhongVuotChuan() {
        int count = 0;
        for (NhanVien nhanVien : nhanViens)
            if (!nhanVien.coVuotChuan())
                count++;

        return count;
    }

    // 6. Tính tổng lương của các nhân viên vượt chuẩn.
    public long TongLuongNV_VuotChuan() {
        long sumLuong = 0;
        for (NhanVien nhanVien : nhanViens)
            if (nhanVien.coVuotChuan())
                sumLuong += nhanVien.getLuong();

        return sumLuong;
    }

    // 7. Lấy nhân viên có số sản phẩm ít nhất.
    public NhanVien getNhanVien_Min_SanPhan() {
        // vị trí của nhân viên có số sản phẩm ít nhất
        int vitri_minNhanVien = 0;
        for (NhanVien nhanVien : nhanViens)
            if (nhanVien.getSoSP() < nhanViens.get(vitri_minNhanVien).getSoSP())
                vitri_minNhanVien = nhanViens.indexOf(nhanVien);

        return nhanViens.get(vitri_minNhanVien);
    }

    // 8. Lấy nhân viên có lương cao nhất.
    public NhanVien getNhanVien_Max_Luong() {
        // vị trí của nhân viên có lương cao nhất
        // gán vị trí nhân viên đầu tiên tạm thời lớn nhất
        int vitri_maxNhanVien = 0;
        for (NhanVien nhanVien : nhanViens)
            if (nhanVien.getLuong() > nhanViens.get(vitri_maxNhanVien).getLuong())
                vitri_maxNhanVien = nhanViens.indexOf(nhanVien);

        return nhanViens.get(vitri_maxNhanVien);
    }

    // 9. Lấy nhân viên không vượt chuẩn có lương cao nhất
    public NhanVien getNhanVien_KhongVuotChuan_Max_Luong() {
        // vị trí của nhân viên có số sản phẩm ít nhất
        // không tìm thấy nhân viên không vượt chuẩn: -1
        int vitri_maxNhanVien = -1;

        // Tìm kiếm vị trí của nhân viên không vượt chuẩn đầu tiên
        for (NhanVien nhanVien : nhanViens)
            // lưu vị trí nv không vượt chuẩn
            if (!nhanVien.coVuotChuan()) {
                vitri_maxNhanVien = nhanViens.indexOf(nhanVien);
                break;
            }

        // không tìm thấy nhân viên vượt chuẩn, trả lại nhân viên rỗng
        if (vitri_maxNhanVien == -1)
            return new NhanVien();

        // Kiểm tra các nhân viên có không vượt chuẩn và max lương không
        for (int i = vitri_maxNhanVien + 1; i < nhanViens.size(); i++)
            // nếu không vượt chuẩn
            if (!nhanViens.get(i).coVuotChuan())
                // nếu lương lớn hơn
                if (nhanViens.get(i).getLuong() > nhanViens.get(vitri_maxNhanVien).getLuong())
                    // gán vị trí nhân viên có lương lớn hơn
                    vitri_maxNhanVien = i;

        return nhanViens.get(vitri_maxNhanVien);
    }

    // 10. Lấy tổng lương của tất cả nhân viên.
    public long TongLuongNV() {
        long sumLuong = 0;
        for (NhanVien nhanVien : nhanViens)
            sumLuong += nhanVien.getLuong();

        return sumLuong;
    }

    // 11. Tìm kiếm nhân viên theo mã nhập vào, trả về nhân viên tìm thấy.
    public NhanVien search(String maNV) {
        for (NhanVien nhanVien : nhanViens)
            // nếu tìm được nhân viên có mã nv đó
            if (nhanVien.getMaNV().equals(maNV))
                return nhanVien;

        // không tìm thấy mã nhân viên nhập vào, trả về nhân viên rỗng
        return new NhanVien();
    }

    // 12. Sắp xếp mảng nhân viên tăng dần theo số sản phẩm.
    // bubbleSort
    public void sort() {

        // tổng số nhân viên
        int n = nhanViens.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nhanViens.get(j).getSoSP() > nhanViens.get(j+1).getSoSP())
                {
                    // swap arr[j+1] and arr[j]
                    NhanVien temp = nhanViens.get(j);
                    nhanViens.set(j, nhanViens.get(j+1));
                    nhanViens.set(j+1, temp);
                }
    }

    // 13. Xóa 1 nhân viên tại vị trí nhập vào.
    public void remove(int vitri) {
        if (vitri < nhanViens.size()) {
            nhanViens.remove(vitri);
            System.out.println("Xóa nhân viên thành công!");
        }
        else
            System.out.println("Vị trí nhập vào không nằm trong vùng cần xóa!");
    }

}
