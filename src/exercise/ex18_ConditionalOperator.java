package exercise;

public class ex18_ConditionalOperator {
	//throws --> �����ڰ� �ǵ��� �������� ���α׷��� �귯���� �� �� ����
    public static void main(String [] args) throws java.io.IOException {
		int a, b, c;
		int m = 0;
		
		//3���� ���� �Է½� �ٿ��� �Է�
		
		System.out.println("Enter three numbers : ");
		
		//System.in.read() --> ���ڴ����� �о����[�ѱ� ���� ���� �ΰ��� �ٿ��� �о����]
		a = System.in.read() - '0';
		
		b = System.in.read() - '0';
		
		c = System.in.read() - '0';
		m = (a > b) ? a : b;
		m = (m > c) ? m : c;
		System.out.println("The largest number = "+m);
	}
}
