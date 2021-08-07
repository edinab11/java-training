package basics;

public class Assignment1 {

//	public static void main(String[] args) {
//		// int n
//		// sum(0) = 0
//		// sum(1) = 1 or sum(0) + (n)
//		// sum(2) = sum(2-1) + n
//		// sum(3) = sum(3-1) + n
//		// sum(4) = sum(4-1) + n
//		System.out.println(sum(4));
//	}
//	
//	public static int sum(int n) {
//		if(n == 0) {
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		}
//		return (sum(n-1) + (n));
//	}
	
	public static void main(String[] args) {
		 //int x;
		 //0! = 1
		 //x! = x*(x-1)!
		
		System.out.println(fact(0));
	
	}
	
	public static int fact(int x) {
		if(x == 0) {
			return 1;
		}
		
		int fact = 1, i = 1;
		
		for (i = 1; i <= x; i++) { 
			fact = i * fact; 
		}
		return(fact);
	}
}

//		public static void main(String[] args) {
//			
//			int values[] = new int[] { 24, 16, 60, 11, 19 };
//			
//			int MaxNum = MaxCalc(values);
//			int MinNum = MinCalc(values);
//			int AvgNum = AvgCalc(values);
//			
//					
//			System.out.println("Max Number is: " + MaxNum);
//			System.out.println("Min Number is: " + MinNum);
//			System.out.println("Average is: " + AvgNum);
//		}
//		
//		public static int MaxCalc(int[] valuesarray) {
//			int MaxNumber = valuesarray[0];
//			for(int i=1; i < valuesarray.length; i++) {
//				if (valuesarray[i] > MaxNumber) {
//					MaxNumber = valuesarray[i];
//				}
//			}
//			return MaxNumber;
//	}
//
//		public static int MinCalc(int[] valuesarray) {
//			int MinNumber = valuesarray[0];
//			for(int i=1; i < valuesarray.length; i++) {
//				if (valuesarray[i] < MinNumber) {
//					MinNumber = valuesarray[i];
//				}
//			}
//			return MinNumber;
//	}
//		
//		public static int AvgCalc(int[] valuesarray) {
//			int AvgNumber = valuesarray[0];
//			for(int i=1; i < valuesarray.length; i++) {
//					AvgNumber = AvgNumber + valuesarray[i];
//				}
//			return (AvgNumber/valuesarray.length);
//		}
//	}