/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 3:56:53 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi: ");
		String s = sc.nextLine();
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char kyTu = s.charAt(i);
			if(Character.isDigit(kyTu)) {
				count++;
				System.out.println(kyTu);
			}
		}
		System.out.println("So luong ky tu la so: " + count);
	}
}

