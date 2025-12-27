/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 2:22:39 PM
 */

package chuong4.bai5;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class ChuyenXe {
	protected String maChuyen;
	protected String tenTaiXe;
	protected String soXe;
	protected double doanhThu;
	
	public ChuyenXe(String maChuyen, String tenTaiXe, String soXe, 
			double doanhThu) {
		setMaChuyen(maChuyen);
		setTenTaiXe(tenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}

	public String getMaChuyen() {
		return maChuyen;
	}

	public void setMaChuyen(String maChuyen) {
		if(maChuyen == null || maChuyen.isEmpty()) {
			throw new IllegalArgumentException("Ma chuyen xe khong duoc de trong");
		}
		this.maChuyen = maChuyen;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		if(tenTaiXe == null || tenTaiXe.isEmpty()) {
			throw new IllegalArgumentException("Ten tai xe khong duoc de trong");
		}
		this.tenTaiXe = tenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		if(soXe == null || soXe.isEmpty()) {
			throw new IllegalArgumentException("So xe khong de trong");
		}
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		if(doanhThu < 0) {
			throw new IllegalArgumentException("Doanh thu khong duoc am");
		}
		this.doanhThu = doanhThu;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%10s | %20s | %10s | %10s", 
				maChuyen, 
				tenTaiXe, 
				soXe, 
				nf.format(doanhThu)
				);
	}
}

