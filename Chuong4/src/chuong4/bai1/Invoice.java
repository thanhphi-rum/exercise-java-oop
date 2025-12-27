/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 12, 2025 4:13:57 PM
 */

package chuong4.bai1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public abstract class Invoice {
	protected String code;
	protected LocalDate invoiceDate;
	protected String customerName;
	protected String roomCode;
	protected double unitPrice;
	
	public Invoice() {
		this("999999", LocalDate.now(), "No update", "No update", 1.0);
	}
	
	public Invoice(String code, LocalDate invoiceDate, String customerName, 
			String roomCode, double unitPrice) {
		setCode(code);
		setInvoiceDate(invoiceDate);
		setCustomerId(customerName);
		setRoomCode(roomCode);
		setUnitPrice(unitPrice);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		if(code == null || code.isEmpty()) {
			code = "999999";
		}
		this.code = code;
	}

	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerId(String customerName) {
		if(customerName == null || customerName.isEmpty()) {
			customerName = "No update";
		}
		this.customerName = customerName;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		if(roomCode == null || roomCode.isEmpty()) {
			roomCode = "No update";
		}
		this.roomCode = roomCode;
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
	
	public abstract double calculatePrice();
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%-6s | %10s | %-15s | %-6s | %12s", 
				code, 
				invoiceDate, 
				customerName, 
				roomCode, 
				nf.format(unitPrice)
				);
	}
	
}

