package practice;

class P1 {
	String name="������";
	void print(){
	System.out.println("P1�� �̸� : "+name);
	}
}

class P2 extends P1 {
	String name="�̸���";
	void print(){
	System.out.println("P2�� �̸� : "+name);
	}
}

class P3 extends P2 {
	String name="�����";
	void print(){
	System.out.println("P3�� �̸� : "+name);
	}
}
public class CastTest {
	public static void main(String[] args) {
	P1 p1_1,p1_2;	P2 p2_1,p2_2;  P3 p3_1;	
	
	p1_1=new P3();
	p1_2=new P2();
	p2_1=new P2();
	p2_2=new P3();	
	
	// �θ�Ŭ�����δ� ������ ���� ����
	//p3_1=new P1();
	//p3_1 = new P2();
	//p2_1 = new P1();
	
	p2_1=p2_2;
	p2_1.print();
	System.out.println(p2_1.name);
	//P3, �̸���
	
	
	//�ٿ� ĳ������ �Ͼ���� ����ȯ�� �Ͼ
//	p2_1=(P2)p1_2; //���⼭ ������
//	p2_1.print();
//	System.out.println(p2_1.name);
	//P2, �̸���
	
	p1_1=p2_2;
	p1_1.print();
	System.out.println(p1_1.name);
	//P3, ������
	
	//��ĳ����
//	p2_2=(P3)p1_2;
//	System.out.println(p2_2.name);	
	//P3, �̸���
	
	}
	
}