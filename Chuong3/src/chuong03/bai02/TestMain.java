/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 22, 2025 7:25:17 PM
 */

package chuong03.bai02;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student(111111, "Bui Nguyen Thanh Phi", 8.0f, 9.0f);
		Student st2 = new Student(222222, "Le Nguyen Thanh Phi", 7.0f, 10.0f);
		
		Student st3 = new Student();
		System.out.println("Nhap ma so sinh vien: ");
		int studentId = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		String studentName = sc.nextLine();
		System.out.println("Nhap diem ly thuyet: ");
		double diemLyThuyet = sc.nextDouble();
		System.out.println("Nhap diem thuc hanh: ");
		double diemThucHanh = sc.nextDouble();
		
		st3.setStudentId(studentId);
		st3.setStudentName(studentName);
		st3.setDiemLyThuyet(diemLyThuyet);
		st3.setDiemThucHanh(diemThucHanh);
		
		System.out.println(String.format("%-10s | %-20s | %10s | %10s | %10s |", 
				"StudentId", "StudentName", "DiemLT", "DiemTH", "DiemTB"));
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}
}

