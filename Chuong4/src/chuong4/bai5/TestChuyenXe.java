/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 2:54:38 PM
 */

package chuong4.bai5;

import java.util.Scanner;

public class TestChuyenXe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so chuyen xe: ");
        int n = Integer.parseInt(sc.nextLine());

        ChuyenXe[] ds = new ChuyenXe[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin chuyen xe thu " + (i + 1));
            System.out.println("1. Chuyen xe noi thanh");
            System.out.println("2. Chuyen xe ngoai thanh");
            System.out.print("Chon loai chuyen xe: ");
            int loai = Integer.parseInt(sc.nextLine());   // dùng nextLine()

            System.out.print("Nhap ma so chuyen: ");
            String ma = sc.nextLine();

            System.out.print("Nhap ho ten tai xe: ");
            String ten = sc.nextLine();

            System.out.print("Nhap so xe: ");
            String soXe = sc.nextLine();                  // <-- String cho tiện

            System.out.print("Nhap doanh thu: ");
            double doanhThu = Double.parseDouble(sc.nextLine());

            if (loai == 1) { // noi thanh
                System.out.print("Nhap so tuyen: ");
                int soTuyen = Integer.parseInt(sc.nextLine());

                System.out.print("Nhap so KM di duoc: ");
                double soKm = Double.parseDouble(sc.nextLine());

                ds[i] = new ChuyenXeNoiThanh(ma, ten, soXe, doanhThu, soTuyen, soKm);
            } else {         // ngoai thanh
                System.out.print("Nhap noi den: ");
                String noiDen = sc.nextLine();

                System.out.print("Nhap so ngay di duoc: ");
                int ngayDiDuoc = Integer.parseInt(sc.nextLine());

                ds[i] = new ChuyenXeNgoaiThanh(ma, ten, soXe, doanhThu, noiDen, ngayDiDuoc);
            }
        }

        System.out.println("\nDANH SACH CHUYEN XE:");
        for (ChuyenXe chuyenXe : ds) {
            System.out.println(chuyenXe); // gọi toString()
        }

        double tongNoiThanh = 0;
        double tongNgoaiThanh = 0;

        for (ChuyenXe chuyenXe : ds) {
            if (chuyenXe instanceof ChuyenXeNoiThanh) {
                tongNoiThanh += chuyenXe.getDoanhThu();
            } else if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
                tongNgoaiThanh += chuyenXe.getDoanhThu();
            }
        }

        System.out.println("\nTong doanh thu NOI THANH : " + tongNoiThanh);
        System.out.println("Tong doanh thu NGOAI THANH: " + tongNgoaiThanh);

        sc.close();
    }
}
