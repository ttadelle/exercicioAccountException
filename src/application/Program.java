package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.Exceptions.AccountExceptions;


public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		
			System.out.println("Enter for account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Inital balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw Limit: ");
			double whithdrawLimit = sc.nextDouble();
			System.out.println();

			Account ac = new Account(number, holder, balance, whithdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
		try {
			ac.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", ac.getBalance()));
		}
			
	   catch (AccountExceptions e){
			System.out.println("Withdraw Error: "+e.getMessage());
		}
		
		sc.close();
	}

}
