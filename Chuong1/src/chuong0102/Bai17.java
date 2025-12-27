/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 3:30:50 PM
 */

package chuong0102;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		try {
			int n = sc.nextInt();
			if(n == 0) {
				System.out.println("n la so zero");
			}
			else if(n % 2 == 0) {
				System.out.println("n la so chan");
			}
			else {
				System.out.println("n la so le");
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Loi ! Vui long nhap so nguyen");
		}
	}
}

