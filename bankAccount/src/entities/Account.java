package entities;

public class Account {

	private String accountNumber  = CreateID.newId();
	private String holder;
	protected Double balance;

	public Account(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getHolder() {
		return this.holder;
	}

	public Double getBalance() {
		return this.balance;
	}
	
	public void withDraw(double amount) {
		this.balance -= amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
