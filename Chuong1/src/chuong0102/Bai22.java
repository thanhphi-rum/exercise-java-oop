/**
 * @description: check prime
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 9:14:21 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai22 {
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
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("La so nguyen to");
		}
		else {
			System.out.println("Khong phai la so nguyen to");
		}
	}
}

