package entities;

public class SavingsAccount extends Account {

	private String accountNumber = CreateID.newId();
	private Double interestRate;

	public SavingsAccount(String holder, Double balance, Double interestRate) {
		super(holder, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void updateBalance() {
		balance += (balance * interestRate);
	}

}
