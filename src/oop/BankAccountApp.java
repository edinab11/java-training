package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acct1 = new BankAccount();

		acct1.accountNumber = "8907821";
		System.out.println(acct1.toString());
		BankAccount acct2 = new BankAccount("Chequing account", 1000);
		acct2.accountNumber = "7845932";
		
		BankAccount acct3 = new BankAccount("Savings Account", 5000);
		acct3.checkBalance();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount(); 
		cd1.balance = 3000;
		
		//With Encapsulation
		cd1.setName("Roger Hue");
		cd1.setSsn("5678329");
		cd1.setRate();
		cd1.increaseRate();
		
		System.out.println("Social Security Number:" + cd1.getSsn());
		
		System.out.println(cd1.getName());
		
		cd1.accountType = "CD Account";
		cd1.withdraw(600);
		System.out.println(cd1.toString());
	}

}
