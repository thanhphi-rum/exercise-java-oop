/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 24, 2025 7:22:22 AM
 */

package chuong03.bai04;

public enum AccountStatus {
	ACTIVE ("Dang hoat dong"),
	INACTIVE ("Khong hoat dong"),
	CLOSED ("Da dong");
	
	private String value;
	
	private AccountStatus(String text) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}

