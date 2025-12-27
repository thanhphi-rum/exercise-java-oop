/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 9:04:32 PM
 */

package chuong4.bai7;

import java.time.LocalDate;

public class GoldTrading extends Transaction{
	private String goldType;
	
	public GoldTrading() {
		super();
	}

	public GoldTrading(String code, LocalDate transactionDate, double unitPrice, int quantity, String goldType) {
		super(code, transactionDate, unitPrice, quantity);
		this.goldType = goldType;
	}


	public String getGoldType() {
		return goldType;
	}


	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}


	@Override
	public double calculatePrice() {
		return quantity * unitPrice;
	}
	@Override
	public String toString() {
		return String.format("%s | %s", super.toString(), goldType);
	}
}

