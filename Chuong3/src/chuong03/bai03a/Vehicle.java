/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Sep 22, 2025 7:49:13 PM
 */

package chuong03.bai03a;

import java.text.NumberFormat;
import java.util.Locale;

public class Vehicle {
	private String name;
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle() {
		this("nameless", "null", 0, 0.0);
	}
	public Vehicle(String name, String type, int capacity, double price) {
		setName(name);
		setType(type);
		setCapacity(capacity);
		setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		if(capacity <= 0) {
		capacity = 0;
		}
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price <= 0) {
			price = 0.0;
		}
		this.price = price;
	}
	
	public double calculateTax() {
		double tax;
		if(capacity < 100) {
			tax = price * 0.01;
		}
		else if(capacity <= 200) {
			tax = price * 0.03;
		}
		else {
			tax = price * 0.05;
		}
		return tax;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%-20s | %-10s | %15s | %15s | %15s |", 
				name, 
				type, 
				capacity, 
				nf.format(price), 
				nf.format(calculateTax()));
	}
}

