package com.abes;

public class Java {
	

import experiment10.BankAccount;
import experiment10.CurrentAccount;
import experiment10.SavingsAccount;

// Abstract class
	abstract class BankAccount {
		int accountNumber;
		String accountHolderName;
		double balance;

		// Constructor
		BankAccount(int accountNumber, String accountHolderName, double balance) {
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.balance = balance;
		}

		// Deposit Method
		void deposit(double amount) {
			balance = balance + amount;
			System.out.println("Amount Deposited: " + amount);
		}

		// Display Account Details
		void displayDetails() {
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Account Holder Name: " + accountHolderName);
			System.out.println("Balance: " + balance);
		}

		// Abstract Method
		abstract void calculateInterest();
	}

	

		void calculateInterest() {
			double interest = balance * 0.02; // 2% interest
			System.out.println("Current Account Interest: " + interest);
		}
	}

	 // Main class
	public class Experiment10 {
		public static void main(String[] args) {
	 // Creating objects 
			SavingsAccount sa = new SavingsAccount(101, "Rahul", 10000);
			CurrentAccount ca = new CurrentAccount(102, "Anita", 20000); 
			System.out.println("----- Savings Account -----");
			sa.deposit(2000);
			sa.displayDetails();
			sa.calculateInterest();
			System.out.println();
			System.out.println("----- Current Account -----");
			ca.deposit(3000); 
			ca.displayDetails();
			ca.calculateInterest();
			} 
		}
		
}
