package exercise;


class A {
	  private int result;
	  public int add(int x, int y) {
	    result = x + y;
	    return result;
	  }
	  public int subtraction(int x,int y) {
	    result = x - y;
	    return result;
	  }
}


	class B extends A {
	  private int result;
	  public int multi(int x,int y) {
	    result = x * y;
	    return result;
	  }
	  public int divide(int x,int y) {
	    result = x / y;
	    return result;
	  }
	}

public class ex36_TestAB {
	 public static void main(String args[]) {
		    int temp;
		    A objecta = new A();
		    B objectb = new B();
		    temp = objecta.add(10,20);
		    System.out.println("A의 add 수행결과" + temp);
		    temp = objectb.add(1,2);
		    System.out.println("B의 add 수행결과" + temp);
		    temp = objectb.multi(2,2);
		    System.out.println("B의 multi 수행결과" + temp);
		    //temp = objecta.multi(20,20);  //Error  발생
		    //temp = objectb.multi(20, 20);
		    System.out.println("A의 multi 수행결과" + temp);
		    
		    A new_obj = new B();
		    new_obj.add(20, 20);
		    
		    
		  }
}
