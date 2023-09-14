package entities;

// Quando "public final class SavingsAccount extends Account {", a linha abaixo não funciona
//public class SavingsAccountPlus extends Savings {
public class SavingsAccountPlus extends SavingsAccount {

	@Override
	// Quando "public final void withdraw(Double amount) {", a linha abaixo não funciona
	public void withdraw(Double amount) {
		balance -= amount + 2.0;
	}

}
