/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 17, 2025 6:25:39 AM
 */

package chuong03.bai05;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		CompactDics cd1 = new CompactDics(123, "Title 1", 10, 123.32423);
		CompactDics cd2 = new CompactDics(110, "Title 2", 10, 130e3);
		CompactDics cd3 = new CompactDics(120, "Title 3", 10, 130e3);
		CompactDics cd4 = new CompactDics(123, "Title 4", 10, 123.32423);
		CompactDics cd5 = new CompactDics(111, "Title 5", 10, 123.32423);
		
		ManagerCD manager = new ManagerCD();
		System.out.println(manager.add(cd1));
		System.out.println(manager.add(cd2));
		System.out.println(manager.add(cd3));
		System.out.println(manager.add(cd4));
		System.out.println(manager.add(cd5));
		System.out.println("\n" + manager.getSize());
		Arrays.asList(manager.sortByTitleInDescending()).forEach(cd -> System.out.println(cd));
		Arrays.asList(manager.sortByPriceInAscending()).forEach(cd -> System.out.println(cd));
	}

}

