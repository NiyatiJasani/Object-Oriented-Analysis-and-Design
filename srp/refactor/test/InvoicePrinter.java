package srp.refactor.test;

import srp.refactor.Invoice;

public class InvoicePrinter {
	public void print(Invoice invoice) {
		System.out.println("ID: " + invoice.getId());
		System.out.println("Name: " + invoice.getName());
		System.out.println("Discount:" + invoice.calculateDiscountCost());
		System.out.println("Tax:" + invoice.calculateTax());
		System.out.println("TotalCost " + invoice.claculateTotalCost());
	}

}
