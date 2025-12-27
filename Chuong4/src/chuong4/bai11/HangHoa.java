/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 2:22:49 PM
 */

package chuong4.bai11;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class HangHoa {
	protected final String ma;
	protected String ten;
	protected int soLuong;
	protected double donGia;
	
	
	
	public HangHoa() {
		this("999999", "Chua cap nhat", 0, 1);
	}



	public HangHoa(String ma, String ten, int soLuong, double donGia) {
		this.ma = "";
		if(ma == null || ma.isEmpty()) {
			ma = "999999";
		}
		setTen(ten);
		setSoLuong(soLuong);
		setDonGia(donGia);
	}



	public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		if(ten == null || ten.isEmpty()) {
			ten = "Chua cap nhat";
		}
		this.ten = ten;
	}



	public int getSoLuong() {
		return soLuong;
	}



	public void setSoLuong(int soLuong) {
		if(soLuong < 0) {
			soLuong = 0;
		}
		this.soLuong = soLuong;
	}



	public double getDonGia() {
		return donGia;
	}



	public void setDonGia(double donGia) {
		if(donGia <= 0) {
			donGia = 1;
		}
		this.donGia = donGia;
	}



	public String getMa() {
		return ma;
	}
	
	public abstract double tinhVAT();
	public abstract MucDoBuonBan mucDoBuonBan();
	
	@Override
	public String toString() {
		DecimalFormat df1 = new DecimalFormat("#,##0 VND");
		DecimalFormat df2 = new DecimalFormat("#,00%");
		return String.format("%-6s | %-20s | %15s | %15s | %15s |", 
				ma, 
				ten, 
				soLuong, 
				df1.format(donGia), 
				df2.format(tinhVAT())
				);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ma);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		HangHoa other = (HangHoa) obj;
		return Objects.equals(ma, other.ma);
	}
	
	
	
}

