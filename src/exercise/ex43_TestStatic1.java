package exercise;

class Static1{
	int instanceVariable = 10;
	
	//����ƽ�� �����ϸ� �޸𸮰� ������ �����Ҷ����� ���� ������ ������
	static int classVariable = 20;
	void instanceMethod(){
		System.out.println(instanceVariable);
		System.out.println(classVariable);
	}
	static void staticMethod(){
		// System.out.println(instanceVariable);
		// Ŭ���� �޼ҵ忡�� Ŭ���� ����(static)���� ��� ����.
		System.out.println(classVariable);
		
		//�ν��Ͻ��� ����� ���ƾ� ȣ���� �����ؼ� ����ƽ�޼��忡���� �ν��Ͻ� �޼���� ��������.
	}
}

public class ex43_TestStatic1 {
	public static void main(String[] args){
		Static1 st = new Static1();
		st.instanceMethod();
		st.staticMethod();
	}
}
