package lsp.refactored;

import java.awt.Robot;

import lsp.violation.IWorker;
import lsp.violation.Manager;

public class TestIWorker {
	
	public static void main(String[] args) {
		
		atTheCafeteria(new Manager());
	
	}

	public static void atTheCafeteria(IEatable eatable){
		System.out.println("At the cafeteria eating");
		eatable.eat();
	}
	
}
