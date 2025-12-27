/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 9:32:07 PM
 */

package chuong0102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai24 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Ban muon bao nhieu so nguyen: ");
			int n = sc.nextInt();
			
			if(n <= 0) {
				System.out.println("Vui long nhap lai !");
				return;
			}
			long sum = 0;
			for(int i = 1; i <= n; i++) {
				System.out.println("Nhap so nguyen thu " + i + ": ");
				int res = sc.nextInt();
				sum += res;
			}
			System.out.println("Tong = " + sum);
		}
		catch (InputMismatchException e) {
			System.out.println("Loi !");
		}
	}
}

