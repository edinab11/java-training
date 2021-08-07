package oop;

public class AStudentDb {
	private String name;
	private String SSN;
	private String newID;
	private static int ID = 90089;
	
	AStudentDb(String name, String SSN){
		this.SSN = SSN;
		this.name = name;
		System.out.println("My SSN is " + SSN);
	}
	
	public void UserID() {
		int randomNum = (int)(Math.random() * 1000);
		if (randomNum < 1000) {
			int rand = (int)(Math.random() * 100 + 1000);
			randomNum = rand;
		} else if (randomNum > 9000) {
			int random = (int)(9000 - Math.random() * 100); 
			randomNum = random;
		}
		newID = ID + "" + randomNum + SSN.substring(2, 6);
		System.out.println("Auto-generated UserID: " + newID);
	}
	
	public void enroll() {
		
	}
	
	public void checkBalance() {

	}
	
	public void setEmail() {
		String email = (name + "_" + ID + "@student.ca");
		System.out.println(email);
	}
}
