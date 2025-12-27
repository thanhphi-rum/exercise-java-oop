/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 9:23:05 PM
 */

package chuong4.bai7;

public enum ExchangeRate {
	VIETNAM ("Tiền Việt Nam"),
	USD ("Tiền USD"),
	EURO ("Tiền Euro");
	
	private String description;
	
	private ExchangeRate(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}

