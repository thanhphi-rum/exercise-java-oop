/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 2:53:51 PM
 */

package chuong0102;

public class Bai15 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Vui long nhap lai !");
			return;
		}
		try {
			int max = Integer.parseInt(args[0]);
			int min = Integer.parseInt(args[0]);
			for(int i = 1; i < args.length; i++) {
				int soHienTai = Integer.parseInt(args[i]);
				if(soHienTai > max) {
					max = soHienTai;
				}
				if(soHienTai < min) {
					min = soHienTai;
				}
			}
			System.out.println("Max = " + max);
			System.out.println("Min = " + min);
		}catch (NumberFormatException e) {
			System.out.println("Loi !");
		}
	}
}

