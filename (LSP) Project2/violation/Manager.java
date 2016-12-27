package lsp.violation;

import lsp.refactored.IEatable;

public class Manager implements IWorker, IEatable {
	
	public void work(){
		System.out.println("Manager works");
	}
	
	public void eat(){
		System.out.println("MAnager eats");
	}

}
