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
   	    System.out.println("메소드A에서의 값: " + ins.value);
	}
}

public class ex57_OneTest {
	
	public static void main(String args[]){
		One t1 = new One();
		System.out.println("기본 값: " + t1.value);
		int value = Integer.parseInt("1");
	
		One t2 = new One(value);
		System.out.println("사용자가 입력한 값: " + t2.value);
	}
	
}
