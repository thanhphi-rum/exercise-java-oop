/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 7, 2025 3:11:53 PM
 */

package chuong0102;

public class Bai7 {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		System.out.println("Value 1 == Value 2:" + (value1 == value2)); // 1 = 2 -> F
		System.out.println("Value 1 != Value 2:" + (value1 != value2)); // 1 != 2 -> T
		System.out.println("Value 1 > Value 2:" + (value1 > value2)); // 1 > 2 -> F
		System.out.println("Value 1 < Value 2:" + (value1 < value2)); // 1 < 2 -> T
		System.out.println("Value 1 >= Value 2:" + (value1 >= value2)); // 1 >= 2 -> F
		System.out.println("Value 1 <= Value 2:" + (value1 <= value2)); // 1 <= 2 -> T
		System.out.println("Value 1 <= Value 2 && Value 1 == Value 2:" + 
							((value1 <= value2) && (value1 == value2))); // (1 <= 2) && (1 = 2) -> F
		System.out.println("Value 1 <= Value 2 || Value 1 == Value 2:" +
				((value1 <= value2) || (value1 == value2))); // (1 <= 2) || (1 = 2) -> T
	}
}

