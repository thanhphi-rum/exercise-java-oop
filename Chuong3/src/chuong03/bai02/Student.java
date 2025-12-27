/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 22, 2025 7:16:15 PM
 */

package chuong03.bai02;

public class Student {
	private int studentId;
	private String studentName;
	private double diemLyThuyet;
	private double diemThucHanh;
	
	public Student() {
		this(000000, "nameless", 0.0, 0.0);
	}

	public Student(int studentId, String studentName, double diemLyThuyet, double diemThucHanh) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(double diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public double getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(double diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}
	
	public double diemTrungBinh() {
		return (diemLyThuyet + diemThucHanh) / 2;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %10.3f | %10.3f | %10.3f |", 
				studentId, 
				studentName, 
				diemLyThuyet, 
				diemThucHanh,
				diemTrungBinh());
	}
}

