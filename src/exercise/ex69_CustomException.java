package exercise;

class MyCustomException extends Exception {
	//�����ڸ� �������ָ��  
	public MyCustomException(String msg) {
	    super(msg);
	  }
	}

public class ex69_CustomException {
	  public static void throwsMycustomException() throws MyCustomException {
		    throw new MyCustomException("����� ���� ���� �߻� !");
		  }

		  public static void main(String args[]) {
		   try {
		     throwsMycustomException();
		    }
		    catch(RuntimeException e) {
		      System.out.println("==================================");
		      System.out.println("RuntimeException catched! ");
		      System.out.println(e + " ���� �߻�");
		    }
		    catch(MyCustomException e) {
		      System.out.println("==================================");
		      System.out.println("throwsMycustomException  catched! ");
		      System.out.println(e + " ���� �߻�");
		    }
		  }
}
