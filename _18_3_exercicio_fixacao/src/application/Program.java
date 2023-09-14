package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		/*
		 * Uma empresa deseja automatizar o processamento de seus contratos. O
		 * processamento de um contrato consiste em gerar as parcelas a serem pagas para
		 * aquele contrato, com base no número de meses desejado. A empresa utiliza um
		 * serviço de pagamento online para realizar o pagamento das parcelas. Os
		 * serviços de pagamento online tipicamente cobram um juro mensal, bem como uma
		 * taxa por pagamento. Por enquanto, o serviço contratado pela empresa é o do
		 * Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de
		 * pagamento de 2%. Fazer um programa para ler os dados de um contrato (número
		 * do contrato, data do contrato, e valor total do contrato). Em seguida, o
		 * programa deve ler o número de meses para parcelamento do contrato, e daí
		 * gerar os registros de parcelas a serem pagas (data e valor), sendo a primeira
		 * parcela a ser paga um mês após a data do contrato, a segunda parcela dois
		 * meses após o contrato e assim por diante. Mostrar os dados das parcelas na
		 * tela.
		 * https://github.com/acenelio/interfaces4-java
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int installments = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, installments);
		
		System.out.println();
		System.out.println("PARCELAS:");
		contract.getInstallments().forEach(i -> System.out.println(i));
		
		/*
		 * for (Installment i : contract.getInstallments()) { System.out.println(i); }
		 */
		
		sc.close();
		
	}

}
