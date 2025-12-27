/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 2, 2025 8:10:18 PM
 */

package chuong4.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private List<Book> bookList;
	
	public Library() {
		this.bookList = new ArrayList<>();
	}
	
	private int getSize() {
		return bookList.size();
	}
	
	private List<Book> getList() {
		return bookList.subList(0, getSize());
	}
	
	public Book add(Book newBook) {
		if(newBook == null) return null;
		if(bookList.contains(newBook)) return null;
		bookList.add(newBook);
		return newBook;
	}
	
	public Book remove(String code) {
		for (int i = 0; i < getSize(); i++) {
			if(bookList.get(i).getCode().equalsIgnoreCase(code)) {
				return bookList.remove(i);
			}
		}
		return null;
	}
	
	public Book update(String code, double unitPrice, int quantity, BookStatus status) {
		for (int i = 0; i < getSize(); i++) {
			if(bookList.get(i).getCode().equalsIgnoreCase(code) 
					&& bookList.get(i) instanceof TextBook) {
				TextBook book = (TextBook) bookList.get(i);
				book.setUnitPrice(unitPrice);
				book.setQuantity(quantity);
				book.setStatus(status);
				return book;
			}
		}
		return null;
	}
	
	public Book update(String code, double unitPrice, int quantity, double tax) {
		for (int i = 0; i < getSize(); i++) {
			Book book =  bookList.get(i);
			if(book.getCode().equalsIgnoreCase(code) 
					&& book instanceof ReferenceBook b) {
				b.setUnitPrice(unitPrice);
				b.setQuantity(quantity);
				b.setTax(i);
				return b;
			}
		}
		return null;
	}
	
	public List<Book> find(String publisher) {
		return bookList.stream()
				.filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
//				.collect(Collectors.toList());
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public int getNumberOfBook() {
		return bookList.stream()
				.mapToInt(Book::getQuantity)
				.sum();
	}
	
	public double getAverageOfPrice() {
		return bookList.stream()
				.mapToDouble(Book::calculatePrice)
				.average()
				.getAsDouble();
	}
	
}

