/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 7:46:29 PM
 */

package chuong4.bai6;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

public abstract class Book {
	protected final String code;
	protected LocalDate importedDate;
	protected double unitPrice;
	protected int quantity;
	protected String publisher;
	
	public Book() {
		this("999", LocalDate.now(), 1, 0, "Unidentified");
	}
	public Book(String code, LocalDate importedDate, double unitPrice, int quantity, String publisher) {
		if(code == null || code.isEmpty()) {
			code = "999";
		}
		this.code = code;
		setImportedDate(importedDate);
		setUnitPrice(unitPrice);
		setQuantity(quantity);
		setPublisher(publisher);
	}
	public LocalDate getImportedDate() {
		return importedDate;
	}
	public void setImportedDate(LocalDate importedDate) {
		if(importedDate.isAfter(LocalDate.now())) {
			importedDate = LocalDate.now();
		}
		this.importedDate = importedDate;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		if(unitPrice < 0) {
			unitPrice = 1;
		}
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity <= 0) {
			quantity = 0;
		}
		this.quantity = quantity;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		if(publisher == null || publisher.isEmpty()) {
			publisher = "Unidentified";
		}
		this.publisher = publisher;
	}
	public String getCode() {
		return code;
	}
	
	public abstract double calculatePrice();
	
	
	
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
		Book other = (Book) obj;
		return Objects.equals(code, other.code);
	}
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%5s | %15s | %15s | %15s | %15s |", 
				code, 
				dtf.format(importedDate), 
				nf.format(unitPrice), 
				quantity, 
				publisher);
	}
}

