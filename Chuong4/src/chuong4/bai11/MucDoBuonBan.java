/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 2:51:11 PM
 */

package chuong4.bai11;

public enum MucDoBuonBan {
	BAN_DUOC ("Ban duoc"),
	BAN_CHAM ("Ban cham"),
	KHO_BAN ("Kho ban"),
	KHONG ("Khong danh gia");
	
	private String moTa;
	
	private MucDoBuonBan(String moTa) {
		this.moTa = moTa;
	}
	
	@Override
	public String toString() {
		return moTa;
	}
}

