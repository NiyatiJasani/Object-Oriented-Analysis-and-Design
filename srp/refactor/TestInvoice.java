package srp.refactor;


import srp.refactor.test.InvoicePrinter;
import srp.refactor.Invoice;

public class TestInvoice {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Tom", 8000, 0.5f);
		
		InvoicePrinter i1 = new InvoicePrinter();
		 i1.print(invoice);
		
		
		
	}
	

  	
}
