/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 12, 2025 2:39:10 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai26 {
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
		int count = 0;
		int i = 2;
		while(count < n) {
			if(isPrime(i)) {
				sum += i;
				count++;
				System.out.printf("%d ", i);
			}
			i++;
		}
		System.out.printf("\nTong cua n so nguyen to dau tien: %d\n", sum);
	}
}

