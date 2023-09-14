package entities;

public class PhysicalPerson extends TaxPayer {
	
	private Double healthExpenses;
	
	public PhysicalPerson () {
		super();
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	public double tax() {
		
		double income = getAnnualIncome();
		double tax = income > 20000.00 ? income * 0.25 : income * 0.15;
		
		return healthExpenses > 0.0 ? tax - (healthExpenses * 0.5) : tax;
	}

}
