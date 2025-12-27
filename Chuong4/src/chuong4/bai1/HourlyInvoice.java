/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 12, 2025 4:37:11 PM
 */

package chuong4.bai1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class HourlyInvoice extends Invoice {
	private int numOfHours;

	public HourlyInvoice() {
		super();
	}

	public HourlyInvoice(String code, LocalDate invoiceDate, String customerName, String roomCode, double unitPrice,
			int numOfHours) {
		super(code, invoiceDate, customerName, roomCode, unitPrice);
		this.numOfHours = numOfHours;
	}

	
	public int getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(int numOfHours) {
		if(numOfHours <= 0) {
			numOfHours = 1;
		} 
		this.numOfHours = numOfHours;
	}

	@Override
	public double calculatePrice() {
		if (numOfHours > 30) {
            return 0; 
        } else if (numOfHours > 24) {
        	numOfHours = 24;
        }
		return numOfHours * unitPrice;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %-10s", 
				super.toString(), 
				numOfHours);
	}
}

