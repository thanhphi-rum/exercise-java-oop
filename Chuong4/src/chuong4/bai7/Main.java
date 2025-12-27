/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 12, 2025 3:56:06 PM
 */

package chuong4.bai7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Transaction> ds = new ArrayList<>();

        // Mẫu dữ liệu
        ds.add(new GoldTrading("V001", LocalDate.of(2025,10,10), 5_600_000, 5, "9999"));
        ds.add(new GoldTrading("V002", LocalDate.of(2025,10,11), 5_200_000, 3, "24K"));

        ds.add(new CurrencyTransactions("T001", LocalDate.of(2025,10,12), 23000, 1000, 1, ExchangeRate.VIETNAM));
        ds.add(new CurrencyTransactions("T002", LocalDate.of(2025,10,12), 23, 5000, 25000, ExchangeRate.USD));
        ds.add(new CurrencyTransactions("T003", LocalDate.of(2025,10,13), 25, 7000, 27000, ExchangeRate.EURO));


        System.out.println("=== DANH SÁCH GIAO DỊCH ===");
        ds.forEach(System.out::println);

        // Tổng số lượng từng loại
        int tongVang = 0, tongTienTe = 0;
        for (Transaction t : ds) {
            if (t instanceof GoldTrading) tongVang += t.getQuantity();
            if (t instanceof CurrencyTransactions) tongTienTe += t.getQuantity();
        }
        System.out.println("\nTổng SL giao dịch vàng: " + tongVang);
        System.out.println("Tổng SL giao dịch tiền tệ: " + tongTienTe);

        // Trung bình thành tiền của giao dịch tiền tệ
        double sumTT = 0; int demTT = 0;
        for (Transaction t : ds) {
            if (t instanceof CurrencyTransactions) {
                sumTT += t.calculatePrice();
                demTT++;
            }
        }
        System.out.println("Trung bình thành tiền (tiền tệ): " + (demTT == 0 ? 0 : (long)(sumTT / demTT)));

        // Xuất giao dịch có đơn giá > 1 tỷ
        System.out.println("\nCác giao dịch có đơn giá > 1 tỷ:");
        ds.stream()
          .filter(t -> t.getUnitPrice() > 1_000_000_000)
          .forEach(System.out::println);
    }
}

