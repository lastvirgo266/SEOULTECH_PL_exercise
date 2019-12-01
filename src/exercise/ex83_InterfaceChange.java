package exercise;

/*기존의 인터페이스
- 추상클래스의 일종이나 추상클래스와 달리 인터페이스 내에 일반 메소드를 정의할 수 없고 구현부가 없는 추상메소드만 가능
- 변수 선언시 Public static final, 메소드 선언시 public abstract 의 제어자가 자동으로 선언됨
- 상속과 달리 상수 그리고 메소드의 선언부가 구현되어 있지 않아 한개의 클래스를 인터페이스를 전환하여 다중으로 상속이 가능
- 선언한 메소드를 상속 클래스가 오버라이딩 하여 사용*/

interface ex83_A {
	void method1();
	default void method2(){         //default Keyword로 메서드를 구현.
		System.out.println("A's Method");     
	}
}
interface ex83_B {
	void method1();
	default void method2(){         //default Keyword로 메서드를 구현.
		System.out.println("B's Method");     
	}
}
interface ex83_C {
	static final String message="Hello!   C's Static Method";
	static void print(){               //인터페이스에서 정적 메서드 구현.
		System.out.println(message);
	}
}

//다중상속의 모호성 --> 죽음의 다이아몬드
public class ex83_InterfaceChange implements ex83_A, ex83_B{
	@Override                    //일반적인 추상 메서드 구현.
	public void method1() {
		System.out.println("implemented method");		
	}
	
	@Override
	public void method2() {		             
		ex83_A.super.method2();            //A 인터페이스의 메서드 선택.
		      //or
		ex83_B.super.method2();            //B 인터페이스의 메서드 선택.
	}
	
	public static void main(String[] args){
		ex83_InterfaceChange ic = new ex83_InterfaceChange();
		ic.method1();
		ic.method2();
		ex83_C.print();          //인스턴스 생성 없이 호출 가능.
	}     
}
