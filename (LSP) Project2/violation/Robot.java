package lsp.violation;

public class Robot implements IWorker {

	public void work() {
		System.out.println("Manager works");
	}

	public void eat() {
		throw new RuntimeException("Robot does not eat");
	}

}
