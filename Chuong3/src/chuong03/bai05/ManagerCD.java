/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 17, 2025 6:25:23 AM
 */

package chuong03.bai05;

import java.util.Arrays;

public class ManagerCD {
	private CompactDics[] list;
	private int size = 0;
	
	public ManagerCD() {
		this(10);
	}
	
	public ManagerCD(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity of Array > 0");
		}
		this.list = new CompactDics[capacity];
	}
	
	public CompactDics add(CompactDics cd) {
		if(Arrays.asList(list).contains(cd)) {
			return null;
		}
		if(list.length == size) {
			Arrays.copyOf(list, (int)(size * 1.2));
		}
		list[size++] = cd;
		return cd;
	}
	
	public CompactDics[] getList() {
		return Arrays.copyOf(list, size);
	}
	
	public int getSize() {
		return size;
	}
	
	public double calculatePriceTotal() {
		return Arrays.asList(Arrays.copyOf(list, size))
				.stream().mapToDouble(CompactDics::getPrice).sum();
	}
	
	public CompactDics[] sortByTitleInDescending() {
		CompactDics[] sorted = Arrays.copyOf(list, size);
		Arrays.sort(
				sorted, (x, y)-> y.getTitle().compareTo(x.getTitle()));
		return sorted;
	}

	public CompactDics[] sortByPriceInAscending() {
		CompactDics[] sorted = Arrays.copyOf(list, size);
		Arrays.sort(sorted, (cd1, cd2) -> Double.compare(cd1.getPrice(), cd2.getPrice()));
		return sorted;
	}
}

