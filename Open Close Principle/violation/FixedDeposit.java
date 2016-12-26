package ocp.violation;

import ocp.refactor.IFestivalRate;

public class FixedDeposit {
	
	private String account;
	private double principle;
	private int years;
	private IFestivalRate festival;
	
	
	public FixedDeposit(String account, double principle, int years, IFestivalRate festival){
		this.account=account;
		this.principle=principle;
		this.years=years;
		this.festival=festival;
	}


	public String getAccount() {
		return account;
	}


	public double getPrinciple() {
		return principle;
	}


	public int getYears() {
		return years;
	}


	public IFestivalRate getfestival() {
		return festival;
	}
	
	public double calculateRateOfInterest(){
	
		return principle * years * festival.getRate();
	}
}
