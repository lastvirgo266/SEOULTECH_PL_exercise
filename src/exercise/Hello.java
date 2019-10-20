package exercise;

public class Hello {
	public static void main(String args[]) {
		System.out.println("Hello World");
		
		int x, y =2;
		String z;
		
		x = -25;
		x >>>= y;
		System.out.println(Integer.toBinaryString(x));
		
		x = 27;
		x >>= y;
		System.out.println(Integer.toBinaryString(x));
		
		
		x = 27;
		x >>>= y;
		System.out.println(Integer.toBinaryString(x));
		z = Integer.toBinaryString(x);
		System.out.println(x+y);
		System.out.print(x+y+z+y+x+y);
		
		
	}

}
