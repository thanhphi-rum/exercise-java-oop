/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 12, 2025 2:45:59 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai27 {
	public static void Fibo(int n) {
		if(n <= 0) {
			System.out.println("Khong co so nao");
			return;
		}
		long f0 = 0;
		long f1 = 1;
		long fn;
		for(int i = 1; i <= n; i++) {
			System.out.println(f1 + " ");
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		System.out.println(n + " so dau tien cua fibo");
		Fibo(n);
	}
}

