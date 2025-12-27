/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 12, 2025 2:59:42 PM
 */

package chuong0102;

public class Bai28 {

	    public static void main(String[] args) {
	        int size = 9;

	        System.out.println("--- Hình 1 (for) ---");
	        veHinh1(size);

	        System.out.println("\n--- Hình 2 (while) ---");
	        veHinh2(size);

	        System.out.println("\n--- Hình 3 (do-while) ---");
	        veHinh3(size, size);
	    }

	    public static void veHinh1(int height) {
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < height; j++) {
	                if (j == 0 || i == height - 1 || j == i / 2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public static void veHinh2(int size) {
	        int i = 0;
	        while (i < size) {
	            int j = 0;
	            while (j < size) {
	                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || j == size / 3 || j == size * 2 / 3 - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	    }

	    public static void veHinh3(int height, int width) {
	        int i = 0;
	        do {
	            int j = 0;
	            do {
	                if (i == j || i + j == height - 1 || i == height / 2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	                j++;
	            } while (j < width);
	            System.out.println();
	            i++;
	        } while (i < height);
	   }
}

