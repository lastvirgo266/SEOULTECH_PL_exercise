package exercise;

class Overload2 {

	  void test() {
	    System.out.println("매개변수 없음");
	  }
	  void test(int a, int b) {
	    System.out.println("매개변수 int " + a 
	                             + "와 int " + b);
	  }
	  void test(double a) {
	    System.out.println("매개변수 double " + a);
	  }
	}


public class ex39_OverloadDemo2 {
	  public static void main(String args[]) {
		    Overload2 ob = new Overload2();
		    int i = 88;
		    ob.test(); 
		    ob.test(10, 20);
		    ob.test(i);   	
		    // 자동형변환을 거쳐 void test(double a)를 실행 
		    ob.test(123.2); 
		  }
}
