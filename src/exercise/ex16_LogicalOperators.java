package exercise;

public class ex16_LogicalOperators {
	public static void main(String[] args) {
		int x = 3, y = 5, z = 7;
		boolean b;
		
		b = x < y && y < z;
		/*
		 * x < y --> true
		 * y < z --> true
		 */
		System.out.println("Result = " + b);
		
		
		/*
		 * x == y --> false
		 * x < y --> true
		 * y >z --> false
		 */
		
		b = x == y || x < y && y > z;
		System.out.println("Result = " + b);
	}
}
