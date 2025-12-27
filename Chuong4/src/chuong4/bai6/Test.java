/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 8:39:13 PM
 */

package chuong4.bai6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		

		String headerLine = String.format("%5s | %15s | %15s | %15s | %15s | %s",
				"Code", "Unit price", "Quantity", "Import Date", "Publisher", "Note");

		List<Book> books = generateSampleData();
		
		System.out.println(headerLine + "\n" + "-".repeat(80));
		Library library = new Library();		
		for (Book book : books) {
			System.out.println(library.add(book));
		}
		System.out.println("Sum: " + library.getNumberOfBook());
		System.out.println("Avg: " + library.getAverageOfPrice());
		library.find("kim dong").forEach(System.out::println);;
	}
	
	private static List<Book> generateSampleData() {
		List<Book> books = new ArrayList<>();
		Book book1 = new TextBook("001", LocalDate.of(2025, 5, 25), 87e3, 5, "Kim Dong", BookStatus.NEW);
		Book book2 = new ReferenceBook("101", LocalDate.of(2024, 6, 12), 80e3, 2,  "Tre", 10e3);
		Book book3 = new TextBook("011", LocalDate.of(2025, 7, 10), 50e3, 4,  "Nha Nam", BookStatus.OLD);
		Book book4 = new TextBook("071", LocalDate.of(2024, 5, 15), 45e3, 6,  "Tre", BookStatus.NEW);
		Book book5 = new TextBook("106", LocalDate.of(2024, 8, 7), 78e3, 10,  "Kim Dong", BookStatus.OLD);
		Book book6 = new ReferenceBook("092", LocalDate.of(2025, 12, 10), 91e3, 2,  "Giao Duc", 13e3);
		Book book7 = new ReferenceBook("102", LocalDate.of(2025, 11, 19), 82e3, 3,  "Nha Nam", 8e3);
		Book book8 = new TextBook("102", LocalDate.of(2025, 10, 19), 82e3, 3,  "Nha Nam", BookStatus.NEW);
		Book book9 = new ReferenceBook("082", LocalDate.of(2024, 1, 5), 77e3, 9,  "Tre", 7e3);
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		return books;
	}

}



