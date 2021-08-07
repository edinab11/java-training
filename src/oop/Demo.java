package oop;
// write void to make a function

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	 void eat() {
		System.out.println(name + " is eating");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO create person
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@test.com";
		person1.phone = "7789902341";
		
		// Abstraction: you can call each function separately
		person1.walk();
		person1.eat();
		
		// Attributes, variables, adjectives
//		String name = "Joe";
//		String email = "joe@test.com";
//		String phone = "7789902341";
		
		// Action, activity, behavior
		//walking(name);
		
		// Binding attributes and properties together
		
	}
	// Enhance by adding functions
//	static void walking(String name) {
//		System.out.println(name + " is walking");
//	}
}
