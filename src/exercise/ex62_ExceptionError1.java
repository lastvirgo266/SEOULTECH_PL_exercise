package exercise;

public class ex62_ExceptionError1 {
	public static void main(String args[]) {
		 
		//����ó���� ���ܰ� �Ͼ���� �������� �ǵ��� �°� �귯 ������ �ϴ� ���� ������
		
		   try {
		      System.out.println("�Ű������� ���� �� ���� ��");
		      //int a = Integer.parseInt(args[0]);    // ���ڿ� ���� ������ ��ȯ
		      //int b = Integer.parseInt(args[1]);
		      
		      int a = 1;
		      int b = 0;
		      
		      System.out.println(" a = " + a + " b = " + b );
		      System.out.println(" a�� b�� ���� �� = " + (a/b) );
		      System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�.");
		    }
		    catch(ArithmeticException e) {
		      System.out.println("==================================");
		      System.out.println("ArithmeticException ó�� ��ƾ : ");
		      System.out.println(e + " ���� �߻�");
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("==================================");
		      System.out.println("ArrayIndexOutOfBoundsException ó�� ��ƾ");
		      System.out.println(e + " ���� �߻�");
		    }
		    catch(NumberFormatException e) {
		      System.out.println("==================================");
		      System.out.println("NumberFormatException ó�� ��ƾ");
		      System.out.println(e + " ���� �߻�");
		    }
		    finally {
		      System.out.println("==================================");
		      System.out.println("���� ó���� ������ finally ���� �����մϴ�");
		    }
		  }
}
