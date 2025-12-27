/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 17, 2025 8:54:32 AM
 */

package chuong03.bai03b;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public class FoodProduct {
	private String code;
	private String name;
	private double unitPrice;
	private LocalDate manufactoryDate;
	private LocalDate expiredDate;
	private ProductType type;
	
	public FoodProduct(String code) {
		this(code, "nameless", 1.0, LocalDate.now(), LocalDate.now(), ProductType.PACKAGE);
	}

	public FoodProduct(String code, String name, double unitPrice, LocalDate manufactoryDate, LocalDate expiredDate,
			ProductType type) {
		setCode(code);
		setName(name);
		setUnitPrice(unitPrice);
		setManufactoryDate(manufactoryDate);
		setExpiredDate(expiredDate);
		setType(type);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		if(code == null || code.isEmpty()) {
			code = "000000";
		}
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			name = "nameless"; 
		}
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		if(unitPrice <= 0) {
			unitPrice = 1.0;
		}
		this.unitPrice = unitPrice;
	}

	public LocalDate getManufactoryDate() {
		return manufactoryDate;
	}

	public void setManufactoryDate(LocalDate manufactoryDate) {
		if(manufactoryDate == null || manufactoryDate.isAfter(LocalDate.now())) {
			manufactoryDate = LocalDate.now();
		}
		this.manufactoryDate = manufactoryDate;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		if(expiredDate == null || manufactoryDate.compareTo(expiredDate) >= 0);
		this.expiredDate = expiredDate;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		if(type == null || type instanceof ProductType);
		this.type = type;
	}
	
	private boolean isExpired() {
		return expiredDate.isBefore(LocalDate.now());
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		DecimalFormat df = new DecimalFormat("#,##0");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yy");
		return String.format("| %-10s | %-15s | %10s | %-10 | %-10 | %-10 | %-10 |",
				code,
				name,
				df.format(unitPrice),
				type,
				nf.format(manufactoryDate),
				dtf.format(manufactoryDate),
				dtf.format(expiredDate),
				isExpired() ? "Het han" : "Con han");
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodProduct other = (FoodProduct) obj;
		return Objects.equals(code, other.code);
	}
	
	
}

