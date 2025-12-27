/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 12, 2025 3:04:26 PM
 */

package chuong0102;

import java.util.Scanner;

public class Bai29 {
	public static void hinhA(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
	           System.out.print("* ");
	        }
	           System.out.println();
	        }
	    }

	public static void hinhB(int n) {
		for (int i = n; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("* ");
	        }
	            System.out.println();
	        }
	    }

	public static void hinhD(int n) {
	   for (int i = 1; i <= n; i++) {
	        for (int j = i; j < n; j++) {
	            System.out.print(" ");
	        }
	        for (int j = 1; j <= 2 * i - 1; j++) {
	            if (j == 1 || j == 2 * i - 1 || i == n) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap M: ");
	        int m = sc.nextInt();

	        System.out.print("Nhap N: ");
	        int n = sc.nextInt();

	        System.out.println("\nHinh a:");
	        hinhA(m);

	        System.out.println("\nHinh b:");
	        hinhB(m);

	        System.out.println("\nHinh d:");
	        hinhD(n);

	        sc.close();
	    }
}

