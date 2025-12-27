/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 8:01:26 PM
 */

package chuong4.bai6;

public enum BookStatus {
	NEW ("Mới"),
	OLD ("Cũ");
	
	private String description;
	
	private BookStatus(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}

