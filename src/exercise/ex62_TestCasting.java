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
		    /* Acast Ÿ���� ��ü ���� ���� refA�� Ccast Ŭ������ ��ü��
		       �����Ͽ� �Ҵ� */
		    System.out.println("refA.a�� ���� "+ refA.a);
		  }
}
