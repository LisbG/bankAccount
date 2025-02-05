package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Application {
	
	public static void main(String[] args) {
		
		Account baseAccount = new Account("Gabriel", 20.000);
		BusinessAccount ba = new BusinessAccount("Gabriel", 20.000, 1.000);
		SavingsAccount sa = new SavingsAccount(baseAccount.getHolder(), 5.000, 1.5);
		
		// Upcasting
		
		Account accountBusiness = new BusinessAccount("Maisa", 40.000, 2.000);	
		
		// Downcasting
		
		if (sa instanceof SavingsAccount) {
			System.out.println("Variable sa are instance of SavingAccounts");
		}
	}

}
