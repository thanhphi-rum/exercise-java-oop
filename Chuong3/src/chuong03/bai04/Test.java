/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 24, 2025 9:04:31 AM
 */

package chuong03.bai04;

public class Test {
	public static void main(String[] args) {
//		Account acc0 = new Account(120, "", 100e3, AccountStatus.ACTIVE);
		Account acc1 = new Account(120, "Phạm Thanh Phong", 100e3, AccountStatus.ACTIVE);
		Account acc2 = new Account(124, "Diệp Tùng Lâm", 50e3, AccountStatus.CLOSED);
		Account acc3 = new Account(121, "La Phong", 70e3, AccountStatus.ACTIVE);
		Account acc4 = new Account(122, "Trịnh Hào Kiệt", 80e3, AccountStatus.INACTIVE);
		Account acc5 = new Account(121, "Hoàng Nhất Viết", 90e3, AccountStatus.ACTIVE);
		Account acc6 = new Account(129, "Ngô Sỹ Anh", 101e3, AccountStatus.INACTIVE);
		Account acc7 = new Account(127, "Nguyễn Văn Long", 120e3, AccountStatus.INACTIVE);
		Account acc8 = new Account(126, "Trương Chân Như", 110e3, AccountStatus.CLOSED);
		Account acc9 = new Account(130, "Diệp Tùng Lâm", 100e3, AccountStatus.CLOSED);
		
		String headerLine = String.format("%6s | %20s | %15s | %15s | %s",
				"No.", "Name", "Balance", "Status", "Note");
		
		AccountList list = new AccountList(5);
		System.out.println("Count: " + list.getCount());
		System.out.println(headerLine +"\n" + "-".repeat(80));
		System.out.println(list.add(acc1));
		System.out.println(list.add(acc2));
		System.out.println(list.add(acc3));
		System.out.println(list.add(acc4));
		System.out.println(list.add(acc5));
		System.out.println(list.add(acc6));
		System.out.println(list.add(acc7));
		System.out.println(list.add(acc8));
		System.out.println(list.add(acc9));
		System.out.println("Count: " + list.getCount());
		
		System.out.println("\n\n" + headerLine +"\n" + "-".repeat(80));
		for (Account a: list.sort()) {
			System.out.println(a);
		}
		
		System.out.println("Find success: " + list.find(127));
		System.out.println("Find failure: " + list.find(131));
		
		System.out.println("Remove success: " + list.remove(129));
		System.out.println(headerLine +"\n" + "-".repeat(80));
		for (Account a: list.getList()) {
			System.out.println(a);
		}
		System.out.println(list.getCount());
		System.out.println("Remove failure: " + list.remove(32));
	}
}

