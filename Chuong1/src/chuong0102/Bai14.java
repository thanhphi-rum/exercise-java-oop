/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 2:21:25 PM
 */

package chuong0102;

public class Bai14 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Vui long nhap lai !");
			return;
		}
		try {
			int n = Integer.parseInt(args[0]);
			long sum = 0;
			System.out.println("In ra so vua nhap: " + n);
			
			if(n % 2 == 0) {
				for(int i = 1; i <= n; i += 2) {
					sum += i;
				}
			}
			else {
				for(int i = 2; i <= n; i += 2) {
					sum += i;
				}
			}
			System.out.println("Sum : " + sum);
		}
		catch (NumberFormatException e) {
			System.out.println("Loi !");
		}
	}
}

