/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 7, 2025 2:50:18 PM
 */

package chuong0102;

public class Bai6 {
	public static void main(String[] args) {
		int result = 1 + 2;
		result = result - 1;
		result = result * 2;
		result = result / 2;
		result = result + 8;
		result = result % 7;
		System.out.println("Final result: " + result);
		
		String firstString = "This is ";
		String secondString = "a concatenated string ";
		String thirString = firstString + secondString;
		System.out.println(thirString);
		
		int result1 = +1;
		System.out.println(result1);
		result1--;
		System.out.println(result1);
		result1++;
		System.out.println(result1);
		result1 = -result1;
		System.out.println(result1);
		boolean success = false;
		System.out.println(!success);
		System.out.println(success);
		
		int i = 3;
		i++; // i = 4
		System.out.println(i); // 4
		++i; // i = 5
		System.out.println(i); // 5
		System.out.println(++i); // tang truoc in sau i = 6 - in 6
		System.out.println(i++); // in truoc tang sau in 6 - i = 7
		System.out.println(--i); // giam truoc in sau i = 6 - in 6
		System.out.println(i--); // in truoc giam sau in 6 - i = 5
		System.out.println(i); // i = 5
	}
}

