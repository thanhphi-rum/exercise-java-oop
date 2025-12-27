/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 12, 2025 5:02:04 PM
 */

package chuong4.bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void inTBThang(List<Invoice> ds, int year, int month) {
        double tong = ds.stream()
                .filter(h -> h.getInvoiceDate().getYear() == year && h.getInvoiceDate().getMonthValue() == month)
                .mapToDouble(Invoice::calculatePrice)
                .sum();

        long count = ds.stream()
                .filter(h -> h.getInvoiceDate().getYear() == year && h.getInvoiceDate().getMonthValue() == month)
                .count();

        System.out.println("\n>> Trung bình thành tiền tháng " + month + "/" + year + ":");
        if (count > 0) {
            System.out.println(String.format("Có %d hóa đơn, TB = %, .0f VND", count, tong / count));
        } else {
            System.out.println("Không có hóa đơn trong tháng này.");
        }
    }

    public static void main(String[] args) {
        List<Invoice> ds = new ArrayList<>();

        System.out.println("=== DANH SÁCH HÓA ĐƠN THUÊ PHÒNG ===");
        System.out.printf("%-6s | %-10s | %-15s | %-6s | %12s | %-10s | %14s%n",
                "Mã HD", "Ngày", "Khách hàng", "Phòng", "Đơn giá", "Thời lượng", "Thành tiền");
        System.out.println("-------------------------------------------------------------------------------");

        ds.add(new HourlyInvoice("G01", LocalDate.of(2013, 9, 1), "KH-<=24h", "P101", 50_000, 6));
        ds.add(new HourlyInvoice("G02", LocalDate.of(2013, 9, 2), "KH-25h", "P102", 60_000, 25));
        ds.add(new HourlyInvoice("G03", LocalDate.of(2013, 9, 3), "KH-30h", "P103", 70_000, 30));
        ds.add(new InvoiceByDate("N01", LocalDate.of(2013, 9, 5), "KH-<=7d", "P201", 300_000, 5));
        ds.add(new InvoiceByDate("N02", LocalDate.of(2013, 9, 10), "KH->7d", "P202", 300_000, 10));
        ds.add(new InvoiceByDate("N03", LocalDate.of(2013, 10, 1), "KH-10/2013", "P203", 350_000, 4));

        // In danh sách hóa đơn
        for (Invoice h : ds) {
            System.out.printf("%s | %,14.0f%n", h.toString(), h.calculatePrice());
        }

        long tongGio = ds.stream().filter(h -> h instanceof HourlyInvoice).count();
        long tongNgay = ds.stream().filter(h -> h instanceof InvoiceByDate).count();

        System.out.println("\nTổng hóa đơn theo giờ : " + tongGio);
        System.out.println("Tổng hóa đơn theo ngày: " + tongNgay);

        inTBThang(ds, 2013, 9);
        inTBThang(ds, 2013, 10);
    }
}
