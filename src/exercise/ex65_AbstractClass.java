package exercise;

abstract class Shape {   // �߻�Ŭ���� ����
	  abstract void draw();  // �����κ��� ���� �߻� �޼ҵ� ����
	}

	class Circle extends Shape {
	  void draw() {
	    System.out.println("���� �׸��� ���");
	  }
	}

	class Rectangle extends Shape {
	  void draw() {
	    System.out.println("�簢���� �׸��� ���");
	  }
	}

	class Triangle extends Shape {
	  void draw() {
	    System.out.println("�ﰢ���� �׸��� ���");
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
		    System.out.println("====��ü ����ȯ�� �������̵��� �̿�====");
		    Shape s = new Circle();    // ���� Ŭ������ ��ü�� ���� Ŭ������ 
					       // ��ü�� ����ȯ
		    s.draw();                  // draw() �޼ҵ� ȣ��
		    s = new Rectangle();
		    s.draw();                  // draw() �޼ҵ� ȣ�� 
		    s = new Triangle();
		    s.draw();                  // draw() �޼ҵ� ȣ��
		  }
}
