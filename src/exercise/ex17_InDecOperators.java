package exercise;

public class ex17_InDecOperators {
	public static void main(String[] args) {
		int x = 3, y = 5;
		int a, b;
		
		++x; --y;
		System.out.println("x = " + x + " , y = " + y);
		
		a = (++x) + 1;
		System.out.println("x = " + x + " , a = " + a);
		
		b = (y++) + 1; // (���⼭ y�� ���� 4��)
		// �� ���ĺ��� y�� ���� 5��
		System.out.println("y = " + y + " , b = "+ b);
		System.out.println("b = " + b);
		
		
		/*
		 * ���� �����ڰ� ���������ں��� �ӵ� �� �� ����
		 * ---> ���������ڰ� �����ؼ� �Ͼ�� ������ �� ����
		 * 
		 * �Ʒ��� ������
		 * ++x func(){ return x+1; }
		 * x++ func(){int a = new int; a = x+1 return a;}
		 */
	}
}
