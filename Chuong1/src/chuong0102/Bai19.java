/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 3:48:22 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String inputString = sc.nextLine();
		int count = 0;
		for(int i = 0; i < inputString.length(); i++) {
			char kyTuHienTai = inputString.charAt(i);
			if(kyTuHienTai == 'a') {
				count++;
			}
		}
		System.out.println("So lan xuat hien cua ktu 'a' trong chuoi: " + count);
	}
}

