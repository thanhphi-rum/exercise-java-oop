/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 2:50:10 PM
 */

package chuong4.bai5;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int ngayDiDuoc;
	
	public ChuyenXeNgoaiThanh(String maChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen,
			int ngayDiDuoc) {
		super(maChuyen, tenTaiXe, soXe, doanhThu);
		setNoiDen(noiDen);
		setNgayDiDuoc(ngayDiDuoc);
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		if(noiDen == null || noiDen.isEmpty()) {
			throw new IllegalArgumentException("Noi den khong duoc de trong");
		}
		this.noiDen = noiDen;
	}

	public int getNgayDiDuoc() {
		return ngayDiDuoc;
	}

	public void setNgayDiDuoc(int ngayDiDuoc) {
		if(ngayDiDuoc < 0) {
			throw new IllegalArgumentException("Ngay di duoc khong duoc am");
		}
		this.ngayDiDuoc = ngayDiDuoc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s | %20s | %10s", 
				super.toString(), 
				noiDen, 
				ngayDiDuoc);
	}
}

