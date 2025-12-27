/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 9:06:27 PM
 */

package chuong4.bai7;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Transaction {
	protected final String code;
	protected LocalDate transactionDate;
	protected double unitPrice;
	protected int quantity;
	
	public Transaction() {
		this("999", LocalDate.now(), 1, 0);
	}

	public Transaction(String code, LocalDate transactionDate, double unitPrice, int quantity) {
		if(code == null || code.isEmpty()) {
			code = "999";
		}
		this.code = code;
		setTransactionDate(transactionDate);
		setUnitPrice(unitPrice);
		setQuantity(quantity);
	}
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		if(transactionDate.isAfter(LocalDate.now())) {
			transactionDate = LocalDate.now();
		}
		this.transactionDate = transactionDate;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		if(unitPrice <= 0) {
			unitPrice = 1;
		}
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity < 0) {
			quantity = 0;
		}
		this.quantity = quantity;
	}
	public String getCode() {
		return code;
	}
	
	public abstract double calculatePrice();
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%5s | %15s | %15s | %15s |", 
				code, 
				dtf.format(transactionDate), 
				nf.format(unitPrice), 
				quantity);
	}
}

