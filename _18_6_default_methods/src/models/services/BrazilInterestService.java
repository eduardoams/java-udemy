package models.services;

public class BrazilInterestService {
	
	private Double interestRate;
	
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}


	public Double payment(Double amount, Integer months) {
		
		return amount * Math.pow((1.0 + interestRate / 100), months);
	}

}
