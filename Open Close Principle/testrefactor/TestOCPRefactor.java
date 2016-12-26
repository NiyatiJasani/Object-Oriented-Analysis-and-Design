package ocp.testrefactor;

import ocp.refactor.HoliFestivalRate;
import ocp.refactor.IFestivalRate;
import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class TestOCPRefactor {
	public static void main(String[] args) {
		FixedDeposit f1 = new FixedDeposit("177h", 100000, 10, new HoliFestivalRate());
		System.out.println(f1.calculateRateOfInterest());
	
	}

}
