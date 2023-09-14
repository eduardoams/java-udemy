package entities;

import java.util.ArrayList;
import java.util.List;

public abstract class TaxPayer {
	
	private String name;
	private Double annualIncome;
	
	List<TaxPayer> list = new ArrayList<>();
	
	public TaxPayer() {}

	public TaxPayer(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax();

}
