/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 2:45:45 PM
 */

package chuong4.bai11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	
	public HangSanhSu() {
		super();
	}


	public HangSanhSu(String ma, String ten, int soLuong, double donGia, String nhaSanXuat, LocalDate ngayNhapKho) {
		super(ma, ten, soLuong, donGia);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}


	public String getNhaSanXuat() {
		return nhaSanXuat;
	}


	public void setNhaSanXuat(String nhaSanXuat) {
		if(nhaSanXuat == null || nhaSanXuat.isEmpty()) {
			nhaSanXuat = "Chua cap nhat";
		}
		this.nhaSanXuat = nhaSanXuat;
	}


	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}


	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho == null) {
			ngayNhapKho = LocalDate.now();
		}
		this.ngayNhapKho = ngayNhapKho;
	}


	@Override
	public double tinhVAT() {
		return 0.1;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%s | %15s | %15s", 
				super.toString(), 
				nhaSanXuat, 
				dtf.format(ngayNhapKho));
	}


	@Override
	public MucDoBuonBan mucDoBuonBan() {
		boolean tonKho = soLuong > 50 ? true : false;
		int luuKho = (int)ChronoUnit.DAYS.between(ngayNhapKho, LocalDate.now());
		return (tonKho && luuKho > 10) ? MucDoBuonBan.BAN_CHAM : MucDoBuonBan.KHONG;
	}
}

