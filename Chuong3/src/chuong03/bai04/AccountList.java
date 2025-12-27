/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 24, 2025 7:30:48 AM
 */

package chuong03.bai04;

import java.util.Arrays;

public class AccountList {
	private Account[] list;
	private int count = 0;
	
	public AccountList() {
		this(10);
	}
	public AccountList(int capacity) {
		if(capacity <= 0) {
			capacity = 10;
		}
		this.list = new Account[capacity];
	}
	
	public int getCount() {
		return count;
	}

	public Account[] getList() {
		return Arrays.copyOf(list, count);
	}
	
	public Account add(Account account) {
		if(account == null) {
			return null;
		}
		for (int i = 0; i < count; i++) {
			if(list[i].getAccountNumber() == account.getAccountNumber()) {
				return null;
			}
		}
		if(list.length == count) {
			list = Arrays.copyOf(list, (int)(count * 1.25));
		}
		list[count++] = account;
		return account;
	}
	
	public Account find(int number) {
		Account account = null;
		for (int i = 0; i < count; i++) {
			if(list[i].getAccountNumber() == number) {
				account = list[i];
			}
		}
		return account;
	}
	
	public boolean remove(int number) {
		int index = -1;
		for (int i = 0; i < count; i++) {
			if(list[i].getAccountNumber() == number) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			for (int i = index; i < count - 1; i++) {
				list[i] = list[i + 1];
			}
			list[--count] = null;
			return true;
		}
		return false;
	}
	
	public boolean update(int number, String newName, AccountStatus newStatus) {
		Account account = null;
		for (int i = 0; i < count; i++) {
			if(list[i].getAccountNumber() == number) {
				account = list[i];
			}
		}
		if(account != null) {
			account.setAccountName(newName);
			account.setStatus(newStatus);
			return true;
		}
		return false;
	}
	
	public double calculateBalanceTotal() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += list[i].getBalance();
		}
		return sum / (count == 0 ? 1 : count);
	}
	
	public Account[] sort() {
		Account[] sorted = getList();
		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - 1 - i; j++) {
				boolean byNameAcs = sorted[j].getAccountName().compareTo(sorted[j + 1].getAccountName()) > 0;
				boolean byBalanceDesc = sorted[j].getAccountName().compareTo(sorted[j + 1].getAccountName()) == 0
						&& Double.compare(list[j].getBalance(), sorted[j + 1].getBalance()) < 0;
				if(byNameAcs || byBalanceDesc) {
					Account tmp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = tmp;
				}
			}
		}
		return sorted;
	}
}

