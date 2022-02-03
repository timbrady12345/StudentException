package com.hcl.exceptiontest.money;
import java.util.Scanner;

public class AtmMachine {
		
		public static void main(String args[]) throws InsufficientFunds {
			
			Scanner sc = new Scanner(System.in);
			BankAccount atm = new BankAccount();
			long funds = 0;
			long money;
			atm.setFunds(funds);
			
			String flag = "n";
			while(flag.charAt(0) != 'y'){
				try {
				System.out.print("Enter 1 to Deposit, 2 to Withdrawal");
				int interaction = sc.nextInt();
				if(interaction == 1) {
					System.out.print("How much money are you depositing? \n");
					money = sc.nextLong();
					funds += money;
					atm.setFunds(funds);
				}else {
					System.out.print("How much money are you taking out? \n");
					money = sc.nextLong();
					if(funds - money > 0) {
						funds -= money;
						atm.setFunds(funds);
					}else {
						throw new InsufficientFunds();
					}
				}
			}
				catch(InsufficientFunds ex) {
					System.out.println(ex);
				}
				finally {
					System.out.println("Current balance: " + atm.getFunds());
					System.out.print("Are you done? y/n: \n");
					flag = sc.next();
				}
			}
			sc.close();
		}
}
