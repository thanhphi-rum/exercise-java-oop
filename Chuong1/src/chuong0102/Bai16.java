/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 3:07:36 PM
 */

package chuong0102;

public class Bai16 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Vui long nhap lai !");
			return;
		}
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			System.out.println("Giai phuong trinh:" + a + "x + " + b + " = 0");
			
			if(a != 0) {
				double x = -b / a;
				System.out.println("Phuong trinh co 1 nghiem duy nhat la x = " + x);
			}
			else {
				if(b == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				}
				else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
		}catch (NumberFormatException e) {
			System.out.println("Loi !");
		}
	}
}

