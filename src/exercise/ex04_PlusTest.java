package exercise;

public class ex04_PlusTest {
	public static void main(String[] args) 
	{
		short a, b, c;
		a = 1;
		b = 2;
		//c = a+b;
		/*
		 	�� �ǿ����� �� �ϳ��� double ���̸� �ٸ� �ϳ��� double ������ ��ȯ�ϰ� ����� double���̴�.

			�׷��� �ʰ� �� �ǿ����� �� �ϳ��� float ���̸� �ٸ� �ϳ��� float ������ ��ȯ�ϰ� ����� float���̴�.

			�׷��� �ʰ� �� �ǿ����� �� �ϳ��� long ���̸� �ٸ� �ϳ��� long ������ ��ȯ�ϰ� ����� long���̴�.

			�׷��� �ʴٸ� �� �ǿ����ڸ� ��� int ������ ��ȯ�ϰ� ����� int ���̴�. <-- �߿���

		 */
		
		
		//compile error - ����� �ڵ����� int�� promotion�� �Ͼ
		c = (short)(a+b);
		System.out.println(c);
		
		
		
		
		
	}
}
