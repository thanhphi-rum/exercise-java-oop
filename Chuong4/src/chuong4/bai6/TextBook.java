/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 8:01:04 PM
 */

package chuong4.bai6;

import java.time.LocalDate;

public class TextBook extends Book{
	private BookStatus status;
	
	public TextBook() {
		super();
	}
	
	public TextBook(String code, LocalDate importedDate, double unitPrice, int quantity, String publisher,
			BookStatus status) {
		super(code, importedDate, unitPrice, quantity, publisher);
		setStatus(status);
	}



	public BookStatus getStatus() {
		return status;
	}



	public void setStatus(BookStatus status) {
		this.status = status;
	}



	@Override
	public double calculatePrice() {
		double rate = status == BookStatus.NEW ? 1 : 0.5;
		return quantity * unitPrice * rate;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s", super.toString(), status);
	}
}

