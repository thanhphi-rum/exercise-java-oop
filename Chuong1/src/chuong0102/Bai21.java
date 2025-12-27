/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 9:07:15 PM
 */

package chuong0102;

public class Bai21 {
	public static void main(String[] args) {
		String s = "Bai Tap Mon Lap Trinh Java";
		String[] words = s.split("\\s+");
		System.out.println("Chuoi goc: " + s);
		System.out.println("Chuoi sau khi tach:");
		for (String word : words) {
			System.out.println(word);
		}
	}
}

