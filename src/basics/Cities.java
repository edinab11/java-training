package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and define array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"}; 
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		//Declare array 
		String[] countries;
		
		//Define array
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Canada";

		//Declare the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		// Do Loop: enters the loop THEN tests condition
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		// While Loop: tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			if (state == "Texas") {
				System.out.println("STATE found!"); 
				stateFound = true;
			}
			n++;
		}
		
		// For loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
