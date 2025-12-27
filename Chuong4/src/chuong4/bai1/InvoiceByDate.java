/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 12, 2025 4:52:37 PM
 */

package chuong4.bai1;

import java.time.LocalDate;

public class InvoiceByDate extends Invoice {
	private int numOfDate;
	
	public InvoiceByDate() {
		super();
	}

	public InvoiceByDate(String code, LocalDate invoiceDate, String customerName, String roomCode, double unitPrice,
			int numOfDate) {
		super(code, invoiceDate, customerName, roomCode, unitPrice);
		this.numOfDate = numOfDate;
	}

	public int getNumOfDate() {
		return numOfDate;
	}

	public void setNumOfDate(int numOfDate) {
		this.numOfDate = numOfDate;
	}

	@Override
	public double calculatePrice() {
		if (numOfDate > 7) {
            int dayOff = numOfDate - 7;
            return (7 * unitPrice) + (dayOff * unitPrice * 0.8);
        }
		return numOfDate * unitPrice;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %-10s", 
				super.toString(), numOfDate);
	}
}

