/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 22, 2025 8:05:52 PM
 */

package chuong03.bai03a;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Vehicle[] dsXe = new Vehicle[3];
        int luaChon;

        do {
            System.out.println("\n================== MENU ==================");
            System.out.println("1. Nhap thong tin 3 xe.");
            System.out.println("2. Xuat bang ke khai thue.");
            System.out.println("3. Thoat.");
            System.out.print(">> Chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    for (int i = 0; i < dsXe.length; i++) {
                        System.out.println("\n-- Nhap thong tin xe thu " + (i + 1) + " --");
                        System.out.print("Ten chu xe: ");
                        String ten = sc.nextLine();
                        System.out.println("The loai xe: ");
                        String tl = sc.nextLine();
                        System.out.print("Dung tich xylanh (cc): ");
                        int dt = sc.nextInt();
                        System.out.print("Tri gia xe (VND): ");
                        double tg = sc.nextDouble();
                        sc.nextLine();
						dsXe[i] = new Vehicle(ten, tl, dt, tg); 
                    }
                    System.out.println("\n>> Da nhap xong thong tin 3 xe!");
                    break;
                case 2:
                    if (dsXe[0] == null) {
                        System.out.println("!! Vui long nhap thong tin xe o chuc nang 1 truoc.");
                        break;
                    }
                    
                    System.out.printf("%-20s | %-10s | %15s | %15s | %15s |\n", 
                            "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                System.out.println("-------------------------------------------------------------------------------------------------------");

                for (Vehicle xe : dsXe) {
                
                    System.out.println(xe); 
                }
                    break;
                default:
                    System.out.println("!! Chuc nang khong hop le. Vui long chon lai.");
            }
        } while (luaChon != 3);
	}
}

