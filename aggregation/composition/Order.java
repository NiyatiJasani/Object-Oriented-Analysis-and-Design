package com.aggregation.composition;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int id;
	private List<LineItem> item;

	public Order(int id) {
		this.id = id;
		item = new ArrayList<LineItem>();
	}

	public List<LineItem> getLineItem() {
		return item;
	}

	public int getId() {
		return id;
	}

	public void add(LineItem itemtype) {
		item.add(itemtype);
	}

	public double getCheckOutDetails() {
		double checkoutprice = 0;
		for (LineItem itemtype : item) {
			checkoutprice += itemtype.calculateTotalPrice();
		}
		return checkoutprice;
	}

	@Override
	public String toString() {
		return "Id: " + this.id;
	}

}
