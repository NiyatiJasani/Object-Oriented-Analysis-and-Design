package com.aggregation.composition;

public class Product {
	private int productid;
	private String name;
	private double price;
	private double discount;

	public Product(int id, String name, double price, double disount) {
		this.productid = id;
		this.name = name;
		this.price = price;
		this.discount = disount;
	}

	public int getId() {
		return productid;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double calculateDiscountPrice() {
		return discount * price;
	}

	public double getDiscount() {
		return discount;

	}

	@Override
	public String toString() {
		return "ProductID:  " + this.productid+ " \nProductName:  "
	+ this.name+ " "+ " \nDiscount: " + this.discount + " \nProduct Price:  " +this.price;
	}

}
