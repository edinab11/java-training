package oop;

public class BankAccount implements IRate {
	// Define variables 
	String accountNumber;
	
	// static sets the value the same across the objects, and final does not allow override
	private static final String routingNumber = "0909090";
	// instance variables
	private String name;
	private String ssn;


	String accountType;
	double balance = 0;
	
	// Constructor definition: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no return type 
	BankAccount() {
		System.out.println("New Account");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType, double initDeposit) {
		System.out.println("Account is " + accountType);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Deposit is less than $1000";
		} else {
			Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance+initDeposit;
	}
	
	// Getters/Setters
	// Allow the user to define the name
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
		public void deposit(double amount) {
			balance = balance + amount;
			showActivity("Deposit");
		}
		 
		void withdraw(double amount) {
			balance = balance - amount; 
			showActivity("Withdraw");
		}
		
		void checkBalance() {
			System.out.println("Balance: $" + balance);
		}
		
		void getStatus() {
			
		}
		
		@Override 
		public String toString() {
			return "[" + name + "," + routingNumber + "]";
		}
		
		private void showActivity(String activity) {
			System.out.println("Showing recent activity..." + activity);
			System.out.println("Your new balance is " + balance);
		}
	}

