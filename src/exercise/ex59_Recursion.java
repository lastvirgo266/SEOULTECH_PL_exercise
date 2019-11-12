package exercise;

public class ex59_Recursion {
	  public static void main(String args[]) {
		  int m, k, c;
	   	m = 2;
		  for(k =0;k<=10; k++){
		   	c = power(m, k);
		   	System.out.println(""+m+"^"+k+"="+c);
	    	}		
	  }
	  public static int power(int x, int y) {
	    	return ((y==0) ? 1: x* power(x, y-1));
	  }
}
