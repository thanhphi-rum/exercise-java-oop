/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 2:33:16 PM
 */

package chuong4.bai11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa {
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;
	
	public HangThucPham() {
		super();
		setNgaySanXuat(LocalDate.now());
		setNgayHetHan(LocalDate.now());
		setNhaCungCap("Chua cap nhat");
	}
	
	public HangThucPham(String ma, String ten, int soLuong, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan,
			String nhaCungCap) {
		super(ma, ten, soLuong, donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
		setNhaCungCap(nhaCungCap);
	}
	
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if(ngaySanXuat == null || ngaySanXuat.isAfter(LocalDate.now())) {
			ngaySanXuat = LocalDate.now();
		}
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if(ngayHetHan == null || ngayHetHan.isBefore(ngaySanXuat)) {
			ngayHetHan = ngaySanXuat;
		}
		this.ngayHetHan = ngayHetHan;
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		if(nhaCungCap == null || nhaCungCap.isEmpty()) {
			nhaCungCap = "Chua cap nhat";
		}
		this.nhaCungCap = nhaCungCap;
	}

	@Override
	public double tinhVAT() {
		return 0.05;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s | %15s | %15s | %15s", 
				super.toString(), 
				dtf.format(ngaySanXuat), 
				dtf.format(ngayHetHan), 
				nhaCungCap);
	}

	@Override
	public MucDoBuonBan mucDoBuonBan() {
		boolean tonKho = soLuong > 0 ? true : false;
		boolean hetHan = ngayHetHan.isBefore(LocalDate.now());
		return (tonKho && hetHan) ? MucDoBuonBan.KHO_BAN : MucDoBuonBan.KHONG;
	}
	
}

