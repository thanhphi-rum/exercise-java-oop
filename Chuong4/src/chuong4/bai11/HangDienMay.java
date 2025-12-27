/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 2:38:41 PM
 */

package chuong4.bai11;

public class HangDienMay extends HangHoa {
	private int baoHanh;
	private double congSuat;
	
	
	public HangDienMay() {
		super();
	}


	public HangDienMay(String ma, String ten, int soLuong, double donGia, int baoHanh, double congSuat) {
		super(ma, ten, soLuong, donGia);
		setBaoHanh(baoHanh);
		setCongSuat(congSuat);
	}


	public int getBaoHanh() {
		return baoHanh;
	}


	public void setBaoHanh(int baoHanh) {
		if(baoHanh < 0) {
			baoHanh = 0;
		}
		this.baoHanh = baoHanh;
	}


	public double getCongSuat() {
		return congSuat;
	}


	public void setCongSuat(double congSuat) {
		if(congSuat <= 0) {
			congSuat = 1;
		}
		this.congSuat = congSuat;
	}


	@Override
	public double tinhVAT() {
		return 0.1;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %15s | %15s", 
				super.toString(), 
				baoHanh, 
				congSuat);
	}


	@Override
	public MucDoBuonBan mucDoBuonBan() {
		return soLuong < 3 ? MucDoBuonBan.BAN_DUOC : MucDoBuonBan.KHONG;
	}
	
	
}

