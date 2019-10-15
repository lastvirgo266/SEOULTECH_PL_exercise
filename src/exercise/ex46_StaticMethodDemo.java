package exercise;

class Box1 {
	  int width;
	  int height;
	  int depth;
	  long idNum;
	  static long boxID = 100;
	  
	  static long getcurrentID() {  // 클래스 메소드는 클래스 변수만 사용
	    return boxID++;
	  }
	  
	}

public class ex46_StaticMethodDemo {
	  public static void main(String args[]) {
		    Box1 mybox1 = new Box1();
		    mybox1.idNum = Box1.getcurrentID();  // 클래스 명을 통하여 메소드 사용
		    Box1 mybox2 = new Box1();
		    mybox2.idNum = Box1.getcurrentID();
		    System.out.println("mybox1의 id 번호 : " + mybox1.idNum);
		    System.out.println("mybox2의 id 번호 : " + mybox2.idNum);
		    //스태틱 메서드는 인스턴스 선언안해도 따로 선언가능
		    System.out.println("다음 박스의 번호는 "+ Box1.boxID + "번 입니다.");
		  } 
}
