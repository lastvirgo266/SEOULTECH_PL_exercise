package exercise;

class One{
	int value;
	
	public One(){
		this(100);
	}
	
	public One(int value){
		this.value = value;
		Another.methodA(this);	
	}
}

class Another{
	static void methodA(One ins){
   	    System.out.println("�޼ҵ�A������ ��: " + ins.value);
	}
}

public class ex57_OneTest {
	
	public static void main(String args[]){
		One t1 = new One();
		System.out.println("�⺻ ��: " + t1.value);
		int value = Integer.parseInt("1");
	
		One t2 = new One(value);
		System.out.println("����ڰ� �Է��� ��: " + t2.value);
	}
	
}
