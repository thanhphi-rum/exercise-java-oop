/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 3:52:30 PM
 */

package chuong4.bai11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // 1. Khởi tạo kho hàng
        KhoHang kho = new KhoHang();
        kho.setDanhSach(new ArrayList<>());

        // 2. Tạo và thêm các mặt hàng mẫu vào kho
        System.out.println("--- Them cac mat hang vao kho ---");

        HangHoa tp1 = new HangThucPham("TP01", "Sua tuoi Vinamilk", 50, 7000,
                LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 20), "Vinamilk");
        HangHoa tp2 = new HangThucPham("TP02", "Mi Hao Hao", 100, 3500,
                LocalDate.of(2025, 9, 15), LocalDate.of(2026, 3, 15), "Acecook");
        HangHoa tp3 = new HangThucPham("TP03", "Banh mi het han", 10, 15000,
                LocalDate.of(2025, 10, 1), LocalDate.of(2025, 10, 5), "ABC Bakery"); // Hàng hết hạn

        HangHoa dm1 = new HangDienMay("DM01", "Tu lanh Panasonic", 2, 8000000, 24, 125);
        HangHoa dm2 = new HangDienMay("DM02", "May giat LG", 15, 12000000, 36, 200);

        HangHoa ss1 = new HangSanhSu("SS01", "Chen su Minh Long", 60, 25000,
                "Minh Long", LocalDate.of(2025, 8, 20)); // Tồn kho > 50, lưu kho > 10 ngày
        HangHoa ss2 = new HangSanhSu("SS02", "To su Bat Trang", 30, 45000,
                "Bat Trang", LocalDate.now());

        kho.them(tp1);
        kho.them(tp2);
        kho.them(tp3);
        kho.them(dm1);
        kho.them(dm2);
        kho.them(ss1);
        kho.them(ss2);

        // 3. In toàn bộ danh sách hàng hóa
        System.out.println("\n--- Danh sach hang hoa trong kho ---");
        kho.getDanhSach().forEach(System.out::println);

        // 4. Cập nhật thông tin hàng hóa
        System.out.println("\n--- Cap nhat thong tin hang hoa (Ma: DM01) ---");
        kho.capNhat("DM01", "Tu lanh Panasonic", 5, 8500000, 24, 130);
        System.out.println("Thong tin sau khi cap nhat:");
        kho.getDanhSach().stream()
                .filter(h -> h.getMa().equals("DM01"))
                .forEach(System.out::println);

        // 5. Tìm kiếm hàng hóa
        // 5.1. Tìm kiếm theo tên (từ khóa "sua")
        System.out.println("\n--- Tim kiem hang hoa theo ten 'sua' ---");
        List<HangHoa> kqTimKiem1 = kho.timKiem1("sua");
        kqTimKiem1.forEach(System.out::println);

        // 5.2. Tìm kiếm hàng có số lượng tồn > 55
        System.out.println("\n--- Tim kiem hang hoa co so luong ton > 55 ---");
        List<HangHoa> kqTimKiem2 = kho.timKiem2(55);
        kqTimKiem2.forEach(System.out::println);

        // 5.3. Thống kê hàng hóa theo loại
        System.out.println("\n--- Thong ke san pham theo loai hang ---");
        Map<String, Set<HangHoa>> kqTimKiem3 = kho.timKiem3();
        kqTimKiem3.forEach((loaiHang, dsHang) -> {
            System.out.println("* Loai: " + loaiHang);
            dsHang.forEach(h -> System.out.println("  - " + h));
        });

        // 5.4. Thống kê và sắp xếp theo tên
        System.out.println("\n--- Thong ke san pham theo loai hang (sap xep theo ten) ---");
        Map<String, Set<HangHoa>> kqTimKiem4 = kho.timKiem4();
        kqTimKiem4.forEach((loaiHang, dsHang) -> {
            System.out.println("* Loai: " + loaiHang);
            dsHang.forEach(h -> System.out.println("  - " + h));
        });


        // 6. Đánh giá mức độ bán của từng sản phẩm
        System.out.println("\n--- Danh gia muc do buon ban cua tung san pham ---");
        for (HangHoa hh : kho.getDanhSach()) {
            System.out.printf("Ma hang: %s - Ten: %s - Muc do: %s\n",
                    hh.getMa(), hh.getTen(), hh.mucDoBuonBan());
        }
    }
}

