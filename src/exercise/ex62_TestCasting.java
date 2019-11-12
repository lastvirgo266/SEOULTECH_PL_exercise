package exercise;

class Acast {
	  int a=1;
	}
	class Bcast extends Acast {
	  int b=1;
	}
	class Ccast extends Bcast {
	  int c=3;
	}


public class ex62_TestCasting {
	  public static void main(String[] args) {
		    Acast refA;
		    refA = new Ccast();
		    /* Acast 타입의 객체 참조 변수 refA에 Ccast 클래스의 객체를
		       생성하여 할당 */
		    System.out.println("refA.a의 값은 "+ refA.a);
		  }
}
