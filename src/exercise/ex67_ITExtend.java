package exercise;


interface A3 {
	  void ameth1();
	  void ameth2();
	}

interface B3 {
	  void bmeth1();
}


interface C3 extends A3,B3 {  // �ΰ��� �������̽� ���
	  void cmeth1();
}

class InterfaceClass implements C3 {
	  public void ameth1() {
	    System.out.println("ameth1() �޼ҵ��� ����");
	  }

	  public void ameth2() {
	    System.out.println("ameth2() �޼ҵ��� ����");
	  }

	  public void bmeth1() {
	    System.out.println("bmeth1() �޼ҵ��� ����");
	  }
	  public void cmeth1() {
	    System.out.println("cmeth1() �޼ҵ��� ����");
	  }
}

public class ex67_ITExtend {
	 public static void main(String arg[]) {
		    InterfaceClass ic = new InterfaceClass();

		    ic.ameth1();
		    ic.ameth2();
		    ic.bmeth1();
		    ic.cmeth1();
		  }
}
