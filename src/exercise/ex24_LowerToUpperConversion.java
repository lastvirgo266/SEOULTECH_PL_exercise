package exercise;

public class ex24_LowerToUpperConversion {
	public static void main(String[] args) throws java.io.IOException {
		char c;
		int x;	
		System.out.print("Enter the lower char = ");
		c = (char) System.in.read();
		if (c >= 'a' && c <= 'z')
			x = c + ('A' - 'a');
		else x = c;
		System.out.println("Upper char of  "+ c + " = "+(char) x);
	}
}
