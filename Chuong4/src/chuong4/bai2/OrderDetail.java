/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 13, 2025 3:31:53 PM
 */

package chuong4.bai2;

import java.text.NumberFormat;
import java.util.Locale;

public class OrderDetail {
	private Product product;
	private int quantity;
	
	public OrderDetail() {
		super();
	}

	public OrderDetail(Product product, int quantity) {
		setQuantity(quantity);
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			throw new IllegalArgumentException("Quantity not < 0");
		}
		this.quantity = quantity;
	}
	
	public double calcTotalPrice() {
		return quantity * product.getPrice();
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%s | %10s | %10s", 
				super.toString(), 
				quantity, 
				nf.format(calcTotalPrice())
				);
	}
}

