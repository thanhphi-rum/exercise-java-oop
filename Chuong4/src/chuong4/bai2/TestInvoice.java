/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Nov 14, 2025 2:14:55 PM
 */

package chuong4.bai2;

public class TestInvoice {
    public static void main(String[] args) {

        Product p1 = new Product("sp4", "Nước tương", 8000);
        Product p2 = new Product("spl", "Gạo", 18000);
        Product p3 = new Product("sp3", "Đường", 10000);

        Order order = new Order(1, new java.util.Date());

        order.addLineItem(p1, 10);   // 10 chai nước tương
        order.addLineItem(p2, 5);    // 5kg gạo
        order.addLineItem(p3, 1);    // 1kg đường
        order.addLineItem(p2, 1);    // lặp lại mã 'spl'

        order.printInvoice();
    }
}


