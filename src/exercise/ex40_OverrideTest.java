package exercise;

class Java{
	String teacher = "������ ������";
	public void print(String className){
		System.out.println(teacher + "�� " + className);
	}
}
class PL extends Java{
	@Override //�̰źٿ��ִ°� ����
	public void print(String className){
		System.out.println("Over ride" + teacher + "�� " + className);
	}
}

public class ex40_OverrideTest {
	public static void main(String[] args){
		String class_1 = "Java ����";
		String class_2 = "PL ����";
		Java j = new Java();
		PL p = new PL();
		j.print(class_1);
		p.print(class_2);
		System.out.println("===================");
		Java jp = new PL(); // �ڹٷ� �ص� PL��  �ɼ�����
		jp.print(class_2);
		
		//p = new Java(); //������
		//p = (PL) new Java(); //�̷��� ���� �ȳ�
		//p.print(class_2); // ������ ����Ǹ� ������
		
	}
}
