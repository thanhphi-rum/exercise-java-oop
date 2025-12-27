/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 12, 2025 2:29:02 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai25 {
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		long sum = 0;
		for(int i = 2; i < n; i++) {
			if(isPrime(i)) {
				sum += i;
				System.out.printf("%d ", i);
			}
		}
		System.out.printf("\nTong cac so nguyen to < n: %d", sum);
	}
}

