/**
 * @description: TODO
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: Sep 11, 2025 2:04:49 PM
 */

package chuong0102;

public class Bai13 {
	 public static void main(String[] args) {
		 if (args.length == 0) {
			 System.out.println("Lỗi: Vui lòng nhập số n.");
	         return;
	        }

	     try {
	    	 long n = Long.parseLong(args[0]);
	         long tong = n * (n + 1) / 2;

	         System.out.println("Tổng các số từ 1 đến " + n + " là: " + tong);

	        } catch (NumberFormatException e) {
	            System.out.println("Lỗi: Tham số bạn nhập không phải là một số nguyên hợp lệ.");
	        }
	    }
}

