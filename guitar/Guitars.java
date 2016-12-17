package com.tech.guitar;

import java.util.Iterator;
import java.util.LinkedList;

public class Guitars {

	private String serialNumber;
	private double price;
	private GuitarSpec spec;

	public Guitars(String serialNumber, double price, int numStrings, GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public GuitarSpec getSpec() {
		return spec;
	}

}
