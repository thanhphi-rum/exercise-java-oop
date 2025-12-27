/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 17, 2025 8:57:06 AM
 */

package chuong03.bai03b;

public enum ProductType {
	PACKAGE ("Đóng Gói"),
	MEAT ("Thịt"),
	VEGETABLE ("Rau");
	
	private String text;
	
	private ProductType(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
}

