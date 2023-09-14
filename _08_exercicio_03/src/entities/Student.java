package entities;

public class Student {

	public String name;
	public double n1, n2, n3;
	
	public double nota() {
		return n1 + n2 + n3;
	}
	
	public String toString() {
		
		double nota = nota();
		double gradePercentage = 100 * 60 / 100.00;
		
		String result = String.format("%.2f", nota);
		
		if (nota >= gradePercentage) {
			result += "\nPASS";
		}
		else {
			result += "\nFAILED\n" + "MISSING " + String.format("%.2f", 100.00 - nota) + " POINTS";
		}
		
		return result;
		
	}
	
}
