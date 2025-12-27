/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 2:40:33 PM
 */

package chuong4.bai5;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private double soKmDiDuoc;
	
	public ChuyenXeNoiThanh(String maChuyen, String tenTaiXe, String soXe, 
			double doanhThu, int soTuyen, double soKmDiDuoc) {
		super(maChuyen, tenTaiXe, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKmDiDuoc(soKmDiDuoc);
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		if(soTuyen < 0) {
			throw new IllegalArgumentException("So tuyen khong duoc am");
		}
		this.soTuyen = soTuyen;
	}

	public double getSoKmDiDuoc() {
		return soKmDiDuoc;
	}

	public void setSoKmDiDuoc(double soKmDiDuoc) {
		if(soKmDiDuoc < 0) {
			throw new IllegalArgumentException("So KM di duoc khong duoc am");
		}
		this.soKmDiDuoc = soKmDiDuoc;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %10s | %10s", 
				super.toString(), 
				soTuyen, 
				soKmDiDuoc);
	}
}

