/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 13, 2025 3:20:55 PM
 */

package chuong4.bai2;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {
	private String productId;
	private String description;
	private double price;
	
	public Product() {
		this("000000", "Unidentified", 1.0);
	}

	public Product(String productId, String description, double price) {
		setProductId(productId);
		setPrice(price);
		setDescription(description);
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		if(productId == null || productId.isEmpty()) {
			throw new IllegalArgumentException("ProductId not null");
		}
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if(description == null || description.isEmpty()) {
			throw new IllegalArgumentException("Description not null");
		}
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Price not < 0");
		}
		this.price = price;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%10s | %20s | %10s", 
				productId, 
				description, 
				nf.format(price)
				);
	}
}

