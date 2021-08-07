package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("46578912", 1000);
		BankAccount acc2 = new BankAccount("68764553", 2500);
		BankAccount acc3 = new BankAccount("87904366", 1400);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(190);
		acc1.payBill(80);
		acc1.accrue();
	}

}

class BankAccount implements Iinterest {
	// Properties of bank account
	
	private static int ID = 1001;        // Internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005678";
	private String SSN;
	private String name;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account created");
		this.SSN = SSN;
		ID++;
		System.out.println(ID);
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number :" + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		double interest = balance * rate/100;
		balance = balance + interest;
		showBalance();
	}

}