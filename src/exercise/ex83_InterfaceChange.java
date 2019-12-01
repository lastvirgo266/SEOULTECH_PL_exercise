package exercise;

/*������ �������̽�
- �߻�Ŭ������ �����̳� �߻�Ŭ������ �޸� �������̽� ���� �Ϲ� �޼ҵ带 ������ �� ���� �����ΰ� ���� �߻�޼ҵ常 ����
- ���� ����� Public static final, �޼ҵ� ����� public abstract �� �����ڰ� �ڵ����� �����
- ��Ӱ� �޸� ��� �׸��� �޼ҵ��� ����ΰ� �����Ǿ� ���� �ʾ� �Ѱ��� Ŭ������ �������̽��� ��ȯ�Ͽ� �������� ����� ����
- ������ �޼ҵ带 ��� Ŭ������ �������̵� �Ͽ� ���*/

interface ex83_A {
	void method1();
	default void method2(){         //default Keyword�� �޼��带 ����.
		System.out.println("A's Method");     
	}
}
interface ex83_B {
	void method1();
	default void method2(){         //default Keyword�� �޼��带 ����.
		System.out.println("B's Method");     
	}
}
interface ex83_C {
	static final String message="Hello!   C's Static Method";
	static void print(){               //�������̽����� ���� �޼��� ����.
		System.out.println(message);
	}
}

//���߻���� ��ȣ�� --> ������ ���̾Ƹ��
public class ex83_InterfaceChange implements ex83_A, ex83_B{
	@Override                    //�Ϲ����� �߻� �޼��� ����.
	public void method1() {
		System.out.println("implemented method");		
	}
	
	@Override
	public void method2() {		             
		ex83_A.super.method2();            //A �������̽��� �޼��� ����.
		      //or
		ex83_B.super.method2();            //B �������̽��� �޼��� ����.
	}
	
	public static void main(String[] args){
		ex83_InterfaceChange ic = new ex83_InterfaceChange();
		ic.method1();
		ic.method2();
		ex83_C.print();          //�ν��Ͻ� ���� ���� ȣ�� ����.
	}     
}
