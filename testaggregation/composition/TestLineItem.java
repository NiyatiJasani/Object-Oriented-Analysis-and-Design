package com.testaggregation.composition;

import java.util.ArrayList;
import java.util.List;

import com.aggregation.composition.Customer;
import com.aggregation.composition.LineItem;
import com.aggregation.composition.Order;
import com.aggregation.composition.Product;

public class TestLineItem {
	public static void main(String[] args) {

		Product product1 = new Product(1, "S6", 50000.00, 10);
		Product product2 = new Product(2, "Iphone", 60000.00, 30);

		LineItem li1 = new LineItem(01, product1, 3);
		LineItem li2 = new LineItem(02, product2, 4);

		Order order1 = new Order(1);
		Order order2 = new Order(2);

		order1.add(li1);
		order2.add(li2);

		Customer c1 = new Customer(90, "Nia", "Berlin");
		Customer c2 = new Customer(01, "DJ", "Mumbai");

		c1.add(order1);
		c1.add(order2);
		c2.add(order2);

		printInvoiceDetails(c1);
		printInvoiceDetails(c2);

	}

	public static void printInvoiceDetails(Customer customerdetails) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(">>Cusotmer: >>>");
		System.out.println("Name is:  " + customerdetails.getName());
		System.out.println("Address: " + customerdetails.getAddress());
		List<Order> orders = customerdetails.getOrders();
		System.out.println("No.of orders: " + orders.size());
		for (Order ord : orders) {
			System.out.println(ord);
			List<LineItem> item = ord.getLineItem();
			System.out.println();
			for (LineItem itms : item) {
				System.out.println(itms);
				System.out.println(itms.getProduct());
				System.out.println("Total Bill " + customerdetails.getBilledPrice());
			}
		}

	}

}
