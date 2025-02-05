package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Application {
	
	public static void main(String[] args) {
		
		Account baseAccount = new Account("Gabriel", 20.000);
		BusinessAccount ba = new BusinessAccount("Gabriel", 20.000, 1.000);
		SavingsAccount sa = new SavingsAccount(baseAccount.getHolder(), 5.000, 1.5);
		
		System.out.println(baseAccount.getAccountNumber());
		System.out.println(ba.getAccountNumber());
		System.out.println(sa.getAccountNumber());
	}

}
