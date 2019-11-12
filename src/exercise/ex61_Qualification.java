package exercise;

public class ex61_Qualification {
	public static double a =10.0, b = 20.0;
	  public ex61_Qualification() {
	    new now();
	  }
	  
	    class now extends Object {
	      public double b = 30.0, c = 40.0;
	      public now() {
	        b = a;
	        c = ex61_Qualification.b;
	        System.out.println("b = "+b);
	        System.out.println("c = "+c);
	      }
	  }
	   public static void main (String args[]) {
	    new ex61_Qualification();
	  }
}
