package exercise;

class Name_1{
	String surName = "��";
	String s1, s2;

	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "�� ������ " + s2);
	}
}

class Name_2 extends Name_1{
	String surName = "��";
	String s1, s2;

	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "�� ������ " + s2);
	}
}

class Name_3 extends Name_2{
	String s1, s2;
	//Name3�� surName�� ���ǵǾ����� �ʱ⶧���� Name_2�� surName�� �ҷ���
	
	public void print(String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
		System.out.println(surName + s1 + "�� ������ " + s2 + "3��°��");
	}
}

public class ex63_CastingTest {
	public static void main(String[] args) {
		String givenName_1 = "����";
		String givenName_2 = "����";
		String givenName_3 = "����";
		
		Name_1 n1 = new Name_1();
		Name_2 n2 = new Name_2();
		Name_3 n3 = new Name_3();
		
		n1.print(givenName_1, "�౸����");
		n3.print(givenName_3, "�߱�����");

		n1 = n3;				
//		n2 = (Name_2)n1;	// n1 = n3;�� �ּ�ó���ϸ� 
					// �������� �����ϳ� ��Ÿ�� ����.
		System.out.println("�� ������ ���� " + n1.surName);	
		n1.print(givenName_2, "��������");
		// ���� �� ���忡�� n1�� n2�� �ٲ㼭 ����� �� ��.
	}
}
