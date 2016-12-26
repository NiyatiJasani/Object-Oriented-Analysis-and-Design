package srp.violation.test;

import srp.violation.Invoice;

public class TestInovice {
	public static void main(String[] args) {
		Invoice person1 = new Invoice(1, "Tom", 8000, 0.5f);
		Invoice person2 = new Invoice(2, "Tim", 5000, 0.8f);

		person1.print();
		person2.print();
		
	}
	
	

}
