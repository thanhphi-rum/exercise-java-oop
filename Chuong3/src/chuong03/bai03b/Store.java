/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 17, 2025 9:13:43 AM
 */

package chuong03.bai03b;

public class Store {
	private FoodProduct[] list;
	private int count = 0;
	
	public Store() {
		
	}
	
	public Store(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity > 0");
		}
		this.list = new FoodProduct[capacity];
	}
}

