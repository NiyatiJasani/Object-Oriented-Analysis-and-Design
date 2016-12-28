package com.aggregation.composition;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerid;
	private String name;
	private String address;
	private List<Order> orders;

	public Customer(int id, String name, String address) {
		this.customerid = id;
		this.name = name;
		this.address = address;
		orders = new ArrayList<>();
	}

	public List<Order> getOrders() {
		return orders;
	}

	public int getId() {
		return customerid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getBilledPrice() {
		double totalbill = 0;
		for (Order ord : orders) {
			totalbill += ord.getCheckOutDetails();
		}
		return totalbill;
	}

	public void add(Order ordertype1) {
		orders.add(ordertype1);
	}

	@Override
	public String toString() {
		return " CustomerId: " + this.customerid + "Name: " + this.name + " " + "Address: " + this.address;
	}

}
