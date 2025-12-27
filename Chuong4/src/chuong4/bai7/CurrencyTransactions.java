/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 9:05:33 PM
 */

package chuong4.bai7;

import java.time.LocalDate;

public class CurrencyTransactions extends Transaction{
	private ExchangeRate exRate;
	private double rate;

	
	public CurrencyTransactions() {
		super();
	}

	public CurrencyTransactions(String code, LocalDate transactionDate, 
			double unitPrice, int quantity,
			double rate, ExchangeRate exRate) {
		super(code, transactionDate, unitPrice, quantity);
		setExRate(exRate);
		setRate(rate);
	}

	public ExchangeRate getExRate() {
		return exRate;
	}

	public void setExRate(ExchangeRate exRate) {
		this.exRate = exRate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
    public double calculatePrice() {
        // USD/EURO: thành tiền = số lượng * đơn giá * tỉ giá
        // VN:       thành tiền = số lượng * đơn giá
        if (exRate == ExchangeRate.USD || exRate == ExchangeRate.EURO) {
            return quantity * unitPrice * rate;
        }
        return quantity * unitPrice;
    }
	
	@Override
	public String toString() {
		return String.format("%s | %s", super.toString(), exRate);
	}
}

