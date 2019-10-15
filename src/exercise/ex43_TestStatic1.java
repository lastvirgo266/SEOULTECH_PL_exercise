package exercise;

class Static1{
	int instanceVariable = 10;
	
	//스태틱을 선언하면 메모리가 잡히고 접근할때마다 같은 공간에 접근함
	static int classVariable = 20;
	void instanceMethod(){
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}
	static void staticMethod(){
		// System.out.println(instanceVariable);
		// 클래스 메소드에는 클래스 변수(static)만이 사용 가능.
		System.out.println(classVariable);
		
		//인스턴스는 만들어 놓아야 호출이 가능해서 스태틱메서드에서는 인스턴스 메서드는 쓸수없다.
	}
}

public class ex43_TestStatic1 {
	public static void main(String[] args){
		Static1 st = new Static1();
		st.instanceMethod();
		st.staticMethod();
	}
}
