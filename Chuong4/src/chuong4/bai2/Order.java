/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 1:57:01 PM
 */

package chuong4.bai2;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Order {
	private int orderId;
	private Date orderDate;
	private List<OrderDetail> lineItems;
	
	public Order(int orderId, Date date) {
		this.orderId = orderId;
		this.orderDate = date;
		this.lineItems = new ArrayList<>();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		if(orderId < 0) {
			throw new IllegalArgumentException("OrderId not < 0");
		}
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		if(orderDate == null) {
			throw new IllegalArgumentException("OrderDate not null");
		}
		this.orderDate = orderDate;
	}
	
	public void addLineItem(Product p, int q) {
		OrderDetail orderDetail = new OrderDetail(p, q);
		lineItems.add(orderDetail);
	}
	
	public double calcTotalCharge() {
		double sum = 0;
		for (OrderDetail orderDetail : lineItems) {
			sum += orderDetail.calcTotalPrice();
		}
		return sum;
	}
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		return String.format("%s | %10s | %10s | %10s", 
				super.toString(), 
				orderId, 
				orderDate,
				nf.format(calcTotalCharge())
				);
	}
	
	public void printInvoice() {
	    System.out.println("Mã HD: " + orderId);
	    System.out.println("Ngày lập hóa đơn: " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(orderDate));
	    System.out.println();

	    System.out.printf("%-5s| %-6s| %-15s| %-10s| %-8s| %-15s\n",
	            "STT", "Mã SP", "Mô tả", "Đơn giá", "S Lượng", "Thành tiền");

	    int stt = 1;
	    for (OrderDetail d : lineItems) {
	        Product p = d.getProduct();

	        System.out.printf("%-5d| %-6s| %-15s| %,10.0f| %,8d| %,15.0f VND\n",
	                stt++,
	                p.getProductId(),
	                p.getDescription(),
	                p.getPrice(),
	                d.getQuantity(),
	                d.calcTotalPrice());
	    }

	    System.out.println("\nTổng tiền thanh toán: " +
	            String.format("%,d VND", (int) calcTotalCharge()));
	}

}

