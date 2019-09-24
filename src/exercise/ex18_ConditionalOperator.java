package exercise;

public class ex18_ConditionalOperator {
	//throws --> 개발자가 의도한 방향으로 프로그램이 흘러가게 할 수 있음
    public static void main(String [] args) throws java.io.IOException {
		int a, b, c;
		int m = 0;
		
		//3개의 숫자 입력시 붙여서 입력
		
		System.out.println("Enter three numbers : ");
		
		//System.in.read() --> 문자단위로 읽어들임[한글 같은 경우는 두개를 붙여서 읽어버림]
		a = System.in.read() - '0';
		
		b = System.in.read() - '0';
		
		c = System.in.read() - '0';
		m = (a > b) ? a : b;
		m = (m > c) ? m : c;
		System.out.println("The largest number = "+m);
	}
}
