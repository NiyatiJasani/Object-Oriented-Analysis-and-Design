package lsp.refactored;

import lsp.violation.IWorker;

public interface IWorkableEatable extends IEatable, IWorkable  {

	public void eat();
	public void work();

}
