import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String nome = "Eduardo";
		int idade = 24;
		double altura = 1.8150;
		double salario = 4000.0;
		
		System.out.println(nome + " tem " + idade + " anos, " + altura + " de altura e ganha R$ " + salario + ".");
		
		System.out.printf("%s tem %d anos, %.2f de altura e ganha R$ %.2f.\n", nome, idade, altura, salario);
		
	}

}
