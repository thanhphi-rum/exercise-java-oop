/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 22, 2025 8:43:50 PM
 */

package chuong03.bai04;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private int accountNumber;
	private String accountName;
	private double balance;
	private AccountStatus status;
	
	public final double interesRate = 0.035;
	
	


	public Account() {
		this(999999, "Khong xac dinh", 50, AccountStatus.ACTIVE);
	}


	public Account(int accountNumber, String accountName, double balance, AccountStatus active) {
		setAccountNumber(accountNumber);
		setAccountName(accountName);
		setBalance(balance);
		setStatus(status);
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		if(accountNumber <= 0 && accountNumber == 999999) {
			accountNumber = 999999;
		}
		this.accountNumber = accountNumber;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		if(accountName == null || accountName.isEmpty()) {
			accountName = "nameless";
		}
		this.accountName = accountName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		if(balance < 50) {
			balance = 50;
		}
		this.balance = balance;
	}
	
	public AccountStatus getStatus() {
		return status;
	}


	public void setStatus(AccountStatus status) {
		if(status == null || !(status instanceof AccountStatus)) {
			status = AccountStatus.ACTIVE;
		}
		this.status = status;
	}


	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%-10s | %-20s | %10s |", 
				accountNumber, 
				accountName, 
				nf.format(balance));
	}
	
	public double deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return amount;
		}
		return -1;
	}
	
	public double withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			return amount;
		}
		return -1;
	}
	
	public double transfer(Account other, double amount) {
		if(this.withdraw(amount) > 0) {
			other.deposit(amount);
			return amount;
		}
		return -1;
	}

	public double interesDue() {
		double interes = balance * interesRate;
		balance += interes;
		return interes;
	}
}

