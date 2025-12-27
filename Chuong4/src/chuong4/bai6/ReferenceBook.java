/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 8:07:38 PM
 */

package chuong4.bai6;

import java.time.LocalDate;

public class ReferenceBook extends Book{
	private double tax;

	
	public ReferenceBook() {
		super();
	}
	
	public ReferenceBook(String code, LocalDate importedDate, double unitPrice, int quantity, String publisher,
			double tax) {
		super(code, importedDate, unitPrice, quantity, publisher);
		setTax(tax);
	}




	public double getTax() {
		return tax;
	}




	public void setTax(double tax) {
		this.tax = tax;
	}




	@Override
	public double calculatePrice() {
		return quantity * unitPrice + tax;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s", super.toString(), tax);
	}
}

