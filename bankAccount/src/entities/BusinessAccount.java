package entities;

public class BusinessAccount extends Account {

	private String accountNumber = CreateID.newId();
	private Double loanLimit;

	public BusinessAccount(String holder, Double balance, Double loanLimit) {
		super(holder, balance);
		this.loanLimit = loanLimit;
	}

	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= this.loanLimit) {
			deposit(amount);
		} else {
			System.out.println("The loan value exeeds the limit!");
		}
	}
}
