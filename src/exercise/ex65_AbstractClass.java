package exercise;

abstract class Shape {   // 추상클래스 선언
	  abstract void draw();  // 구현부분이 없는 추상 메소드 정의
	}

	class Circle extends Shape {
	  void draw() {
	    System.out.println("원을 그리는 기능");
	  }
	}

	class Rectangle extends Shape {
	  void draw() {
	    System.out.println("사각형을 그리는 기능");
	  }
	}

	class Triangle extends Shape {
	  void draw() {
	    System.out.println("삼각형을 그리는 기능");
	  }
	}

	
	
public class ex65_AbstractClass {
	 public static void main(String args[]) {
		    Circle c = new Circle();
		    c.draw();
		    Rectangle r = new Rectangle();
		    r.draw();
		    Triangle t = new Triangle();
		    t.draw();
		    System.out.println("====객체 형변환과 오버라이딩을 이용====");
		    Shape s = new Circle();    // 상위 클래스의 객체에 하위 클래스의 
					       // 객체를 형변환
		    s.draw();                  // draw() 메소드 호출
		    s = new Rectangle();
		    s.draw();                  // draw() 메소드 호출 
		    s = new Triangle();
		    s.draw();                  // draw() 메소드 호출
		  }
}
