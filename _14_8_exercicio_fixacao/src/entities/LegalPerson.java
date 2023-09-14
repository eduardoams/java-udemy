package entities;

public class LegalPerson extends TaxPayer {
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double tax() {
		return numberOfEmployees > 10 ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;
	}

}
