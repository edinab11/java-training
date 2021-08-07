package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of numbers is " + product);
	}
	static void printName() {
		System.out.println("my name is Tim");
	}
	
	
	static void addNumbers(int numberA, int numberB) {
		//Will add 2 numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product);
		return product;
	}
	
}
