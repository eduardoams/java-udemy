package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Eduardo", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Amanda", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		/*
		 * Suponha que, na classe BusinessAccount, a regra para saque seja realizar o
		 * saque normalmente da superclasse, e descontar mais 2.0.
		 */
		Account acc3 = new BusinessAccount(1003, "Miriam", 1000.0, 0.00);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
