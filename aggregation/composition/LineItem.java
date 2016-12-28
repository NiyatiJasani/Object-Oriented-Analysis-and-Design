package com.aggregation.composition;

public class LineItem {

	private int productid;
	private int quantity;
	private Product product;

	public LineItem(int id, Product product, int quantity) {
		this.productid = id;
		this.product = product;
		this.quantity = quantity;
	}

	public int getId() {
		return productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public double calculateTotalPrice() {
		return quantity * product.calculateDiscountPrice();
	}
	public Product getProduct(){
		return product;
	}
	@Override
	public String toString() {
		return "Quantity: " + this.quantity;
	}

}
